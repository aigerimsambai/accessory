package kz.iitu.jd3.accessorycatalog;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RatingService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(
            fallbackMethod = "getAccessoryRatingFallback",
            threadPoolKey = "getAccessoryRating",
            threadPoolProperties = {
                    @HystrixProperty(name="coreSize", value="100"),
                    @HystrixProperty(name="maximumSize", value="120"),
                    @HystrixProperty(name="maxQueueSize", value="50"),
                    @HystrixProperty(name="allowMaximumSizeToDivergeFromCoreSize", value="true"),
            })
    public Rating getAccessoryRating(String accessoryId) {
        return restTemplate.getForObject(
                "http://accessory-ratings-service/rating/" + accessoryId,
                Rating.class);
    }
    public Rating getAccessoryRatingFallback(String accessoryId) {
        return new Rating(accessoryId, 0);
    }
}
