package projectmenu.api.restaurant;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import projectmenu.commons.restaurant.RestaurantCreateDTO;
import projectmenu.commons.restaurant.RestaurantDTO;

@RequestMapping("/restaurant")
public interface RestaurantController {

    @PostMapping
    RestaurantDTO create(@RequestBody RestaurantCreateDTO restaurantCreateDTO);


}
