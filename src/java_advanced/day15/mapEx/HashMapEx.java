package java_advanced.day15.mapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        //map 컬렉션 생성
        Map <String, Integer> map = new HashMap<String, Integer>();

        //객체 저장     INSERT,CREATED
        //키 값이 같으면 추가되지 않음
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);
        System.out.println(map.size());

        //하나의 객체 읽기     Read, Get ==> KEY를 이용해서 읽어온다.
        String key = "A";
        int value = map.get(key);
        System.out.println("키를 이용하여 값 확인"+value);
        System.out.println();

        //키 set 컬렉션을 얻고, 반복해서 키와 값을 읽고 싶다.
        Set<String> keyset = map.keySet();
        Iterator<String> iterator = keyset.iterator();  //키를 반복하기 위해 반복자를 생성
        while (iterator.hasNext()) {
            String key1 = iterator.next();
            Integer value1 = map.get(key1);
            System.out.println(key1+":"+value1);
        }
        System.out.println();

        //엔트리 Set 컬렉션을 얻고 반복해서  키와 값을 얻기
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,Integer>> entryIterator =entrySet.iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k+":"+v);
        }
        for (Map.Entry<String, Integer> entry : entrySet) {
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k+":"+v);
        }

        // 키로 엔트리 삭제
        map.remove("B");
        System.out.println(map.size());
        System.out.println();
    }
}
