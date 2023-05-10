package by.tms.entity.delivery;

import lombok.*;

@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class DeliveryToAddress implements DeliveryType{
    public long id;
    public String address;
}
