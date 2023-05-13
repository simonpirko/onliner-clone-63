package by.tms.entity.payment;

import lombok.*;

import javax.persistence.*;
import java.util.Optional;

@Entity
@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class PaymentTypeFactory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private PaymentByCard paymentByCard = null;
    @OneToOne
    private PaymentByCash paymentByCash = null;
    public Optional<PaymentType> add(PaymentType.Type type) {
        switch (type) {
            case CARD: {
                PaymentByCard paymentByCard = new PaymentByCard();
                return Optional.of(paymentByCard);
            }
            case CASH: {
                paymentByCash = new PaymentByCash();
                return Optional.of(paymentByCash);
            }
        }
        return Optional.empty();
    }
}
