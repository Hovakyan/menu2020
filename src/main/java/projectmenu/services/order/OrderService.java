package projectmenu.services.order;

import org.springframework.stereotype.Service;
import projectmenu.commons.order.OrderDTO;
import projectmenu.commons.orderItems.OrderItemsCreateDTO;

@Service
public interface OrderService {

    OrderDTO create(OrderItemsCreateDTO orderItemsCreateDTO);

}
