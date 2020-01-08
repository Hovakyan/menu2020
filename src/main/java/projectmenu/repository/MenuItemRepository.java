package projectmenu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projectmenu.entityes.MenuItemEntity;

public interface MenuItemRepository extends JpaRepository<MenuItemEntity,Long> {
}
