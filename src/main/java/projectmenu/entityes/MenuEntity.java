package projectmenu.entityes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class MenuEntity extends AbstractEntity {

    @Column(nullable = false)
    private String name;


    @OneToMany(mappedBy = "menuEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MenuItemEntity> menuItemEntityList;




}
