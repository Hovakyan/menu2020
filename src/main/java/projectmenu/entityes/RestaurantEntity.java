package projectmenu.entityes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class RestaurantEntity extends AbstractEntity {

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "restaurantEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    List<MenuEntity> menuEntityList;

}
