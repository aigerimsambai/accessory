package kz.iitu.jd3.accessoryinfo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserAccessory {

    private List<kz.iitu.jd3.accessoryinfo.Accessory> userAccessories;

    public UserAccessory() {
    }

    public UserAccessory(List<kz.iitu.jd3.accessoryinfo.Accessory> userAccessories) {
        this.userAccessories = userAccessories;
    }
}
