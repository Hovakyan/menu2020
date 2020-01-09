package projectmenu.api.menuItem;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import projectmenu.commons.menuItem.MenuItemCreateDTO;
import projectmenu.commons.menuItem.MenuItemDTO;
import projectmenu.commons.menuItem.MenuItemUpdateDTO;
import projectmenu.entityes.MenuItemEntity;
import projectmenu.services.menuItem.MenuItemService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MenuItemControllerImpl implements MenuItemController {

    private final MenuItemService menuItemService;

    @Override
    public MenuItemDTO create(MenuItemCreateDTO menuItemCreateDTO) {
        return menuItemService.create(menuItemCreateDTO);
    }

    @Override
    public MenuItemDTO update(MenuItemUpdateDTO menuItemUpdateDTO) {

        return menuItemService.update(menuItemUpdateDTO);
    }

    @Override
    public void delete(Long id) {
    menuItemService.delete(id);
    }

    @Override
    public List<MenuItemDTO> getAll(Long id) {
        return menuItemService.getAll(id);
    }

    @Override
    public MenuItemDTO getOne(Long id) {
        return menuItemService.getOne(id);
    }
}
