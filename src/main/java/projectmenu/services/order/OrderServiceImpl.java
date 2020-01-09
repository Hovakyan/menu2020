package projectmenu.services.order;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import projectmenu.commons.order.OrderCreateDTO;
import projectmenu.commons.order.OrderDTO;
import projectmenu.commons.order.OrderUpdateDTO;
import projectmenu.commons.orderItems.OrderItemsCreateDTO;
import projectmenu.convertation.OrderConvert;
import projectmenu.entityes.OrderEntity;
import projectmenu.repository.OrderRepository;
@Getter
@Setter
@Component
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final OrderConvert orderConvert;



    @Override
    public OrderDTO create(OrderCreateDTO orderCreateDTO) {
        OrderEntity orderEntity = orderConvert.convert(orderCreateDTO);
        orderRepository.save(orderEntity);
        return orderConvert.convert(orderEntity);
    }


}
