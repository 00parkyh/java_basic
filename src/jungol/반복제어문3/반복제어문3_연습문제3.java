package jungol.반복제어문3;

public class 반복제어문3_연습문제3 {
    public static void main(String[] args) {
        for (int i= 0; i<4; i++) {
            for(int s = 0; s<i; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
      for (int j =0; j<4; j++ ) {
          for(int q =3; q>j; q --) {
              System.out.print("*");
          }
          System.out.println();
      }
    }
}
