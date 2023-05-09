package by.tms.entity.order;

import by.tms.entity.User;
import by.tms.entity.delivery.DeliveryTypeFactory;
import by.tms.entity.payment.PaymentTypeFactory;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "")
@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Transient
    private User user;
    @Transient
    private DeliveryTypeFactory delivery;
    @Transient
    private PaymentTypeFactory payment;
    @Transient
    private List<OrderItem> orderItems;
}
