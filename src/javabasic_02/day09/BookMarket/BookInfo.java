package javabasic_02.day09.BookMarket;

import javabasic_02.day07.Book;

public class BookInfo {
    private String book_id;
    private String book_name;
    private String book_price;      //정수형으로 받을건지 문자열 형으로 받을건지 물어보기
    private String book_author;
    private String book_publisher;
    private String book_type;
    private String book_birthday;

    BookInfo (String book_id,String book_name,String book_price,
         String book_author, String book_publisher, String book_type, String book_birthday) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_price = book_price;
        this.book_author = book_author;
        this.book_publisher = book_publisher;
        this.book_type = book_type;
        this.book_birthday = book_birthday;
    }
    //일단은 getter만

    public String getBook_id() {
        return book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public String getBook_price() {
        return book_price;
    }

    public String getBook_author() {
        return book_author;
    }

    public String getBook_publisher() {
        return book_publisher;
    }

    public String getBook_type() {
        return book_type;
    }

    public String getBook_birthday() {
        return book_birthday;
    }
}
