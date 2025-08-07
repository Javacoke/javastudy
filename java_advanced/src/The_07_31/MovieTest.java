package The_07_31;

public class MovieTest {
    public static void main(String[] args) {
        Movie movie1 = new Movie();// 박스만들기


        movie1.mTitle ="아바타";
        movie1.openDay ="2022.12.14";
        movie1.mactpr ="제이크 설러";
        movie1.mgenre ="액션";
        movie1.runningTime =192;
        movie1.mGrade ="12세";

        System.out.println("영화");


        Movie movie2 = new Movie();
        movie2.mTitle= "신세계";
        Movie movie3 = new Movie();
        movie3.mTitle= "아가씨";

        Movie[] movieList = new Movie[3];

        movieList[0]=movie1;
        movieList[1]=movie2;
        movieList[2]=movie3;

        for (int i = 0; i < movieList.length; i++) {
            Movie movie = movieList[i];
            System.out.println(movie.mTitle);


        }


    }

}
