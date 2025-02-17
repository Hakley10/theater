
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theater extends ShowBase {
    private String location;
    private int seatingCapacity;
    private static int totalTheaters = 0;
    private static List<String> theaterIds = new ArrayList<>();
    private List<Movie> movieList;
    private List<String> bookingList;

    public Theater(String id, String title, String location, int seatingCapacity) {
        super(id, title);
        if (theaterIds.contains(id)) {
            throw new IllegalArgumentException("Theater ID already exists.");
        }
        this.location = location;
        this.seatingCapacity = seatingCapacity;
        this.movieList = new ArrayList<>();
        this.bookingList = new ArrayList<>();
        theaterIds.add(id);
        totalTheaters++;
    }

    public static int showTotalTheaters() {
        return totalTheaters;
    }

    public void addMovie(Movie movie) {
        movieList.add(movie);
    }

    public List<Movie> getMovies() {
        return Collections.unmodifiableList(movieList);
    }

    public boolean bookSeat(String userId) {
        if (bookingList.size() < seatingCapacity) {
            bookingList.add(userId);
            return true;
        }
        return false;
    }

    public void cancelBooking(String userId) {
        bookingList.remove(userId);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", seatingCapacity=" + seatingCapacity +
                ", totalMovies=" + movieList.size() +
                '}';
    }
}
