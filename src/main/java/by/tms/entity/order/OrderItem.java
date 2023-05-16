package by.tms.entity.order;

import by.tms.entity.Product;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "orderItems")
@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private Product product;
    private long count;
    private double price;
}
