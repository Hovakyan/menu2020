package projectmenu.commons.order;

import lombok.Getter;
import lombok.Setter;

import java.util.Calendar;

@Getter
@Setter
public class OrderUpdateDTO {
    private Long id;
    private Double totalPrice;
    private Calendar deliveryDate;
}
