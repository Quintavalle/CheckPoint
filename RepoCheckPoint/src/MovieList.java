import java.util.ArrayList;

public class MovieList {
    ArrayList<Movie> movies;

    public MovieList(){
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public void removeMovie(Movie movie){
        movies.remove(movie);
    }

    public void ElencoMovies(){
        for(Movie movie : movies){
            System.out.println("Titolo: " + movie.getTitle() + ", Data di uscita: " + movie.getReleaseDate() + " Stato di visione: " + (movie.getWatched() ? "Visto" : "Non visto"));
        }
    }

    public void MarkAsSeen(Movie movie){
        movie.setWatched(true);
        System.out.println("Il film " + movie.getTitle() + " è stato visto.");
    }


}