package src;

import java.awt.*;


public class Scania extends tipperTruck{

    private int nrDoors = 2; // Number of doors on the car
    private double enginePower = 75; // Engine power of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private double currentSpeed = 1;
    private char direction = 'N';
    private double x = 0;
    private double y = 0;

    public double speedFactor(){
        return 1;
    }

}
