package kz.iitu.jd3.bookratings;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rating {

    public Rating() {
    }

    public Rating(String accessoryId, Integer rating) {
        this.accessoryId = accessoryId;
        this.rating = rating;
    }

    private String accessoryId;
    private Integer rating; // 0 to 5
}
