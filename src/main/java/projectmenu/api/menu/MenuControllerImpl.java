package projectmenu.api.menu;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import projectmenu.commons.menu.MenuCreateDTO;
import projectmenu.commons.menu.MenuDTO;
import projectmenu.commons.menu.MenuUpdateDTO;
import projectmenu.services.menu.MenuService;

@RestController
@RequiredArgsConstructor
public class MenuControllerImpl implements MenuController{

    private final MenuService menuService;
    @Override
    public MenuDTO create(MenuCreateDTO menuCreateDTO) {
        return menuService.create(menuCreateDTO);
    }

    @Override
    public MenuDTO update(MenuUpdateDTO menuUpdateDTO) {
        return null;
    }
}
