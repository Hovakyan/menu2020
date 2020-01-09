package projectmenu.api.order;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.RestController;
import projectmenu.commons.order.OrderCreateDTO;
import projectmenu.commons.order.OrderDTO;
import projectmenu.services.order.OrderService;
@Getter
@Setter
@RestController
@RequiredArgsConstructor
public class OrderControllerImpl implements OrderController{

    private final OrderService orderService;

    @Override
    public OrderDTO create(OrderCreateDTO orderCreateDTO) {
        return orderService.create(orderCreateDTO);
    }
}
