package by.tms.entity.order;

import by.tms.entity.User;
import by.tms.entity.delivery.DeliveryTypeFactory;
import by.tms.entity.payment.PaymentTypeFactory;
import lombok.*;

import java.util.List;

@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class Order {
    private long id;
    private User user;
    private DeliveryTypeFactory delivery;
    private PaymentTypeFactory payment;
    private List<OrderItem> orderItems;
}
