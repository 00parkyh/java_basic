package assignment.InterFaceHomeWork.num1;

public abstract class Animal {
     int speed;
     double distance;

    Animal(int speed){
        this.speed = speed;
    }
    abstract void run(int hours);

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
