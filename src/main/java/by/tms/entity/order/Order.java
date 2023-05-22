package by.tms.entity.order;

import by.tms.entity.AbstractEntity;
import by.tms.entity.PaymentType;
import by.tms.entity.User;
import by.tms.entity.delivery.DeliveryTypeFactory;
import lombok.*;

import javax.persistence.*;

@Table(name = "orders")
@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class Order extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private User user;
    @OneToOne
    private PaymentType paymentType;
    @OneToOne
    private DeliveryTypeFactory deliveryType;
    @OneToOne
    private OrderItem orderItems;
}
