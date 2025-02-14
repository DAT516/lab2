package src;

import java.awt.Color;

public class KenworthW990 extends CarHaulerTruck{
    
    public KenworthW990(Color clr){
        int carCapacity = 6;
        Car[] loadedCars = new Car[carCapacity];
        double truckWidth = 2;
        double maxWeight = 40;
        int nrDoors = 2;
        int enginePower = 510;
        Color color = clr;
    }

    public double speedFactor(){
        return 1;
    }
}
