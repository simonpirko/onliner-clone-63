package by.tms.entity.delivery;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class DeliveryToPickup implements DeliveryType{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String city;
    private String street;
    private long office;
}
