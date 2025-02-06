package src.main;

import java.awt.*;


public abstract class Car extends Movable{       // Why extend from movable?
    protected int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    protected Color color; // Color of the car
    public String modelName; // The car model name


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

    public double speedFactor(){
        return enginePower * 0.01;
    }

    private void incrementSpeed(double amount){
        double newSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
        if (newSpeed <= enginePower && newSpeed >= 0){
	        currentSpeed = newSpeed;
        }
    }

    private void decrementSpeed(double amount){
        double newSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
        if (newSpeed <= enginePower && newSpeed >= 0){
	        currentSpeed = newSpeed;
        }
    }


    public void gas(double amount){
        double oldSpeed = currentSpeed;
        if  (amount >= 0 && amount <= 1){
            incrementSpeed(amount);
        }
        if (oldSpeed > currentSpeed){
            currentSpeed = oldSpeed;
        }
    }

    public void brake(double amount){
        double oldSpeed = currentSpeed;
        if  (amount >= 0 && amount <= 1){
            decrementSpeed(amount);
        }
        if (oldSpeed < currentSpeed){
            currentSpeed = oldSpeed;
        }
    }
}

