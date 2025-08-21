package BoardTest2;

import java.text.SimpleDateFormat;
import java.util.*;

//사용자가 현재 게시물목록 읽을 수 있다.
//사용자가 메뉴를 선택하여 글을 생성, 생성한 글을 읽을 수도 있고, 삭제할 수도 있다.
//사용자는 게시판을 프로그램을 종료할 수 있다.
public class BoardExample {
    static Scanner scanner = new Scanner(System.in);   //static 처리 => scanner 객체는 공용객체
    private static final String menuNumberRegex = "[1-3]";
    private static final String checkNumber = "[1-2]";
    private static final String readOptionRegex = "[1-3]";
    private static int bno = 1;  //공용변수
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    BoardManger boardManger;

    //Board 매니저가 게시판을 관리한다.
    public BoardExample() {
    }
    public BoardExample(BoardManger boardManger) {
        this.boardManger = boardManger;
    }
    // 현재 게시판의 전체 게시물 목록을 출력 기능
    public void list() {
        Map<String, Board> boardMap = boardManger.getBoardMap();  //게시판은 매니저가 담당하고 있으므로, 매니저 받아온다.
        //   System.out.println(boardList);
        System.out.println("\n[게시물 목록]");
        System.out.println("-".repeat(60));
        System.out.printf("%-4s %-20s %-20s %-20s\n", "no", "writer", "date", "title");
        //Manger에게 전체 게시물목록을 요청
        List<Map.Entry<String,Board>> entryList = new LinkedList<>(boardMap.entrySet());
        Collections.reverse(entryList);

        entryList.forEach(entry -> {
            Board value = entry.getValue();
            System.out.printf("%-4d %-20s %-20s %-20s\n", value.getBNo(),value.getBWriter(),dateFormat.format(value.getBDate()),value.getBTitle());
        });
        System.out.println("-".repeat(60));

        mainMenu();
    }
    //메인 메뉴
    public void mainMenu() {
        String mainMenu = """
                --------------------------------------------------------
                메인메뉴 : 1. Create | 2. Read | 3. Clear | 4. Exit
                """;
        System.out.print(mainMenu);
    }
    // 게시물 메인 메뉴 선택 기능
    public void run() {
        while (true) {
            Map<String, Board> boardMap = boardManger.getBoardMap();
            list();
            System.out.print("메뉴 선택 : ");
            String input = scanner.nextLine();  //외부에서 사용자가 입력한 데이터타입은 모두 문자열

            if (input.equals("4")) {
                System.out.println("\n게시판 종료");
                break;
            }
            if (input.matches(menuNumberRegex)) {
                switch (input) {
                    case "1": create();break;
                    case "2": if (!boardMap.isEmpty()){read();} else System.out.println("게시판이 비어있습니다.");break;
                    case "3": if (!boardMap.isEmpty()){clear();} else System.out.println("게시판이 비어있습니다.");break;
                }
            } else {
                System.out.println("[1-4]번 번호를 입력하세요");
            }
        }
    }
    //checkMenu() : 보조메뉴 확인, 선택 메서드
    //2를 누르면 false 를 반환
    public boolean checkMenu(){
        System.out.println("보조 메뉴 : 1. Ok  | 2. Cancel");
        System.out.print("메뉴 선택: ");
        while(true) {
            String input = scanner.nextLine();
            if (input.matches(checkNumber)) {
                return input.equals("1");
            } else {
                System.out.println("[1 or 2]번을 입력하세요");
            }
        }
    }
    //새글 작성 저장기능 => Map컬렉션에
    public void create(){
        System.out.println("\n[새 게시물 입력]");

        System.out.print("제목: ");
        String title = scanner.nextLine();

        System.out.print("내용: ");
        String content = scanner.nextLine();

        System.out.print("작성자: ");
        String writer = scanner.nextLine();

        //1번 입력
        if(checkMenu()) {
            //BoardBuilder 를 이용하여 새글을 생성한다.
            Board board = Board.builder()
                    .bNo(bno)
                    .bWriter(writer)
                    .bTitle(title)
                    .bContent(content)
                    .bDate(new Date())
                    .build();

            Map<String, Board>  boardMap = boardManger.getBoardMap();
            boardMap.put(String.valueOf(bno),board);

            //아래 한줄이면 위에 두줄이 대체 되는거 아닌가??  --> 지역 변수를 사용하는 두 줄 코드가 더 많은 장점을 가진다. 가독성, 디버깅의 편리함, 재사용성 및 확정성
//            boardManger.getBoardMap().put(String.valueOf(bno), board);

            boardManger.setBoardMap(boardMap);
            bno++;
        } else System.out.println("취소하였습나다.");
    };
    public void read() {
        System.out.println("[게시물 읽기]");
//        Scanner input = new Scanner(System.in);
        String numberInput ;
        while (true) {
            try {
                System.out.print("bno: ");
                numberInput = scanner.nextLine();
                if (Integer.parseInt(numberInput) <= 0 || Integer.parseInt(numberInput) > boardManger.getBoardMap().size()) {
                    throw new IllegalArgumentException("해당 게시물은 존재하지 않습니다.");
                }else {
                    Map<String, Board> boardMap = boardManger.getBoardMap();
                    System.out.println("#".repeat(30));
                    Board boardOne = boardMap.get(numberInput);
                    System.out.println("번호:  " + boardOne.getBNo());
                    System.out.println("제목:  " + boardOne.getBTitle());
                    System.out.println("내용:  " + boardOne.getBContent());
                    System.out.println("작성자:  " + boardOne.getBWriter());
                    System.out.println("날짜: "+ dateFormat.format(boardOne.getBDate()));
                    System.out.println("#".repeat(30));
                    readOption(Integer.parseInt(numberInput));
                    break;
                }
            } catch (IllegalArgumentException | InputMismatchException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            }
        }
    }
//        readOption(): 읽기 메서드의 옵션 메서드
    public void readOption(int bno) {
//        Scanner input = new Scanner(System.in);
        System.out.println("보조 메뉴: 1.Update | 2. Delete | 3.List");
        System.out.print("메뉴 선택: ");
        while (true) {
            String numberInput = scanner.nextLine();
            if (numberInput.matches(readOptionRegex)) {
                switch (numberInput) {
                    case "1": update(bno);break;
                    case "2": delete(bno);break;
                    case "3": run();break;
                }
                break;
            } else {
                System.out.println("[1-3]번 중 번호를 선택하세요.");
            }
        }
    }
    //read의 옵션 update
    public void update(int bno) {
        System.out.println("[수정 내용 입력]");
        System.out.print("제목 : ");
        String upTitle = scanner.nextLine();

        System.out.print("내용 : ");
        String upContent = scanner.nextLine();

        System.out.print("작성자 : ");
        String upWriter = scanner.nextLine();
        //1번 입력
        if(checkMenu()) {
            //BoardBuilder 를 이용하여 새글을 업데이트 한다..
            Board board = Board.builder()
                    .bNo(bno)
                    .bWriter(upWriter)
                    .bTitle(upTitle)
                    .bContent(upContent)
                    .bDate(new Date())
                    .build();
            Map<String, Board>  boardMap = boardManger.getBoardMap();
            boardMap.put(String.valueOf(bno),board);
            boardManger.setBoardMap(boardMap);

        } else System.out.println("취소하였습니다.");
    }

    public void delete(int bno) {
        int num = 1;
        bno--;
        Map<String, Board> boardMap = boardManger.getBoardMap();
        Map<String, Board> newBoardMap = new LinkedHashMap<>();
        for (Map.Entry<String, Board> entry : boardMap.entrySet()) {
            String key = entry.getKey();
            Board board = entry.getValue();
            if (key.equals(String.valueOf(bno))) {
                continue;
            } else if (Integer.parseInt(key) < bno) {
                newBoardMap.put(key, board);
                num++;
            } else {
                newBoardMap.put(String.valueOf(num), board);
                board.setBNo(num);
                num++;
            }
        }
        boardManger.setBoardMap(newBoardMap);
    }

//     read의 옵션 delete
//    public void delete(int bno) {
//        boardManger.getBoardMap().remove(String.valueOf(bno));
//
//    }

//     게시판 내용 전체 삭제
    public void clear() {
        System.out.println("[게시물 전체 삭제]");
        if (checkMenu()) {
            boardManger.getBoardMap().clear();
            bno=1;
            System.out.println("모든 게시물이 삭제되었습니다.");
        }
    }
}