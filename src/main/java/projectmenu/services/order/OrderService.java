package projectmenu.services.order;

import org.springframework.stereotype.Service;
import projectmenu.commons.order.OrderCreateDTO;
import projectmenu.commons.order.OrderDTO;
import projectmenu.commons.order.OrderUpdateDTO;
import projectmenu.commons.orderItems.OrderItemsCreateDTO;

@Service
public interface OrderService {

    OrderDTO create(OrderCreateDTO orderCreateDTO);


}
