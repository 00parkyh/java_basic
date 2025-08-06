package javabasic_02.day10;

import java.util.Scanner;

public class BankApplication {
    static AccountInfo[] Account = new AccountInfo[100];
    static Scanner sc = new Scanner(System.in);
    static int count = 0;
    static boolean run = true;

    public static void main(String[] args) {

        while (run) {

                menu();
                choice();
        }
    }

    private static void menu() {
        String menu = """
                    ==============================================
                    1. 계좌생성  2. 계좌목록  3. 예금  4. 출금  5. 입금
                    ==============================================
                    """;
        System.out.println(menu);
        System.out.print("<선택> ");
    }
    private static void choice() {
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1-> createAccount();
            case 2-> accountList();
            case 3-> deposit();
            case 4-> withdraw();
            case 5-> exitApp();
        }
    }
    private static void createAccount() {
        System.out.println("-------------");
        System.out.println("   계좌 생성   ");
        System.out.println("-------------");

        System.out.print("계좌번호 : ");
        String accountNo = sc.nextLine();
        System.out.print("계좌주 : ");
        String owner = sc.nextLine();
        System.out.print("초기입금액 : ");   //계산을 위한 정수로 변경
        int balance =Integer.parseInt(sc.nextLine());

        //새로운 계좌 생성
        AccountInfo newAccount =  new AccountInfo(accountNo, owner, balance);
        System.out.println("결과 : 계좌가 생성되었습니다. ");
        Account[count] = newAccount;
        count ++;
    }

    private static void accountList() {
        System.out.println("-------------");
        System.out.println("   계좌 목록   ");
        System.out.println("-------------");

        for (int i = 0; i<count; i++) {
            AccountInfo account = Account[i];
            System.out.println(account.getAccountNo() + " " + account.getOwner()+" " + account.getBalance());
        }

    }

    private static void deposit() {
        System.out.println("-------------");
        System.out.println("   예금       ");
        System.out.println("-------------");
        System.out.print("계좌번호 : ");
        String accountNo = sc.nextLine();
        System.out.print("예금액 : ");
        int balance = Integer.parseInt(sc.nextLine());

        boolean except = false;

        for (int i = 0; i<count; i++) {
            AccountInfo account = Account[i];
            if (account.getAccountNo().equals(accountNo)) {
                account.setBalance(balance);
                except = true;
                break;
            }
        }
        if (!except) {
            System.out.println("없는 계좌 번호 입니다.");
        }

    }

    private static void withdraw() {
        System.out.println("-------------");
        System.out.println("   예금       ");
        System.out.println("-------------");
        System.out.print("계좌번호 : ");
        String accountNo = sc.nextLine();
        System.out.print("예금액 : ");
        int balance = Integer.parseInt(sc.nextLine());

        boolean except = false;

        for (int i = 0; i<count; i++) {
            AccountInfo account = Account[i];
            if (account.getAccountNo().equals(accountNo)) {
                account.setBalance2(balance);
                except = true;
                break;
            }
        }
        if (!except) {
            System.out.println("없는 계좌 번호 입니다.");
        }
    }
    private static void exitApp() {
        System.out.println("프로그램이 종료됩니다.");
        run = false;
    }
}
