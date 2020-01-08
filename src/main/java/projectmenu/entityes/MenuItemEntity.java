package projectmenu.entityes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class MenuItemEntity extends AbstractEntity{

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Integer price;
}
