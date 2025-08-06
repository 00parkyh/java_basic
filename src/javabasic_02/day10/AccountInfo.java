package javabasic_02.day10;

public class AccountInfo {
    public static final  int MIN_BALANCE = 0;
    public static final  int MAX_BALANCE = 1000000;
    private String accountNo;   //계좌번호
    private String owner;       //소유자
    private int balance;    //통장(입출금 내역 및 잔고 확인)

    public String getAccountNo() {
        return accountNo;
    }

    public String getOwner() {
        return owner;
    }

    AccountInfo() {}
    //은행에 가서 계좌 개설신청하면 개인 정보를 은행에 등록하는 첫과정
    AccountInfo(String accountNo, String owner, int balance) {
        if (balance<0) {
            System.out.println("음수는 입금할수 없습니다.");
        } else {
            this.accountNo = accountNo;
            this.owner = owner;
            this.balance = balance;
        }
    }

    public void setBalance(int money) {
        if (money>MIN_BALANCE && money <MAX_BALANCE) {
            this.balance += money;
        } else {
            System.out.println("0보다 작은 금액은 입력할수 없습니다.");
        }


    }
    public void setBalance2(int money) {
        if (money<MIN_BALANCE || money >MAX_BALANCE) {
            return;
        }
        if (this.balance > 0 && this.balance > money) {
            this.balance -= money;
        } else {
            System.out.println("계좌에 잔액이 모자랍니다.");
            System.out.println("현재 잔액은 "+this.balance+"입니다.");
            System.out.println(money - this.balance+" 모자랍니다.");
        }

    }

    public int getBalance() {
        return this.balance;
    }

}
