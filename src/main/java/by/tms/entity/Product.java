package by.tms.entity;

import by.tms.entity.parameter.ProductParameter;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@NamedQueries({
        @NamedQuery(name = "Product.remove",
                query = "delete from Product p where p.id = :id"),
        @NamedQuery(name = "Product.findAll",
                query = "from Product"),
        @NamedQuery(name = "Product.findByName",
        query = "select p from Product p where p.name = :name")
})

@Entity
@Table(name="products")
@Setter @Getter
@Builder @AllArgsConstructor @NoArgsConstructor
public class Product extends AbstractEntity{
    private String name;
    private String itemNumber;
    private long quantity;
    private double price;
    private String image;
    @Enumerated(EnumType.STRING)
    private Category category;
    @OneToOne
    private User owner;
    @OneToMany(cascade = CascadeType.ALL)
    private List<ProductParameter> parameters;
}
