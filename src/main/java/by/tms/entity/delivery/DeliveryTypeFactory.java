package by.tms.entity.delivery;

import by.tms.entity.AbstractEntity;
import lombok.*;

import java.util.Optional;

import static java.util.Optional.*;

@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class DeliveryTypeFactory {

        public Optional<AbstractEntity> add(DeliveryType type) {
        switch (type) {
            case ADDRESS: {
                return of(new DeliveryToAddress());
            }
            case PICKUP: {
                return of(new DeliveryToPickup());
            }
        }
        return empty();
    }
}
