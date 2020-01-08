package projectmenu.api.menu;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import projectmenu.commons.menu.MenuCreateDTO;
import projectmenu.commons.menu.MenuDTO;
import projectmenu.commons.menu.MenuUpdateDTO;

@RequestMapping("/menu")
public interface MenuController {


    @PostMapping
    MenuDTO create(@RequestBody MenuCreateDTO menuCreateDTO);

    @PutMapping
    MenuDTO update(@RequestBody MenuUpdateDTO menuUpdateDTO);

}
