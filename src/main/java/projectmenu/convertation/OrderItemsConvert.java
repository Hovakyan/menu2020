package projectmenu.convertation;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import projectmenu.commons.orderItems.OrderItemsCreateDTO;
import projectmenu.commons.orderItems.OrderItemsDTO;
import projectmenu.entityes.OrderItemsEntity;

@Component
@Getter
@Setter
@RequiredArgsConstructor
public class OrderItemsConvert {

    public OrderItemsEntity convert(OrderItemsCreateDTO orderItemsCreateDTO) {
        OrderItemsEntity orderItemsEntity = new OrderItemsEntity();
        orderItemsEntity.setAmount(orderItemsCreateDTO.getAmount());
        return orderItemsEntity;
    }

    public OrderItemsDTO convert(OrderItemsEntity orderItemsEntity) {
        OrderItemsDTO orderItemsDTO = new OrderItemsDTO();
        orderItemsDTO.setId(orderItemsEntity.getId());
        orderItemsDTO.setAmount(orderItemsEntity.getAmount());
        return orderItemsDTO;
    }

}
