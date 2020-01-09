package projectmenu.api.orderItems;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.RestController;
import projectmenu.commons.orderItems.OrderItemsCreateDTO;
import projectmenu.commons.orderItems.OrderItemsDTO;
import projectmenu.services.orderItems.OrderItemsService;

@Getter
@Setter
@RestController
@RequiredArgsConstructor
public class OrderItemsControllerImpl implements OrderItemsController {

    private final OrderItemsService orderItemsService;

    @Override
    public OrderItemsDTO create(OrderItemsCreateDTO orderItemsCreateDTO) {
        return orderItemsService.create(orderItemsCreateDTO);
    }
}
