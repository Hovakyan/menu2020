package projectmenu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projectmenu.entityes.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity,Long> {
}
