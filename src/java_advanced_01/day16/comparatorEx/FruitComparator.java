package java_advanced_01.day16.comparatorEx;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> {

    //나오는 순서 바꾸려면 return 값 바꿔주며 된다
    @Override
    public int compare(Fruit o1, Fruit o2) {
        if (o1.price == o2.price) return 0;
        else if (o1.price > o2.price) return 1;
        else return -1;
    }
}
