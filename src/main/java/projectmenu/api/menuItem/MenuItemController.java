package projectmenu.api.menuItem;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import projectmenu.commons.menuItem.MenuItemCreateDTO;
import projectmenu.commons.menuItem.MenuItemDTO;

@RequestMapping("/menuItem")
public interface MenuItemController {

    @PostMapping
    MenuItemDTO create(@RequestBody MenuItemCreateDTO menuItemCreateDTO);


}
