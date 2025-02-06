package src.main;

public abstract class Movable {
 
    public double currentSpeed = 1;     // How to do this??
    private char direction = 'N';
    public double x;
    public double y;

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
}
