package projectmenu.services.menu;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import projectmenu.commons.menu.MenuCreateDTO;
import projectmenu.commons.menu.MenuDTO;
import projectmenu.commons.menu.MenuUpdateDTO;
import projectmenu.convertation.MenuConvert;
import projectmenu.entityes.MenuEntity;
import projectmenu.repository.MenuRepository;

@Component
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {

    private final MenuConvert menuConvert;
    private final MenuRepository menuRepository;

    @Override
    public MenuDTO create(MenuCreateDTO menuCreateDTO) {
        MenuEntity menuEntity = menuConvert.convert(menuCreateDTO);
        menuRepository.save(menuEntity);
        return menuConvert.convert(menuEntity);
    }

    @Override
    public MenuDTO update(MenuUpdateDTO menuUpdateDTO) {
        MenuEntity menuEntity = menuRepository.getOne(menuUpdateDTO.getId());
        menuConvert.update(menuUpdateDTO);
        menuRepository.save(menuEntity);
        return menuConvert.convert(menuEntity);
    }

    @Override
    public void delete(Long id) {
        MenuEntity menuEntity = menuRepository.getOne(id);
        menuRepository.delete(menuEntity);

    }
}
