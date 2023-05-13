package by.tms.entity.parameter;

import by.tms.entity.Product;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "productParameters")
@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class ProductParameter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private Product product;
    @OneToOne
    private ParameterFactory parameterFactory;
}
