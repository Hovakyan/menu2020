package projectmenu.convertation;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import projectmenu.commons.orderItems.OrderItemsCreateDTO;
import projectmenu.commons.orderItems.OrderItemsDTO;
import projectmenu.entityes.MenuItemEntity;
import projectmenu.entityes.OrderEntity;
import projectmenu.entityes.OrderItemsEntity;
import projectmenu.repository.MenuItemRepository;

@Component
@Getter
@Setter
@RequiredArgsConstructor
public class OrderItemsConvert {
    private final MenuItemRepository menuItemRepository;

    public OrderItemsEntity convert(OrderItemsCreateDTO orderItemsCreateDTO) {

        MenuItemEntity menuItemEntity = menuItemRepository.getOne(orderItemsCreateDTO.getId());
        OrderItemsEntity orderItemsEntity = new OrderItemsEntity();
        orderItemsEntity.setAmount(orderItemsCreateDTO.getAmount());
        orderItemsEntity.setMenuItemEntity(menuItemEntity);
        return orderItemsEntity;
    }

    public OrderItemsDTO convert(OrderItemsEntity orderItemsEntity) {
        OrderItemsDTO orderItemsDTO = new OrderItemsDTO();
        orderItemsDTO.setId(orderItemsEntity.getId());
        orderItemsDTO.setAmount(orderItemsEntity.getAmount());
        return orderItemsDTO;
    }

}
