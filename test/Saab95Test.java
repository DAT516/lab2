package src.main;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class Saab95Test {

    @Test
    @DisplayName("turbon!")
    void setTurboOn() {
        Saab95 car = new Saab95();
        car.setTurboOn();
        assertTrue(car.turboOn);
    }

    @Test
    @DisplayName("turboff!")
    void setTurboOff() {
        Saab95 car = new Saab95();
        car.setTurboOff();
        assertFalse(car.turboOn);

    }

    @Test
    @DisplayName("change_speedFactor!")
    void speedFactor() {
        Saab95 car = new Saab95();
        double turboSpeed = car.enginePower*0.01*1.3;
        double normalSpeed = car.enginePower*0.01;


        if(car.turboOn){
            assertEquals(car.speedFactor(), turboSpeed);
        }
        else {
            assertEquals(car.speedFactor(), normalSpeed);

        }
    }
    @Test
    @DisplayName("get_speed!")
    void getCurrentSpeed(){
        Saab95 car  = new Saab95();
        assertEquals(car.currentSpeed, car.getCurrentSpeed());
    }

    @Test
    @DisplayName("set color!")
    void setColor(){
        Saab95 car  = new Saab95();
        Color clr = java.awt.Color.BLACK;
        car.setColor(clr);
        assertEquals(car.color, clr);
    }
    @Test
    @DisplayName("start engine!")
    void startEngine(){
        Saab95 car = new Saab95();
        car.startEngine();
        assertEquals(0.1, car.currentSpeed);
    }
    @Test
    @DisplayName("yes")
    void getColor(){
        Saab95 car = new Saab95();
        assertEquals(car.color, car.getColor());
    }

    @Test
    @DisplayName("stop engine!")
    void stopEngine(){
        Saab95 car = new Saab95();
        car.stopEngine();
        assertEquals(0, car.currentSpeed);
    }

}