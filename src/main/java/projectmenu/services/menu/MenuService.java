package projectmenu.services.menu;

import org.springframework.stereotype.Service;
import projectmenu.commons.menu.MenuCreateDTO;
import projectmenu.commons.menu.MenuDTO;
import projectmenu.commons.menu.MenuUpdateDTO;

@Service
public interface MenuService {

    MenuDTO create(MenuCreateDTO menuCreateDTO);
    MenuDTO update (MenuUpdateDTO menuUpdateDTO);
    void delete(Long id);
}
