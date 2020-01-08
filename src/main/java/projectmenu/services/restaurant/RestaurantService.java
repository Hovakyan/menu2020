package projectmenu.services.restaurant;

import org.springframework.stereotype.Service;
import projectmenu.commons.restaurant.RestaurantCreateDTO;
import projectmenu.commons.restaurant.RestaurantDTO;

@Service
public interface RestaurantService {

    RestaurantDTO create (RestaurantCreateDTO restaurantCreateDTO);

}
