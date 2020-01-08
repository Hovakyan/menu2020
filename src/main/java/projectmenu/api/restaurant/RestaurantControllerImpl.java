package projectmenu.api.restaurant;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import projectmenu.commons.restaurant.RestaurantCreateDTO;
import projectmenu.commons.restaurant.RestaurantDTO;
import projectmenu.services.restaurant.RestaurantService;

import java.lang.annotation.Annotation;

@RestController
@RequiredArgsConstructor
public class RestaurantControllerImpl implements RestaurantController {

    private final RestaurantService restaurantService;
    @Override
    public RestaurantDTO create(RestaurantCreateDTO restaurantCreateDTO)
    {
        return restaurantService.create(restaurantCreateDTO);
    }
}
