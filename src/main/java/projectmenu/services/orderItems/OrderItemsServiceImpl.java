package projectmenu.services.orderItems;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import projectmenu.commons.order.OrderDTO;
import projectmenu.commons.orderItems.OrderItemsCreateDTO;
import projectmenu.commons.orderItems.OrderItemsDTO;
import projectmenu.convertation.OrderItemsConvert;
import projectmenu.entityes.OrderItemsEntity;
import projectmenu.repository.OrderItemsRepository;
import projectmenu.services.order.OrderService;
@Getter
@Setter
@Component
@RequiredArgsConstructor
public class OrderItemsServiceImpl implements OrderItemsService {

    private final OrderItemsConvert orderItemsConvert;
    private final OrderItemsRepository orderItemsRepository;

    @Override
    public OrderItemsDTO create(OrderItemsCreateDTO orderItemsCreateDTO) {
        OrderItemsEntity orderItemsEntity = orderItemsConvert.convert(orderItemsCreateDTO);
        orderItemsRepository.save(orderItemsEntity);
        return orderItemsConvert.convert(orderItemsEntity);
    }
}
