package javabasic_02.day11.inheritance.qa.test.testClass03.number2;

public class Account {
    String accNo;
    int balance;

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
        System.out.println(accNo+" 계좌가 개설되었습니다.");
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void save(int num) {
        this.balance +=num;
        System.out.println(getAccNo()+" 계좌에 "+num+"만원이 입급되었습니다.");

    }

    public void deposit(int num) {
        this.balance -=num;
        System.out.println(getAccNo()+" 계좌에 "+num+"만원이 출금되었습니다.");

    }
}
