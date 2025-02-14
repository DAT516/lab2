package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import src.Car;
import src.KenworthW990;
import src.Saab95;
import src.Volvo240;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class KenworthW990Test {


    @Test
    @DisplayName("getNrCars")
    void getNrCars(){
        KenworthW990 truck = new KenworthW990(Color.BLUE);

        assertEquals(0, truck.getNrCars());
    }

    @Test
    @DisplayName("start engine")
    void startEngine(){
        KenworthW990 truck = new KenworthW990(Color.BLUE);

        truck.startEngine();
        assertFalse(truck.getEngineStatus());

        truck.raiseRamp();
        truck.startEngine();

        assertTrue(truck.getEngineStatus());
    }

    @Test
    @DisplayName("lower ramp")
    void lowerRamp(){
        KenworthW990 truck = new KenworthW990(Color.BLUE);

        truck.raiseRamp();
        truck.startEngine();
        truck.lowerRamp();
        assertFalse(truck.getRampStatus());

    }

    @Test
    @DisplayName("load cars")
    void loadCar(){
        KenworthW990 truck = new KenworthW990(Color.BLUE);
        Volvo240 volvo = new Volvo240();
        Saab95 saab = new Saab95();


        truck.loadCar(volvo);

        Car[] cars = truck.getCars();
        assertEquals(1, cars.length);
        assertEquals(volvo, cars[0]);

        truck.loadCar(saab);
        assertEquals(2, cars.length);
        assertEquals(saab, cars[1]);


    }


}