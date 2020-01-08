package projectmenu.services.menuItem;

import org.springframework.stereotype.Service;
import projectmenu.commons.menuItem.MenuItemCreateDTO;
import projectmenu.commons.menuItem.MenuItemDTO;

@Service
public interface MenuItemService {

    MenuItemDTO create(MenuItemCreateDTO menuItemCreateDTO);
}
