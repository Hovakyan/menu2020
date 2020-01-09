package projectmenu.services.restaurant;

import org.springframework.stereotype.Service;
import projectmenu.commons.restaurant.RestaurantCreateDTO;
import projectmenu.commons.restaurant.RestaurantDTO;

import java.util.List;

@Service
public interface RestaurantService {

    RestaurantDTO create (RestaurantCreateDTO restaurantCreateDTO);
    void delete(Long id);
    List<RestaurantDTO> getAll();
    RestaurantDTO getOne(Long id);


}
