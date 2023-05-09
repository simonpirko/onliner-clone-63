package by.tms.entity.payment;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "")
@Getter @Setter
@Builder @AllArgsConstructor @NoArgsConstructor
public class PaymentByCash implements PaymentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
}
