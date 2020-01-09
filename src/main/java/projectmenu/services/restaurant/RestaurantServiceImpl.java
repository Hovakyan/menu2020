package projectmenu.services.restaurant;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import projectmenu.commons.restaurant.RestaurantCreateDTO;
import projectmenu.commons.restaurant.RestaurantDTO;
import projectmenu.convertation.RestaurantConvert;
import projectmenu.entityes.RestaurantEntity;
import projectmenu.repository.RestaurantRepository;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public void delete(Long id) {
        RestaurantEntity restaurantEntity = restaurantRepository.getOne(id);
        restaurantRepository.delete(restaurantEntity);
    }

    @Override
    public List<RestaurantDTO> getAll() {
       List<RestaurantDTO> list = new ArrayList<>();
        for (RestaurantEntity r:restaurantRepository.findAll()
             ) {
            list.add(restaurantConvert.convert(r));
        }
        return list;
    }

    @Override
    public RestaurantDTO getOne(Long id) {
        RestaurantEntity restaurantEntity = restaurantRepository.getOne(id);
        return restaurantConvert.convertid(restaurantEntity);
    }
}
