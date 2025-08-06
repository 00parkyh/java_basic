package javabasic_02.day11.inheritance.qa.test.testClass01;

public class Movie {
     String title;
     String genre;

    public void play() {
        System.out.println(getTitle()+"("+getGenre()+")"+" 상영중 입니다.");
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }
}
