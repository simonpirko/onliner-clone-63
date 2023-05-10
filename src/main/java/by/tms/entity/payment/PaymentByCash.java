package by.tms.entity.payment;

import lombok.*;

@Getter @Setter
@Builder @AllArgsConstructor @NoArgsConstructor
public class PaymentByCash implements PaymentType {
    public long id;
}
