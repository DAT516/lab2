package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import src.Car;
import src.Garage;
import src.Saab95;
import src.Volvo240;

import static org.junit.jupiter.api.Assertions.*;

class GarageTest {

    @Test
    void addCar() {
        Saab95 saabCar = new Saab95();
        Garage<Saab95> saabGarage = new Garage<>(5);

        saabGarage.addCar(saabCar);
        assertTrue(saabGarage.carInGarage(saabCar));
    }

    @Test
    void removeCar() {
        Saab95 saabCar = new Saab95();
        Garage<Saab95> saabGarage = new Garage<>(5);

        saabGarage.addCar(saabCar);
        saabGarage.removeCar(saabCar);
        assertFalse(saabGarage.carInGarage(saabCar));
    }


    // @Test
    // void generalGarage(){
    //     try{
    //     Saab95 saabCar = new Saab95();
    //     Volvo240 volvoCar = new Volvo240();
    //     Garage<Saab95> saabGarage = new Garage<>(5);

    //     saabGarage.addCar(saabCar);
    //     saabGarage.addCar(volvoCar);

    //     fail();
    //     }
    //     catch(Exception e){
    //         assertTrue(true);
    //     }
    // }

//     @Test
//     void removeCar2(){
//         Saab95 saabCar = new Saab95();
//         Volvo240 volvoCar = new Volvo240();
//         Garage<Car> generalGarage = new Garage<>(5);

//         generalGarage.addCar(saabCar);
//         generalGarage.addCar(volvoCar);
        
//         assertTrue(generalGarage.carInGarage(saabCar) && generalGarage.carInGarage(volvoCar));
//     }

}