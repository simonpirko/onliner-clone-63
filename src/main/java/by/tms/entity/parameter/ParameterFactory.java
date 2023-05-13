package by.tms.entity.parameter;

import lombok.*;

import javax.persistence.*;
import java.util.Optional;

@Entity
@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class ParameterFactory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    PhoneParameter phoneParameter = null;
    @OneToOne
    LaptopParameter laptopParameter = null;

    public Optional<Parameter> add(Parameter.Type type) {
        switch (type) {
            case PHONE: {
                phoneParameter = new PhoneParameter();
                return Optional.of(phoneParameter);
            }
            case LAPTOP: {
                laptopParameter = new LaptopParameter();
                return Optional.of(laptopParameter);
            }
        }
        return Optional.empty();
    }
}
