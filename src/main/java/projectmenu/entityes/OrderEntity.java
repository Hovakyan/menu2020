package projectmenu.entityes;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Calendar;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class OrderEntity extends AbstractEntity{

    @Column(nullable = false)
    private Integer totalPrice;
    @Column(nullable = false)
    private Calendar deliveryDate;
}
