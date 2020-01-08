package projectmenu.api.orderItems;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import projectmenu.commons.orderItems.OrderItemsCreateDTO;
import projectmenu.commons.orderItems.OrderItemsDTO;

@RequestMapping("/orderItems")
public interface OrderItemsController {

    OrderItemsDTO create(@RequestBody OrderItemsCreateDTO orderItemsCreateDTO);

}
