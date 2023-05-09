package by.tms.entity.payment;

import java.util.Optional;

public class PaymentTypeFactory {
    public Optional<PaymentType> add(PaymentType.Type type) {
        switch (type) {
            case CARD: {
                PaymentByCard paymentByCard = new PaymentByCard();
                return Optional.of(paymentByCard);
            }
            case CASH: {
                PaymentByCash paymentByCash = new PaymentByCash();
                return Optional.of(paymentByCash);
            }
        }
        return Optional.empty();
    }
}
