package projectmenu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projectmenu.entityes.OrderItemsEntity;

public interface OrderItemsRepository extends JpaRepository<OrderItemsEntity,Long> {
}
