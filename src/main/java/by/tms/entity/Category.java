package by.tms.entity;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "categories")
@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class Category extends AbstractEntity{
    private String name;
}
