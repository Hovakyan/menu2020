package projectmenu.api.menuItem;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import projectmenu.commons.menuItem.MenuItemCreateDTO;
import projectmenu.commons.menuItem.MenuItemDTO;
import projectmenu.services.menuItem.MenuItemService;
@RestController
@RequiredArgsConstructor
public class MenuItemControllerImpl implements MenuItemController {

    private final MenuItemService menuItemService;

    @Override
    public MenuItemDTO create(MenuItemCreateDTO menuItemCreateDTO) {
        return menuItemService.create(menuItemCreateDTO);
    }
}
