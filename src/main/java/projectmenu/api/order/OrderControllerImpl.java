package projectmenu.api.order;

import org.springframework.web.bind.annotation.RestController;
import projectmenu.commons.order.OrderCreateDTO;
import projectmenu.commons.order.OrderDTO;
@RestController
public class OrderControllerImpl implements OrderController{
    @Override
    public OrderDTO create(OrderCreateDTO orderCreateDTO) {
        return null;
    }
}
