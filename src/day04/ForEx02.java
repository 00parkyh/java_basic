package day04;

public class ForEx02 {
    public static void main(String[] args) {
        // 1 ~ 10 까지의 합 출력 : 55 나오게끔 작성
        int sum = 0;
        for(int i = 1; i <11; i++) {
            sum += i;
        }
        System.out.printf("출력 : %d", sum);
    }
}
