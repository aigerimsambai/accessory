package kz.iitu.jd3.accessoryrequest;

import lombok.Getter;
import lombok.Setter;


public class AccessoryRequest {

    private String userId;
    private Accessory accessory;

    public AccessoryRequest() {
    }

    public AccessoryRequest(String userId, Accessory accessory) {
        this.userId = userId;
        this.accessory = accessory;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Accessory getAccessory() {
        return accessory;
    }

    public void setAccessory(Accessory accessory) {
        this.accessory = accessory;
    }

    @Override
    public String toString() {
        return "AccessoryRequest{" +
                "userId='" + userId + '\'' +
                ", accessory=" + accessory +
                '}';
    }
}
