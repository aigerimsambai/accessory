package kz.iitu.jd3.accessoryrequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/accessory/request")
public class AccessoryRequestController {

    private final Producer producer;
    private AccessoryInformationService accessoryInformationService;

    @Autowired
    public AccessoryRequestController(Producer producer, AccessoryInformationService accessoryInformationService) {
        this.producer = producer;
        this.accessoryInformationService = accessoryInformationService;
    }

    // TODO Ideally there should POST request
    @GetMapping
    public String sendMessageToKafkaTopic2(@RequestParam("userId") String userId,
                                           @RequestParam("accessoryId") String accessoryId) {

        AccessoryRequest accessoryRequest = new AccessoryRequest(userId, accessoryInformationService.getAccessoryById(accessoryId));
        this.producer.accessoryRequestNotify(accessoryRequest);
        return "Your request sent successful!";
    }
}