package src.main;

import java.awt.*;


public abstract class Car implements Movable{       // Why extend from movable?
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private double currentSpeed = 1;
    private char direction = "N";
    private double x;
    private double y;

    public void move(){
        // n w s e
        switch(direction){
            case 'N':
                y += currentSpeed;
            case 'W':
                x -= currentSpeed;
            case 'S':
                y -= currentSpeed;
            case 'E':
                x += currentSpeed;
        }
    }

    public void turnLeft(){
        switch(direction){
            case 'N':
                direction = 'W';
            case 'W':
                direction = 'S';
            case 'S':
                direction = 'E';
            case 'E':
                direction = 'N';
            default:
                direction = 'N';
        }
    }
    public void turnRight(){
        switch(direction){
            case 'N':
                direction = 'E';
            case 'E':
                direction = 'S';
            case 'S':
                direction = 'W';
            case 'W':
                direction = 'N';
            default:
                direction = 'N';
        }
    }

    public final int getNrDoors(){
        return nrDoors;
    }
    public final double getEnginePower(){
        return enginePower;
    }

    public final double getCurrentSpeed(){
        return currentSpeed;
    }

    public final Color getColor(){
        return color;
    }

    public void setColor(Color clr){
	    color = clr;
    }

    public void startEngine(){
	    currentSpeed = 0.1;
    }

    public void stopEngine(){
	    currentSpeed = 0;
    }

    public abstract double speedFactor()

    private void incrementSpeed(double amount){
        double newSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
        currentSpeed = newSpeed
    }

    private void decrementSpeed(double amount){
        double newSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
        currentSpeed = newSpeed
    }

    public void gas(double amount){
        if  (amount >= 0 && amount <= 1){
            incrementSpeed(amount);
        }
    }

    public void brake(double amount){
        if  (amount >= 0 && amount <= 1){
            decrementSpeed(amount);
        }
    }
}

