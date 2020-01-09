package projectmenu.entityes;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class OrderEntity extends AbstractEntity{

    @Column(nullable = false)
    private Double totalPrice;
    @Temporal(TemporalType.DATE)
    private Calendar deliveryDate;


    @OneToMany(mappedBy = "orderEntity",cascade = CascadeType.ALL,orphanRemoval = true)
    List<OrderItemsEntity> orderItemsEntityList;
}
