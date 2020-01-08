package projectmenu.services.order;

import org.springframework.stereotype.Component;
import projectmenu.commons.order.OrderDTO;
import projectmenu.commons.orderItems.OrderItemsCreateDTO;

@Component
public class OrderServiceImpl implements OrderService {

    @Override
    public OrderDTO create(OrderItemsCreateDTO orderItemsCreateDTO) {
        return null;
    }
}
