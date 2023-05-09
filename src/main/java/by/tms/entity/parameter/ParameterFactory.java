package by.tms.entity.parameter;

import java.util.Optional;

public class ParameterFactory {
    public Optional<Parameter> add(Parameter.Type type) {
        switch (type) {
            case PHONE: {
                PhoneParameter phoneParameter = new PhoneParameter();
                return Optional.of(phoneParameter);
            }
            case LAPTOP: {
                LaptopParameter laptopParameter = new LaptopParameter();
                return Optional.of(laptopParameter);
            }
        }
        return Optional.empty();
    }
}
