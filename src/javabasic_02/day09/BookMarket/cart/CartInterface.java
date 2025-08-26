package javabasic_02.day09.BookMarket.cart;

import javabasic_02.day09.BookMarket.bookitem.Book;

import java.util.ArrayList;

public interface CartInterface {

    void printBookList(ArrayList<Book> p);

    boolean isCarInBook(String id);

    void insertBook(Book p);

    void removeCart(int numId);

    void deleteBook();
}
