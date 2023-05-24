package by.tms.entity.delivery;

import by.tms.entity.AbstractEntity;
import lombok.*;

import javax.persistence.Entity;

@Entity
@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class DeliveryToAddress extends AbstractEntity {
    private String city;
    private String street;
    private long house;
    private long apartment;
}
