package javabasic_02.day07;

public class MovieTest {
    public static void main(String[] args) {
        Movie movie1 = new Movie();

        movie1.moviename = "아바타";
        movie1.openday = "2022.12.14";
        movie1.mainactor = "제이크설리";
        movie1.genre = "액션";
        movie1.runtime = 192;
        movie1.movieage = 12;
//
//        System.out.print(movie1.moviename +" ");
//        System.out.print(movie1.openday+" ");
//        System.out.print(movie1.mainactor+" ");
//        System.out.print(movie1.genre+" ");
//        System.out.print(movie1.runtime+" ");
//        System.out.print(movie1.movieage+" ");

        //Movie 클래스 타입으로 영화 3편을 배열 movieList에 저장하고
        //저장한 영화의 제목을 iter 방법으로 출력
        Movie[] movieList = new Movie[3];
        Movie movie2 = new Movie();
        movie2.moviename = "좀비딸";

        Movie movie3 = new Movie();
        movie3.moviename = "아이언맨";

        movieList[0] = movie1;
        movieList[1] = movie2;
        movieList[2] = movie3;

        System.out.println("---------각 배열의 인덱스를 참조 출력 ---------");
        System.out.println("01 영화제목" + movieList[0]);
        System.out.println("01 영화제목" + movieList[1]);
        System.out.println("01 영화제목" + movieList[2]);

        System.out.println("---------iter 참조 출력 ---------");
        for (Movie movie : movieList) {
            System.out.println(movie.moviename);
        }
        System.out.println("---------itar 참조 출력 ---------");
        for (int i = 0; i < movieList.length; i++) {
            Movie movie = movieList[i];
            System.out.println(i+"번째"+movie.moviename);

        }
    }
}
