package projectmenu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projectmenu.entityes.RestaurantEntity;

public interface RestaurantRepository extends JpaRepository<RestaurantEntity,Long> {
}
