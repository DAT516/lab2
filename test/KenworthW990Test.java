package test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import src.Car;
import src.KenworthW990;
import src.Saab95;
import src.Volvo240;

import java.awt.*;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class KenworthW990Test {

    private KenworthW990 truck;
    private Volvo240 volvo;
    private Saab95 saab;

    @BeforeEach
    public void setUp(){
        truck = new KenworthW990(Color.BLUE);
        volvo = new Volvo240(4, 1, Color.BLACK, 5, 20, 1.5);
        saab = new Saab95(4, 1, Color.BLACK, 5, 20, 1.5);
    }

    @Test
    @DisplayName("getNrCars")
    void getNrCars(){

        assertEquals(0, truck.getNrCars());
    }

    @Test
    @DisplayName("start engine")
    void startEngine(){

        truck.startEngine();
        assertFalse(truck.getEngineStatus());

        truck.raiseRamp();
        truck.startEngine();

        assertTrue(truck.getEngineStatus());
    }

    @Test
    @DisplayName("lower ramp")
    void lowerRamp(){

        truck.raiseRamp();
        truck.startEngine();
        truck.lowerRamp();
        assertFalse(truck.getRampStatus());

    }

    @Test
    @DisplayName("get max cars")
    void getCarCapacity(){
        assertEquals(Color.BLUE, truck.getColor());
        assertEquals(6, truck.getCarCapacity());
    }

    @Test
    @DisplayName("load cars")
    void loadCar(){

        truck.loadCar(volvo);

        assertEquals(1, truck.getNrCars());

        truck.loadCar(volvo);
        truck.loadCar(volvo);
        truck.loadCar(volvo);
        truck.loadCar(volvo);
        truck.loadCar(saab);
        truck.loadCar(volvo);

        assertEquals(saab, truck.getTopCar());

    }

    @Test
    @DisplayName("unload cars")
    void unloadCar(){

        truck.loadCar(volvo);
        truck.loadCar(saab);
        truck.unloadCar();
        assertEquals(1, truck.getNrCars());
        assertEquals(volvo, truck.getTopCar());

    }
}