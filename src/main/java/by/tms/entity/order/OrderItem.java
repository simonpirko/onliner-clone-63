package by.tms.entity.order;

import by.tms.entity.Product;
import lombok.*;

@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class OrderItem {
    private long id;
    private Product product;
    private long count;
    private double price;
}
