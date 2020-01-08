package projectmenu.services.menuItem;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import projectmenu.commons.menuItem.MenuItemCreateDTO;
import projectmenu.commons.menuItem.MenuItemDTO;
import projectmenu.convertation.MenuItemConvert;
import projectmenu.entityes.MenuItemEntity;
import projectmenu.repository.MenuItemRepository;

@Component
@RequiredArgsConstructor
public class MenuItemServiceImpl implements MenuItemService {

    private final MenuItemRepository menuItemRepository;
    private final MenuItemConvert menuItemConvert;

    @Override
    public MenuItemDTO create(MenuItemCreateDTO menuItemCreateDTO) {
        MenuItemEntity menuItemEntity = menuItemConvert.convert(menuItemCreateDTO);
        menuItemRepository.save(menuItemEntity);
        return menuItemConvert.convert(menuItemEntity);

    }
}
