package src;

public abstract class Truck extends Vehicle{
    
    private double transportationWeight = 0;
    private double maxWeight;

    public double getMaxWeight(){
        return maxWeight;
    }

    public double getTransportationWeight(){
        return transportationWeight;
    }

    public void setTransportationWeight(double amount){
        if (transportationWeight+amount > maxWeight){
            transportationWeight = maxWeight;
        }
        else{
            transportationWeight = amount;
        }
    }

}

