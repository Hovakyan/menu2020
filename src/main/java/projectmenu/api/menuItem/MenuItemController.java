package projectmenu.api.menuItem;

import org.springframework.web.bind.annotation.*;
import projectmenu.commons.menuItem.MenuItemCreateDTO;
import projectmenu.commons.menuItem.MenuItemDTO;
import projectmenu.commons.menuItem.MenuItemUpdateDTO;

import java.util.List;

@RequestMapping("/menuItem")
public interface MenuItemController {

    @PostMapping
    MenuItemDTO create(@RequestBody MenuItemCreateDTO menuItemCreateDTO);

    @PutMapping
    MenuItemDTO update(@RequestBody MenuItemUpdateDTO menuItemUpdateDTO);

    @DeleteMapping("/{id}")
    void delete(@PathVariable ("id") Long id);

    @GetMapping("/all/{id}")
    List<MenuItemDTO> getAll (@PathVariable("id") Long id);

    @GetMapping("/{id}")
        MenuItemDTO getOne(@PathVariable("id") Long id );

}
