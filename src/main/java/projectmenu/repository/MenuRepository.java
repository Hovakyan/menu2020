package projectmenu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projectmenu.entityes.MenuEntity;

public interface MenuRepository extends JpaRepository<MenuEntity,Long> {
}
