package by.tms.entity.delivery;

import lombok.*;

import javax.persistence.*;
import java.util.Optional;

@Entity
@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class DeliveryTypeFactory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private DeliveryToAddress address = null;
    @OneToOne
    private DeliveryToPickup pickup = null;

    public Optional<DeliveryType> add(DeliveryType.Type type) {
        switch (type) {
            case ADDRESS: {
                address = new DeliveryToAddress();
                return Optional.of(address);
            }
            case PICKUP: {
                pickup = new DeliveryToPickup();
                return Optional.of(pickup);
            }
        }
        return Optional.empty();
    }
}
