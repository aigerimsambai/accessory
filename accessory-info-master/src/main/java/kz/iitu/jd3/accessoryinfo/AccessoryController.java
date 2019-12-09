package kz.iitu.jd3.accessoryinfo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/accessory/info")
public class AccessoryController {


    @GetMapping("/{userId}")
    public UserAccessory getAccessoriesByUserId(
            @PathVariable("userId") String userId) {

        List<Accessory> userAccessoryList =  Arrays.asList(
    new Accessory("1", "Title 1", "Tt", "Desc 1"),
    new Accessory("2", "Title 2", "Ttt", "Desc 2"));

        UserAccessory userAccessory = new UserAccessory(userAccessoryList);

        return userAccessory;
    }
    @GetMapping("/detail/{id}")
    public Accessory getAccessoryById(@PathVariable("id") String id) {

        return new kz.iitu.jd3.accessoryinfo.Accessory(id, id + " - Samsung", "A70", "Triple camera");
    }
}
