package projectmenu.services.orderItems;

import org.springframework.stereotype.Component;
import projectmenu.commons.order.OrderDTO;
import projectmenu.commons.orderItems.OrderItemsCreateDTO;
import projectmenu.services.order.OrderService;

@Component
public class OrderItemsServiceImpl implements OrderService {

    @Override
    public OrderDTO create(OrderItemsCreateDTO orderItemsCreateDTO) {
        return null;
    }
}
