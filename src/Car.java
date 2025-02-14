package src;

import java.awt.*;

public abstract class Car extends Vehicle{
    private int nrSeats;
    private double weight;
    private double width;

    public int getNrSeats(){
        return nrSeats;
    }

    public void setNrSeats(int inputNumber){
        nrSeats = inputNumber;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double amount){
        weight = amount;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double amount){
        width = amount;
    }
}

