package javabasic_02.day08.string;

public class RefEx01 {
    public static void main(String[] args) {
        String refVar1 = null;
        String refVar2 = null;

        refVar1 = new String("자바");
        refVar2 = "자바";
        String refVar3 ="자바";
        String refVar4 = null;

        System.out.println(refVar1 == refVar2);
        System.out.println(refVar1 == refVar3);
        System.out.println(refVar2 == refVar3);
        //1과 2,3은 저장되는 장소가 다르다.
        System.out.println("-----------");
        System.out.println(refVar1.equals(refVar2));
        System.out.println(refVar2.equals(refVar3));

        System.out.println("-------NoullPointException");
        System.out.println(refVar4);
//        System.out.println(refVar4.length()); ==> 오류 refVar4 가 null 이기 때문에
        System.out.println(refVar3.length()); //=> refVar3 는 "자바" 이기 때문에 2가 나옴

    }
}
