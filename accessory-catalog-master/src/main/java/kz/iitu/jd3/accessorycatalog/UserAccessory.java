package kz.iitu.jd3.accessorycatalog;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserAccessory {

    private List<Accessory> userAccessories;

    public UserAccessory() {
    }

    public UserAccessory(List<Accessory> userAccessories) {
        this.userAccessories = userAccessories;
    }

    public void setUserAccessories(List<Accessory> list) {
    }
}
