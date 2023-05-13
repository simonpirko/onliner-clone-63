package by.tms.entity.order;

import by.tms.entity.User;
import by.tms.entity.delivery.DeliveryTypeFactory;
import by.tms.entity.payment.PaymentTypeFactory;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private User user;
    @OneToOne
    private DeliveryTypeFactory delivery;
    @OneToOne
    private PaymentTypeFactory payment;
    @OneToOne
    private OrderItem orderItems;
}
