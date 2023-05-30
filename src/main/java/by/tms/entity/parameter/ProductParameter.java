package by.tms.entity.parameter;

import by.tms.entity.AbstractEntity;
import by.tms.entity.Product;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "productParameters")
@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class ProductParameter extends AbstractEntity {
    private String value;
    @ManyToOne
    private Product product;
    @Enumerated(EnumType.STRING)
    private Parameter parameter;

}
