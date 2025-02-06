package src.main;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class Volvo240Test {



    @Test
    @DisplayName("change_speedFactor!")
    void speedFactor() {
        Volvo240 car = new Volvo240();
        double speed = car.enginePower*0.01*car.trimFactor;
        assertEquals(speed, car.speedFactor());

    }
    @Test
    @DisplayName("get_speed!")
    void getCurrentSpeed(){
        Volvo240 car  = new Volvo240();
        assertEquals(car.currentSpeed, car.getCurrentSpeed());
    }

    @Test
    @DisplayName("set color!")
    void setColor(){
        Volvo240 car  = new Volvo240();
        Color clr = java.awt.Color.BLACK;
        car.setColor(clr);
        assertEquals(car.color, clr);
    }
    @Test
    @DisplayName("start engine!")
    void startEngine(){
        Volvo240 car = new Volvo240();
        car.startEngine();
        assertEquals(0.1, car.currentSpeed);
    }
    @Test
    @DisplayName("yes")
    void getColor(){
        Volvo240 car = new Volvo240();
        assertEquals(car.color, car.getColor());
    }

    @Test
    @DisplayName("stop engine!")
    void stopEngine(){
        Volvo240 car = new Volvo240();
        car.stopEngine();
        assertEquals(0, car.currentSpeed);
    }

}