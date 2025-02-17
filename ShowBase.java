
import java.util.Objects;

public abstract class ShowBase {
    protected String id;
    protected String title;

    public ShowBase(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ShowBase show = (ShowBase) obj;
        return Objects.equals(id, show.id) && Objects.equals(title, show.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }
}
