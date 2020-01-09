package projectmenu.convertation;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import projectmenu.commons.order.OrderCreateDTO;
import projectmenu.commons.order.OrderDTO;
import projectmenu.entityes.OrderEntity;
import projectmenu.entityes.OrderItemsEntity;
import projectmenu.repository.OrderItemsRepository;

import java.util.Calendar;

@Component
@Getter
@Setter
@RequiredArgsConstructor
public class OrderConvert {

    private final OrderItemsRepository orderItemsRepository;

  public   OrderEntity convert (OrderCreateDTO orderCreateDTO){
      OrderItemsEntity orderItemsEntity = orderItemsRepository.getOne(orderCreateDTO.getId());
        OrderEntity orderEntity = new OrderEntity();
        Calendar calendar = Calendar.getInstance();
        orderEntity.setDeliveryDate(calendar);
        orderEntity.setTotalPrice(orderItemsEntity.getAmount()*orderItemsEntity.getMenuItemEntity().getPrice());
//        orderEntity.getOrderItemsEntityList().add(orderItemsEntity);
        orderItemsEntity.setOrderEntity(orderEntity);

        return orderEntity;
    }

   public OrderDTO convert(OrderEntity orderEntity){
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setDeliveryDate(orderEntity.getDeliveryDate());
        orderDTO.setId(orderEntity.getId());
        orderDTO.setTotalPrice(orderEntity.getTotalPrice());
        return orderDTO;
    }



}
