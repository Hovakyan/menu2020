package projectmenu.convertation;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import projectmenu.commons.menu.MenuCreateDTO;
import projectmenu.commons.menu.MenuDTO;
import projectmenu.commons.menu.MenuUpdateDTO;
import projectmenu.entityes.MenuEntity;
import projectmenu.entityes.MenuItemEntity;
import projectmenu.entityes.RestaurantEntity;
import projectmenu.repository.MenuItemRepository;
import projectmenu.repository.MenuRepository;
import projectmenu.repository.RestaurantRepository;

@Component
@Getter
@Setter
@RequiredArgsConstructor
public class MenuConvert {
    private final MenuRepository menuRepository;
    private final MenuItemRepository menuItemRepository;

    public MenuEntity convert(MenuCreateDTO menuCreateDTO){
        MenuEntity menuEntity = new MenuEntity();
        menuEntity.setName(menuCreateDTO.getName());

    return menuEntity;
    }

   public MenuDTO convert(MenuEntity menuEntity){
        MenuDTO menuDTO = new MenuDTO();
        menuDTO.setId(menuEntity.getId());
        menuDTO.setName(menuEntity.getName());
        return menuDTO;
    }

   public void update (MenuUpdateDTO menuUpdateDTO){
        MenuEntity menuEntity = menuRepository.getOne(menuUpdateDTO.getId());
        menuEntity.setName(menuUpdateDTO.getName());

    }

}
