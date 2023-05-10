package by.tms.entity.payment;

import lombok.*;

@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class PaymentByCard implements PaymentType {
    private long id;
    private String cardNumber;
}
