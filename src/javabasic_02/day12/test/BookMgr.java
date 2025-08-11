package javabasic_02.day12.test;

import java.util.Arrays;

public class BookMgr {
	public Book[] booklist = new Book[5];

	public BookMgr(Book[] booklist) {
		for (int i = 0; i<booklist.length;i++) {
			this.booklist[i] = booklist[i];
		}
	}
	public void printBooklist(){

		for (int i = 0; i<5;i++) {
			System.out.println(booklist[i].getTitle());
		}
	}
	public void printTotalPrice(){
		int sum = 0;
		for (int i = 0; i<booklist.length; i++) {
			sum += booklist[i].getPrice();
		}
		System.out.println("전체 책 가격의 합 : " + sum);
	}
}
