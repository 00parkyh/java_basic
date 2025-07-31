package javabasic_02.day07;

public class MemberTest {
    public static void main(String[] args) {
        Member member1 = new Member();

        member1.name = "홍길동";
        member1.age = 30;
        member1.phonenumber = "010-1111-1111";
        member1.email = "fc@naver.com";
        member1.address = "서울";
        member1.weight = 57.6;

        Member member2 = new Member();

        member2.name = "김진명";
        member2.age = 32;
        member2.phonenumber = "010-1111-2222";
        member2.email = "gm@naver.com";
        member2.address = "서울";
        member2.weight = 60.8;

        //삼성 지점 sshelth 헬스센터
        Member[] 삼성 = new Member[2];
        삼성[0] = member1;
        삼성[1] = member2;

        for (int i = 0; i<삼성.length; i++) {
            Member member = 삼성[i];
            System.out.println(member.name);
        }
    }
}
