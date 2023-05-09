package by.tms.entity.delivery;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "")
@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class DeliveryToPickup implements DeliveryType{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
