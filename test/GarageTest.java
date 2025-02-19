package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import src.*;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class GarageTest {

    private Volvo240 volvo;
    private Saab95 saab;

    @BeforeEach
    public void setUp(){
        volvo = new Volvo240(4, 1, Color.BLACK, 5, 20, 1.5);
        saab = new Saab95(4, 1, Color.BLACK, 5, 20, 1.5);
    }



    @Test
    @DisplayName("add car")
    void addCar() {
        Garage<Saab95> saabGarage = new Garage<>(5);

        saabGarage.addCar(saab);
        assertTrue(saabGarage.carInGarage(saab));
    }

    @Test
    void removeCar() {
        Garage<Saab95> saabGarage = new Garage<>(5);

        saabGarage.addCar(saab);
        saabGarage.removeCar(saab);
        assertFalse(saabGarage.carInGarage(saab));
    }


     @Test
     void removeCar2(){

         Garage<Car> generalGarage = new Garage<>(5);

         generalGarage.addCar(saab);
         generalGarage.addCar(volvo);
        
         assertTrue(generalGarage.carInGarage(saab) && generalGarage.carInGarage(volvo));
     }

}