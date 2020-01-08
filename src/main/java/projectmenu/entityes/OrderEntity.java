package projectmenu.entityes;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Calendar;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class OrderEntity extends AbstractEntity{

    @Column(nullable = false)
    private Integer totalPrice;
    @Column(nullable = false)
    private Calendar deliveryDate;


    @OneToMany(mappedBy = "orderEntity",cascade = CascadeType.ALL,orphanRemoval = true)
    List<OrderItemsEntity> orderItemsEntityList;
}
