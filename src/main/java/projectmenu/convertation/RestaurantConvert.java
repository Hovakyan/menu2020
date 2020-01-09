package projectmenu.convertation;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import projectmenu.commons.menu.MenuUpdateDTO;
import projectmenu.commons.restaurant.RestaurantCreateDTO;
import projectmenu.commons.restaurant.RestaurantDTO;
import projectmenu.entityes.MenuEntity;
import projectmenu.entityes.RestaurantEntity;
import projectmenu.repository.MenuRepository;

@Component
@Getter
@Setter
@RequiredArgsConstructor
public class RestaurantConvert {
    private final MenuRepository menuRepository;

   public RestaurantEntity convert(RestaurantCreateDTO  restaurantCreateDTO){
       MenuEntity menuEntity = menuRepository.getOne(restaurantCreateDTO.getId());
       RestaurantEntity restaurantEntity = new RestaurantEntity();
        restaurantEntity.setName(restaurantCreateDTO.getName());
        restaurantEntity.setMenuEntity(menuEntity);
        return restaurantEntity;
    }

   public RestaurantDTO convert(RestaurantEntity restaurantEntity){
        RestaurantDTO restaurantDTO = new RestaurantDTO();
        restaurantDTO.setId(restaurantEntity.getId());
        restaurantDTO.setName(restaurantEntity.getName());
        return restaurantDTO;
    }

    public RestaurantDTO convertid(RestaurantEntity restaurantEntity){
       RestaurantDTO restaurantDTO = new RestaurantDTO();
       restaurantDTO.setName(restaurantEntity.getName());
       restaurantDTO.setId(restaurantEntity.getMenuEntity().getId());
       return restaurantDTO;
    }

}
