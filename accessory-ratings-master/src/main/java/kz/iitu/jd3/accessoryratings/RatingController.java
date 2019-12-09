package kz.iitu.jd3.accessoryratings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @GetMapping("/{accessoryId}")
    public Rating getRatingByAccessoryId(
            @PathVariable("accessoryId") String accessoryId) {

        return new Rating(accessoryId, 5);
    }
}
