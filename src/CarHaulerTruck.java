package src;

import java.util.Stack;

public abstract class CarHaulerTruck extends Truck{
    private int carCapacity;
    private Stack<Car> loadedCars;
    private double truckWidth;
    private int nrCars = 0;
    private boolean rampIsDown = true;


    public boolean getRampStatus(){
        return rampIsDown;
    }

    public void raiseRamp(){
        rampIsDown = false;
    }

    public void lowerRamp(){
        if (getEngineStatus()){
            return;
        }
        rampIsDown = true;
    }



    @Override public void startEngine(){
        if (rampIsDown){
            return;
        }
        super.startEngine();
    }

    @Override public void move(){
        if (!getEngineStatus()){
            return;
        }

        super.move();

        for (Car car : loadedCars){

            double[] position = car.getPosition();

            double xPos = position[0];
            double yPos = position[1];

            car.setPosition(xPos, yPos);
        }
    }


    public void loadCar(Car car){

        if (!rampIsDown){
            return;
        }

        double[] carPos = car.getPosition();
        double[] truckPos = getPosition();

        double carX = carPos[0];
        double carY = carPos[1];
        double truckX = truckPos[0];
        double truckY = truckPos[1];


        if ((carX > (truckX+5)) || (carX  < (truckX-5))){
            return;
        }

        if ((carY > (truckY+5)) || (carY  < (truckY-5))){
            return;
        }

        if (!(car.getWeight() <= getMaxWeight()-getTransportationWeight())){
            return;
        }

        if (!(getNrCars() >= (carCapacity-1))){
            return;
        }


        if (car.getWidth() > truckWidth){
            return;
        }

        loadedCars[nrCars] = car;
        nrCars += 1;

    }
    public void unloadCar(){
        if (!rampIsDown){
            return;
        }

        if (loadedCars.length == 0){
            return;
        }

        Car car = loadedCars[loadedCars.length-1];
        double[] carPos = car.getPosition();

        car.setPosition(carPos[0]+3, carPos[1]+2);
        
    }

    public Car[] getCars(){
        return loadedCars;
    }

    public int getNrCars(){
        return loadedCars.length;
    }

}


