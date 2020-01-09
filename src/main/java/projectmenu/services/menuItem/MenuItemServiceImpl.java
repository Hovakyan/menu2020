package projectmenu.services.menuItem;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import projectmenu.commons.menuItem.MenuItemCreateDTO;
import projectmenu.commons.menuItem.MenuItemDTO;
import projectmenu.commons.menuItem.MenuItemUpdateDTO;
import projectmenu.convertation.MenuItemConvert;
import projectmenu.entityes.MenuItemEntity;
import projectmenu.repository.MenuItemRepository;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public MenuItemDTO update(MenuItemUpdateDTO menuItemUpdateDTO) {
        MenuItemEntity menuItemEntity = menuItemRepository.getOne(menuItemUpdateDTO.getId());
        menuItemConvert.update(menuItemUpdateDTO);
        menuItemRepository.save(menuItemEntity);
        return menuItemConvert.convert(menuItemEntity);
    }

    @Override
    public void delete(Long id) {
        MenuItemEntity menuItemEntity = menuItemRepository.getOne(id);
        menuItemRepository.delete(menuItemEntity);

    }

    @Override
    public List<MenuItemDTO> getAll(Long id) {
        List<MenuItemDTO> list = new ArrayList<>();
        for (MenuItemEntity r:menuItemRepository.findAll()
             ) {
            if (r.getMenuEntity().getId().equals(id)){
                list.add(menuItemConvert.convert(r));
            }
        }
        return list;
    }

    @Override
    public MenuItemDTO getOne(Long id) {
        MenuItemEntity menuItemEntity = menuItemRepository.getOne(id);
        return menuItemConvert.convert(menuItemEntity);
    }
}
