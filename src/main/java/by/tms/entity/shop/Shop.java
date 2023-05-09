package by.tms.entity.shop;

import by.tms.entity.Category;
import by.tms.entity.Product;
import by.tms.entity.Section;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "")
@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private Category category;
    private Section section;
    private Product product;
}
