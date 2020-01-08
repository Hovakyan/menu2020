package projectmenu.services.restaurant;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import projectmenu.commons.restaurant.RestaurantCreateDTO;
import projectmenu.commons.restaurant.RestaurantDTO;
import projectmenu.convertation.RestaurantConvert;
import projectmenu.entityes.RestaurantEntity;
import projectmenu.repository.RestaurantRepository;

@RequiredArgsConstructor
@Component
public class RestaurantServiceImpl implements RestaurantService {
    private final RestaurantConvert restaurantConvert;
    private final RestaurantRepository restaurantRepository;

    @Override
    public RestaurantDTO create(RestaurantCreateDTO restaurantCreateDTO) {
        RestaurantEntity restaurantEntity = restaurantConvert.convert(restaurantCreateDTO);
        restaurantRepository.save(restaurantEntity);

        return restaurantConvert.convert(restaurantEntity);
    }
}
