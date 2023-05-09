package by.tms.entity.delivery;

import java.util.Optional;

public class DeliveryTypeFactory {
    public Optional<DeliveryType> add(DeliveryType.Type type){
        switch (type){
            case ADDRESS:{
                DeliveryToAddress deliveryToAddress = new DeliveryToAddress();
                return Optional.of(deliveryToAddress);
            }
            case PICKUP:{
                DeliveryToPickup deliveryToPickup = new DeliveryToPickup();
                return Optional.of(deliveryToPickup);
            }
        }
        return Optional.empty();
    }
}
