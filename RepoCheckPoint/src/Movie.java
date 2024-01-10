import java.util.Date;

public class Movie {

    private String title;
    private Date releaseDate;
    private Boolean watched;

    public Movie(String title, Date releaseDate, Boolean watched) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.watched = false;
    }

    public String getTitle() {
        return title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public Boolean getWatched() {
        return watched;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setWatched(Boolean watched) {
        this.watched = watched;
    }
}