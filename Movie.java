import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Movie extends ShowBase {
    private String type;
    private String language;
    private String releaseDate;
    private String description;
    private String director;
    private List<String> showTimings;
    private int ageRestriction;
    private double rating;
    private double pricePerTicket;

    public Movie(String id, String title, String type, String language, String releaseDate, String description,
                 String director, List<String> showTimings, int ageRestriction, double rating, double pricePerTicket) {
        super(id, title);
        this.type = type;
        this.language = language;
        this.releaseDate = releaseDate;
        this.description = description;
        this.director = director;
        this.showTimings = new ArrayList<>(showTimings);
        this.ageRestriction = ageRestriction;
        this.rating = rating;
        this.pricePerTicket = pricePerTicket;
    }

    public List<String> getShowTimings() {
        return Collections.unmodifiableList(showTimings);
    }

    public void addShowTiming(String timing) {
        showTimings.add(timing);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", language='" + language + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", description='" + description + '\'' +
                ", director='" + director + '\'' +
                ", showTimings=" + showTimings +
                ", ageRestriction=" + ageRestriction +
                ", rating=" + rating +
                ", pricePerTicket=" + pricePerTicket +
                '}';
    }
}