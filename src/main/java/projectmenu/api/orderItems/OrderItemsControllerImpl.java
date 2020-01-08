package projectmenu.api.orderItems;

import org.springframework.web.bind.annotation.RestController;
import projectmenu.commons.orderItems.OrderItemsCreateDTO;
import projectmenu.commons.orderItems.OrderItemsDTO;

@RestController
public class OrderItemsControllerImpl implements OrderItemsController {

    @Override
    public OrderItemsDTO create(OrderItemsCreateDTO orderItemsCreateDTO) {
        return null;
    }
}
