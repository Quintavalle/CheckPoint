import java.util.Date;

public class Main {


    public static void main(String[] args) {

        MovieList movieList = new MovieList();

        Movie movie1 = new Movie("Film 1", new Date(2005, 03, 18), false);
        Movie movie2 = new Movie("Film 2", new Date(2010, 06, 26), true);
        Movie movie3 = new Movie("Film 2", new Date(2018, 04, 13), false);

        movieList.addMovie(movie1);
        movieList.addMovie(movie2);
        movieList.addMovie(movie3);

        movieList.ElencoMovies();

        movieList.MarkAsSeen(movie1);
        movieList.removeMovie(movie2);

        movieList.ElencoMovies();
    }
}