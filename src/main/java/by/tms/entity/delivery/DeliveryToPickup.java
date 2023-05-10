package by.tms.entity.delivery;

import lombok.*;

@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class DeliveryToPickup implements DeliveryType{
    private long id;
    private String address;
}
