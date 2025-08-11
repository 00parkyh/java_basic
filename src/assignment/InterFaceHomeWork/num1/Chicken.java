package assignment.InterFaceHomeWork.num1;

public class Chicken extends Animal implements Cheatable{
    boolean cheatable = false;

    Chicken(int speed){
        super(speed);
    }

    @Override
    void run(int hours) {
        distance = hours*speed;
        if (cheatable) {
            System.out.println("닭의 이동거리 = "+getDistance());
        } else {
            System.out.println("날으는 닭의 이동거리 = "+getDistance());
        }
    }
    @Override
    public void fly() {
        speed *= 2;
        cheatable = true;
    }
}
