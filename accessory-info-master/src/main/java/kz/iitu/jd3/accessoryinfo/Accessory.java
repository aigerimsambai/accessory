package kz.iitu.jd3.accessoryinfo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Accessory {

    public Accessory() {
    }

    public Accessory(String id, String title, String model, String description) {
        this.id = id;
        this.title = title;
        this.model = model;
        this.description = description;
    }

    private String id;
    private String title;
    private String model;
    private String description;
}
