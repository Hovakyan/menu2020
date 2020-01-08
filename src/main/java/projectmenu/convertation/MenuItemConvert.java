package projectmenu.convertation;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import projectmenu.commons.menuItem.MenuItemCreateDTO;
import projectmenu.commons.menuItem.MenuItemDTO;
import projectmenu.entityes.MenuEntity;
import projectmenu.entityes.MenuItemEntity;
import projectmenu.repository.MenuRepository;

@Component
@Getter
@Setter
@RequiredArgsConstructor
public class MenuItemConvert {

    private final MenuRepository menuRepository;

   public MenuItemEntity convert(MenuItemCreateDTO menuItemCreateDTO){
       MenuEntity menuEntity = menuRepository.getOne(menuItemCreateDTO.getId());
        MenuItemEntity menuItemEntity = new MenuItemEntity();
        menuItemEntity.setName(menuItemCreateDTO.getName());
        menuItemEntity.setPrice(menuItemCreateDTO.getPrice());
       menuEntity.getMenuItemEntityList().add(menuItemEntity);
       menuItemEntity.setMenuEntity(menuEntity);
        return menuItemEntity;
    }

   public MenuItemDTO convert(MenuItemEntity menuItemEntity){
        MenuItemDTO menuItemDTO = new MenuItemDTO();
        menuItemDTO.setId(menuItemEntity.getId());
        menuItemDTO.setName(menuItemEntity.getName());
        menuItemDTO.setPrice(menuItemEntity.getPrice());
        return menuItemDTO;
    }

}
