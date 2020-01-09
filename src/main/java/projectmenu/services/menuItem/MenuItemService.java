package projectmenu.services.menuItem;

import org.springframework.stereotype.Service;
import projectmenu.commons.menuItem.MenuItemCreateDTO;
import projectmenu.commons.menuItem.MenuItemDTO;
import projectmenu.commons.menuItem.MenuItemUpdateDTO;

import java.util.List;

@Service
public interface MenuItemService {

    MenuItemDTO create(MenuItemCreateDTO menuItemCreateDTO);
    MenuItemDTO update(MenuItemUpdateDTO menuItemUpdateDTO);
    void delete (Long id);
    List<MenuItemDTO> getAll (Long id);
    MenuItemDTO getOne(Long id);
}
