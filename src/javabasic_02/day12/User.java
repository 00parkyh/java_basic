package javabasic_02.day12;

public class User {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Televison();
        rc.turnOn();
        rc.setVolume(10);
        rc.setVolume(11);
        rc.setMute(true);
        rc.setMute(false);
        RemoteControl.changeBattery();  //정적 메소드 수행
        rc.turnOff();

        //리모컨을 통해서 청소기를 동작시키려 한다.
        //1. 전원을 키고
        //2. 청소를 시킨다.
//        RemoteControl rc2;
//        rc2 = new Cleaner();
//        rc2.turnOn();
//        rc2.turnOff();

        //tv의 최대볼륨 확인   public static final 타입 상수명은 바로 접근하여 상수값을 읽음
        System.out.println(RemoteControl.MAX_VOLUME);
        //tv의 최소볼륨 확인
        System.out.println(RemoteControl.MIN_VOLUME);
    }

}
