package by.tms.entity.order;

import by.tms.entity.AbstractEntity;
import by.tms.entity.Product;
import lombok.*;

import javax.persistence.*;

@Table(name = "orderItems")
@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class OrderItem extends AbstractEntity {
    @OneToOne
    private Product product;
    private long count;
    private double price;
}
