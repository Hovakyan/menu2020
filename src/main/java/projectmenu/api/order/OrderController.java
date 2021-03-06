package projectmenu.api.order;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import projectmenu.commons.order.OrderCreateDTO;
import projectmenu.commons.order.OrderDTO;

@RequestMapping("/order")
public interface OrderController {

    @PostMapping
    OrderDTO create(@RequestBody OrderCreateDTO orderCreateDTO);

}
