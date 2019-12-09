package kz.iitu.jd3.accessoryrequest;

public class Accessory {

    private String id;
    private String title;
    private String model;
    private String description;

    public Accessory() {
    }

    public Accessory(String id, String title, String model, String description) {
        this.id = id;
        this.title = title;
        this.model = model;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return model;
    }

    public void setAuthor(String author) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Accessory{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", model='" + model + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
