package javabasic_02.day09.BookMarket.cart;

import javabasic_02.day09.BookMarket.bookitem.Book;

public interface CartInterface {

    void printBookList(Book[] p);

    boolean isCarInBook(String id);

    void insertBook(Book p);

    void removeCart(int numId);

    void deleteBook();
}
