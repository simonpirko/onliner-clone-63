package by.tms.entity.delivery;

import by.tms.entity.AbstractEntity;
import lombok.*;

@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class DeliveryToPickup extends AbstractEntity {
    private long id;
    private String city;
    private String street;
    private long office;
}
