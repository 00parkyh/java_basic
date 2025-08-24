package java_advanced.day13.exceptionEx.num3;

public class CellPhone {
    String model;
    double battery;

    CellPhone(String model) {
        this.model = model;
    }
    void call(int time) {

        battery -= time * 0.5;
        if (battery <0) {
            battery = 0;
        }
        try {
            if (time <0) {
                throw new IllegalArgumentException();
            } else {
                System.out.println("통화시간 : "+time+"분");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("통화시간입력오류");
        }

    }
    void charge(int time) {
        battery = time * 3;
        if(battery>100) {
            battery = 100;
        }
        try {
            if (time <0) {
                throw new IllegalArgumentException();
            } else {
                System.out.println("충전시간 : "+time+"분");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("충전시간입력오류");
        }

    }

    void printBattery() {
        System.out.println("남은 배터리의 양 : "+battery);
    }
}
