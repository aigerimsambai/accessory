package kz.iitu.jd3.notifyservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Accessory {

    private String id;
    private String title;
    private String model;
    private String description;

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
