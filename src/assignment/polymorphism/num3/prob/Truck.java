package assignment.polymorphism.num3.prob;

public class Truck extends Wheeler{
    //String carName 과 int velocity 를 선언하게되면 부모필드와는 완전히 다른 공간이 생기기 때문에 실행시 null값이 넘어감

    Truck(String carName,int velocity,int wheelNumber) {
        this.carName = carName;
        this.velocity = velocity;
        this.wheelNumber = wheelNumber;
    }

    @Override
    public void speedUp(int speed) {
        velocity += speed*5;
        if (velocity >100) {
            velocity = 100;
            System.out.println(carName+"의 최고속도 위반으로 속도를 "+velocity+" 으로 낮춥니다.");
        } else System.out.println(carName+"의 현재속도는 "+velocity+" 입니다.");
    }

    @Override
    public void speedDown(int speed) {
        velocity -= speed*5;
        if (velocity <50) {
            velocity = 50;
            System.out.println(carName+"의 최저속도 위반으로 속도를 " +velocity+" 으로 올립니다.");
        } else System.out.println(carName+"의 현재속도는 "+velocity+" 입니다.");
    }

}
