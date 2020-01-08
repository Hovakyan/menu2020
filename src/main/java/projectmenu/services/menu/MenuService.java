package projectmenu.services.menu;

import org.springframework.stereotype.Service;
import projectmenu.commons.menu.MenuCreateDTO;
import projectmenu.commons.menu.MenuDTO;

@Service
public interface MenuService {

    MenuDTO create(MenuCreateDTO menuCreateDTO);
}
