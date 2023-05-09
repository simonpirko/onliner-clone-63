package by.tms.entity;

import by.tms.entity.parameter.ParameterFactory;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "")
@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class ProductParameter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Transient
    private Product product;
    @Transient
    private ParameterFactory parameterFactory;
}
