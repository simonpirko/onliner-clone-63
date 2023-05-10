package by.tms.entity.shop;

import by.tms.entity.Category;
import by.tms.entity.Product;
import by.tms.entity.Section;
import lombok.*;

@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class Shop {
    private long id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private Category category;
    private Section section;
    private Product product;
}
