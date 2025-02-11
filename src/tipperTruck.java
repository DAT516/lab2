public abstract class tipperTruck extends Truck{
    private int dumpBoxMaxAngle;
    private int currentdumpBoxAngle = 0;


    public void loadCarriage(double inputWeight){
        transportationWeight += inputWeight;
    }

    public void unloadCarriage(){
        transportationWeight = 0;
    }


    public void raiseDumpBox(int inputAngle){
        if (inputAngle < 0){
            inputAngle = 0;
        }
        if (inputAngle + currentdumpBoxAngle > dumpBoxMaxAngle){
            currentdumpBoxAngle = dumpBoxMaxAngle;
        }
        else{
            currentdumpBoxAngle += inputAngle;
        }
    }

    public void lowerDumpBox(int inputAngle){
        if (inputAngle > 0){
            inputAngle = 0;
        }

        if (currentdumpBoxAngle - inputAngle < 0){
            currentdumpBoxAngle = 0;
        }
        else{
            currentdumpBoxAngle -= inputAngle;
        }
    }
}