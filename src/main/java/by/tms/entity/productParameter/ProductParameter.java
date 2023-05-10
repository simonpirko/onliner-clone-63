package by.tms.entity.productParameter;

import by.tms.entity.Product;
import by.tms.entity.parameter.ParameterFactory;
import lombok.*;

@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class ProductParameter {
    private long id;
    private Product product;
    private ParameterFactory parameterFactory;
}
