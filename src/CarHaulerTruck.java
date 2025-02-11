
public abstract class CarHaulerTruck extends Truck{
    private int carCapacity;
    private Car[] loadedCars = new Car[carCapacity];
    private double truckWidht;
    private int nrCars = 0;

    public void loadCar(Car car){

        if (!(car.getWeight() <= maxWeight-transportationWeight)){
            return;
        }

        if (!(getNrCars() >= (carCapacity-1))){
            return;
        }

        if (car.getWidth() > truckWidht){
            return;
        }

        loadedCars[nrCars] = car;
        nrCars += 1;

    }
    public void unloadCar(){
        if 
    }

    public int getNrCars(){
        return loadedCars.length;
    }

}


