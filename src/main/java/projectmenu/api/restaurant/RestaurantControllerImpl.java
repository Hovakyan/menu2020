package projectmenu.api.restaurant;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import projectmenu.commons.restaurant.RestaurantCreateDTO;
import projectmenu.commons.restaurant.RestaurantDTO;
import projectmenu.services.restaurant.RestaurantService;

import java.lang.annotation.Annotation;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class RestaurantControllerImpl implements RestaurantController {

    private final RestaurantService restaurantService;
    @Override
    public RestaurantDTO create(RestaurantCreateDTO restaurantCreateDTO)
    {
        return restaurantService.create(restaurantCreateDTO);
    }


    @Override
    public void delete(Long id) {
        restaurantService.delete(id);
    }

    @Override
    public List<RestaurantDTO> getAll() {

        return restaurantService.getAll();
    }

    @Override
    public RestaurantDTO getOne(Long id) {
        return restaurantService.getOne(id);
    }
}
