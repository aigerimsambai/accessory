package kz.iitu.jd3.accessorycatalog;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccessoryCatalog {

    public AccessoryCatalog() {
    }

    public AccessoryCatalog(String title, String model, Integer rating) {
        this.title = title;
        this.model = model;
        this.rating = rating;
    }

    private String title;
    private String model;
    private Integer rating;
}
