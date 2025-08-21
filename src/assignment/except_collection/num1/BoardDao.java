package assignment.except_collection.num1;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

    public List<Board> getBoardList() {
        List<Board> dao = new ArrayList<>();

        for (int i = 1; i<=3;i++) {
            Board da = new Board("제목"+i,"내용"+i);
            dao.add(da);
        }
        return dao;
    }
}
