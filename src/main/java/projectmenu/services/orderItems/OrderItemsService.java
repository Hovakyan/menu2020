package projectmenu.services.orderItems;

import org.springframework.stereotype.Service;
import projectmenu.commons.orderItems.OrderItemsCreateDTO;
import projectmenu.commons.orderItems.OrderItemsDTO;

@Service
public interface OrderItemsService {

    OrderItemsDTO create(OrderItemsCreateDTO orderItemsCreateDTO);

}
