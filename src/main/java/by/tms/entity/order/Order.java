package by.tms.entity.order;

import by.tms.entity.AbstractEntity;
import by.tms.entity.PaymentType;
import by.tms.entity.User;
import by.tms.entity.DeliveryType;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class Order extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private User user;
    private PaymentType paymentType;
    private DeliveryType deliveryType;
    @OneToOne
    private OrderItem orderItems;
}
