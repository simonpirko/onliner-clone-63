package by.tms.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Table(name="sections")
@Setter @Getter
@ToString
@Builder @AllArgsConstructor @NoArgsConstructor
public class Section extends AbstractEntity{
    private String url;
    private String name;
    private String image;
    private boolean is_active;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Category> categories;
}
