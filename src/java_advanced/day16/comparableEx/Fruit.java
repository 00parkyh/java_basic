package java_advanced.day16.comparableEx;

import java.util.TreeSet;

//과일이 있다. 과일을 가격 기준으로 오름차순 정렬할 수 있도록 비교기를 구현하세요.
public class Fruit implements Comparable<Fruit> {
    public String name;
    public int price;

    public Fruit(String name,int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Fruit o) {
        if(this.price<o.price) return 1;
        else if (this.price>o.price) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Fruit f1 = new Fruit("사과",10000);
        Fruit f2 = new Fruit("귤",12000);
        Fruit f3 = new Fruit("포도",18000);
        Fruit f4 = new Fruit("복숭아",8000);

        TreeSet<Fruit> treeSet = new TreeSet<Fruit>();
        treeSet.add(f1);
        treeSet.add(f2);
        treeSet.add(f3);
        treeSet.add(f4);

        for (Fruit f : treeSet) {
            System.out.println("과일 이름 : "+f.name+" 과일 가격 : "+f.price);
        }

    }
}
