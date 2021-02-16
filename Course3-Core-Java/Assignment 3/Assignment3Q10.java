
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MovieDetails {
    private String movieName;
    private String actor;
    private String actress;
    private String genre;

    public MovieDetails(String movieName, String actor, String actress, String genre) {
        this.movieName = movieName;
        this.actor = actor;
        this.actress = actress;
        this.genre = genre;
    }

    @Override
    public boolean equals(Object obj) {
        MovieDetails mObj = (MovieDetails) obj;
        if(movieName.equals(mObj.getMovieName()) && actor.equals(mObj.getActor()) && actress.equals(mObj.getActress()) && genre.equals(mObj.getGenre())){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "MovieDetails{" +
                "movieName='" + movieName + '\'' +
                ", actor='" + actor + '\'' +
                ", actress='" + actress + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActress() {
        return actress;
    }

    public void setActress(String actress) {
        this.actress = actress;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

class Movie_DetailsList{
    private static ArrayList<MovieDetails> movies = new ArrayList<>();

    public void add_movie(MovieDetails movie){
        movies.add(movie);
    }

    public void remove_movie(String movieName){
        movies.removeIf(movie -> movie.getMovieName().equals(movieName));
    }

    public void remove_AllMovies(List<MovieDetails> moviesList){
        for(MovieDetails movie : moviesList){
            movies.remove(movie);
        }
    }

    public MovieDetails find_movie_By_mov_Name(String name){
        for(MovieDetails movie : movies){
            if(movie.getMovieName().equals(name)){
                return movie;
            }
        }
        return null;
    }

    public List<MovieDetails> find_movie_By_Genre(String genre){
        ArrayList<MovieDetails> genreList = new ArrayList<>();
        for(MovieDetails movie : movies){
            if(movie.getGenre().equals(genre)){
                genreList.add(movie);
            }
        }
        return genreList;
    }
}

public class Assignment3Q10 {

    Movie_DetailsList detailsList = new Movie_DetailsList();

    public static void main(String[] args) {
    }

    public static void sort(ArrayList<MovieDetails> movieDetails, Comparator<MovieDetails> movieDetailsComparator){
        System.out.println(movieDetails);
        movieDetails.sort(movieDetailsComparator);
    }

    public static void printSortedMovieList(ArrayList<MovieDetails> movieDetails){
        for(MovieDetails movie : movieDetails){
            System.out.println(movie);
        }
    }
    public void addMovie(MovieDetails movie) {
        detailsList.add_movie(movie);
    }

    public void removeMovies(String movieName) {
        detailsList.remove_movie(movieName);
    }

    public void removeAllMovies(List<MovieDetails> movies) {
        detailsList.remove_AllMovies(movies);
    }

    public MovieDetails find_movie_By_mov_Name(String movieName) {
        return detailsList.find_movie_By_mov_Name(movieName);
    }

    public List<MovieDetails> find_movie_By_Genre(String genre) {
        return detailsList.find_movie_By_Genre(genre);
    }

    public static Comparator<MovieDetails> sortAccordingly(String sortBy) {
        Comparator<MovieDetails> movieDetailsComparator = null;
        if(sortBy.equals("movieName")){
            movieDetailsComparator = new Comparator<MovieDetails>() {
                @Override
                public int compare(MovieDetails o1, MovieDetails o2) {
                    return o1.getMovieName().compareTo(o2.getMovieName());
                }
            };
        }else if(sortBy.equals("actor")){
            movieDetailsComparator = new Comparator<MovieDetails>() {
                @Override
                public int compare(MovieDetails o1, MovieDetails o2) {
                    return o1.getActor().compareTo(o2.getActor());
                }
            };
        }else if(sortBy.equals("actress")){
            movieDetailsComparator = new Comparator<MovieDetails>() {
                @Override
                public int compare(MovieDetails o1, MovieDetails o2) {
                    return o1.getActress().compareTo(o2.getActress());
                }
            };
        }else if(sortBy.equals("genre")){
            movieDetailsComparator = new Comparator<MovieDetails>() {
                @Override
                public int compare(MovieDetails o1, MovieDetails o2) {
                    return o1.getGenre().compareTo(o2.getGenre());
                }
            };
        }
        return movieDetailsComparator;
    }
}
//
//<MovieDetails{movieName='10', actor='Vikram', actress='Sam', genre='Action'}>
//but was:
//<MovieDetails{movieName='10', actor='Vikram', actress='Sam', genre='Action'}>