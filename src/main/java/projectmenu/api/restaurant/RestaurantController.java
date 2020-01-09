package projectmenu.api.restaurant;

import org.springframework.web.bind.annotation.*;
import projectmenu.commons.restaurant.RestaurantCreateDTO;
import projectmenu.commons.restaurant.RestaurantDTO;

import java.util.List;

@RequestMapping("/restaurant")
public interface RestaurantController {

    @PostMapping
    RestaurantDTO create(@RequestBody RestaurantCreateDTO restaurantCreateDTO);

   @GetMapping
    List<RestaurantDTO> getAll();

    @DeleteMapping("/{id}")
    void delete(@PathVariable ("id") Long id);

    @GetMapping("/{id}")
    RestaurantDTO getOne(@PathVariable ("id") Long id);
}
