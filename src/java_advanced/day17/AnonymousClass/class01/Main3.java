package java_advanced.day17.AnonymousClass.class01;

class Animal3 {
    public String eat() {
        return "맛있게 먹습니다";
    }
}

public class Main3{
    public static void main(String[] args) {
        Animal3 dog = new Animal3() {
            @Override
            public String eat() {
                String run = run();
                run(); //호출 가능  이유 => eat() 안에서는 같은 클래스의 다른 메서드를 호출할 수 있으므로 run()을 직접 호출할 수 있다.
                return "강아지 멍멍" + run;
            }
            public String run() {
                return " 강아지가 뛴다.";
            }
        };

        String eat = dog.eat();
        System.out.println(eat);
//        dog.run(); 호출 불가능 이유 => dog의 클래스는 Animal 클래스인데 run이 Animal 클래스에 정의되어 있지 않기 때문에
    }
}
//새로 정의한 메소드는 외부 스코프에서 호출될 수 없고, 익명 클래스 내에서만 호출 가능하다.