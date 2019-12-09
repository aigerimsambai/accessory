package kz.iitu.jd3.accessoryrequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    private static final String TOPIC = "accessory_requests";

    @Autowired
    private KafkaTemplate<String, AccessoryRequest> kafkaTemplate;

    public String accessoryRequestNotify(AccessoryRequest accessoryRequest) {
        System.out.println(String.format("#### -> Producing accessory request to notification service -> %s", accessoryRequest));
        this.kafkaTemplate.send(TOPIC, accessoryRequest);
        return "Successfully";
    }
}