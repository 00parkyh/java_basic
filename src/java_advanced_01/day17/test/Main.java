package java_advanced_01.day17.test;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {

    class User implements Comparable<User> {
        String name;
        int age;

        User(String name, int age) {
            this.name = name;
            this.age = age ;
        }

        @Override
        public int compareTo(User o) {
            if(this.age<o.age) return -1;
            else if(this.age>o.age) return 1;
            else return 0;
        }
    }

    User[] users = new User[] {
            new User("김유신",64),
            new User("홍길동",32),
            new User("박희동",14),
            new User("김동성",48),
    };
    Arrays.sort(users);

        for (User u : users) {
            System.out.println(u.name + " " + u.age);
        }
    }

}
