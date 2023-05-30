package by.tms.entity;

import by.tms.entity.parameter.ProductParameter;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@org.hibernate.annotations.NamedQueries({
        @org.hibernate.annotations.NamedQuery(name = "Remove",
                query = "delete from Product p where p.id = :id"),
        @org.hibernate.annotations.NamedQuery(name = "FindAll",
                query = "from Product"),
        @org.hibernate.annotations.NamedQuery(name = "FindByName",
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
    @OneToOne
    private Category category;
    @OneToOne
    private User owner;
    @OneToMany(cascade = CascadeType.ALL)
    private List<ProductParameter> parameters;



}
