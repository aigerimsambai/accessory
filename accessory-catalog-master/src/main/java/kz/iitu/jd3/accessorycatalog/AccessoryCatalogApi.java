package kz.iitu.jd3.accessorycatalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@RestController
@RequestMapping("/api/catalog")
public class AccessoryCatalogApi {

    @Autowired
    private AccessoryInformationService accessoryInformationService;
    @Autowired
    private RatingService ratingService;

    @GetMapping("/{userId}")
    public List<AccessoryCatalog> getAllAccessories(
            @PathVariable String userId) {



        // get all accessories by userId
        UserAccessory  userAccessory = accessoryInformationService.getUserAccessories(userId);

        List<AccessoryCatalog> accessoryCatalogList = new ArrayList<>();
        for (Accessory accessory : userAccessory.getUserAccessories()) {
            Rating accessoryRating = ratingService.getAccessoryRating(accessory.getId());

            accessoryCatalogList.add(new AccessoryCatalog(accessory.getTitle(),
                    accessory.getModel(), accessoryRating.getRating()));
        }

        return accessoryCatalogList;
    }


}
