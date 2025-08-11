package assignment.InterFaceHomeWork.num1;

public class Dog extends Animal{

    Dog(int speed) {
        super(speed);
    }

    @Override
    void run(int hours) {
        distance = (double) hours/2 * speed;
        System.out.println("개의 이동거리 = "+getDistance());
    }
}
