package java_advanced.BoardTest;//package java_advanced_01.BoardTest;//package BoardTest;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.Scanner;
//
//public class BoardExample {
//    public static Scanner sc = new Scanner(System.in);
//    public static List<Board> boardList = new ArrayList<Board>();
//    public static int bnocount = 0;
//    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
//    private static boolean bolwhile = true;
//
//    public static void main(String[] args) throws ParseException {
//
//        boardList.add(new Board(++bnocount,"winter",new Date(),"게시판에 오신것을 환영합니다."));
//        boardList.add(new Board(++bnocount,"winter",new Date(),"올 겨울은 많이 춥습니다."));
//
//        while (bolwhile) {
//            list();
//        }
//    }
//
//    public static void list(){
//        System.out.println("[게시물 목록]");
//        System.out.println("----------------------------------------------------------");
//        System.out.println("no\twriter\tdate\t\ttitle");
//        System.out.println("----------------------------------------------------------");
//
//        for (Board board : boardList) {
//            System.out.print(board.getBno()+"\t");
//            System.out.print(board.getbWriter()+"\t");
//            String formattedDate = sdf.format(board.getbDate());
//            System.out.print(formattedDate+"\t");
//            System.out.print(board.getbTitle()+"\n");
//        }
//        mainMenu();
//    }
//
//    public static void mainMenu() {
//
//        System.out.println("----------------------------------------------------------");
//        System.out.println("메인 메뉴 : 1.Create  |  2.Read  |  3.Clear  |  4.Exit");
//        System.out.print("메뉴 선택 : ");
//        String num = sc.nextLine();
//        System.out.println();
//        switch (num) {
//            case "1" -> create();
//            case "2" -> read();
//            case "3" -> clear();
//            case "4" -> exit();
//            default -> menuExcept();
//        }
//    }
//
//    private static void create() {
//        System.out.println("[새 게시물 입력]");
//
//        System.out.print("제목: ");
//        String title = sc.nextLine();
//        System.out.print("내용: ");
//        String content = sc.nextLine();
//        System.out.print("작성자: ");
//        String writer = sc.nextLine();
//
//        System.out.println("---------------------------------------------");
//        System.out.println("보조 메뉴 : 1.Ok | 2.Cancel");
//        System.out.print("메뉴 선택 : ");
//        String subnumber = sc.nextLine();
//
//        switch (subnumber) {
//            case "1" -> boardList.add(new Board(++bnocount,title,content,writer,new Date()));
//            case "2" -> System.out.println("게시물 작성을 취소했습니다.");
//            default -> System.out.println("1 또는 2 만 선택해주세요.");
//        }
//    }
//
//    private static void read() {
//        System.out.println("[게시물 읽기]");
//        System.out.print("bno : ");
//        String bno2 = sc.nextLine();
//
//        for (Board board : boardList) {
//            String formattedDate = sdf.format(board.getbDate());
//            if (bno2.equals(Integer.toString(board.getBno()))) {
//                System.out.println("#############");
//                System.out.println("번호 : " + board.getBno());
//                System.out.println("제목 : "+ board.getbTitle());
//                System.out.println("내용 : "+ board.getbContent());
//                System.out.println("작성자 : "+ board.getbWriter());
//                System.out.println("날짜 : "+ formattedDate);
//                System.out.println("#############");
//            }
//        }
//    }
//
//    private static void menuExcept() {
//        System.out.println("메뉴에 있는 번호만 선택해주세요.");
//        list();
//    }
//
//    private static void exit() {
//
//    }
//
//    private static void clear() {
//
//    }
//
//}
