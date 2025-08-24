package java_advanced.day19.test;


class Person {
    private Phone phoneNumber;
    private String name;

    Person(String name) {this.name=name;}

    public Phone getPhone() {return this.phoneNumber;}
}

class Phone{
    private Os os;

    public Os getOs() {
        return this.os;
    }
}

class Os{
    public String printOs() {
        return "IOS";
    }
}
public class Main {
    public static void main(String[] args) {
        Person person = new Person("홍길동");
        person.getPhone().getOs().printOs();

        Person p = new Person("홍미자");
        Phone ph = p.getPhone();
            //Null Object Pattern
        if (ph!= null) {
            Os os = ph.getOs();
            if (os != null) {
                String osName = System.getProperty("os.name").toLowerCase();
            }
        }
    }

    //Optional 클래스 처리 NPE 처리 ==> Null 을 처리하기 위한 랩퍼(wrapper) 클래스
    Person p1 = new Person("서유미");

//    Optional.ofNullable(p1).map(Person::getPhone).map(Phone::getOs).map(Os::printOs);





}

// 왜 NPE 가 발생했을까??
//phoneNumber를 초기화 하지 않았기 때문에