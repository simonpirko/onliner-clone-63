package by.tms.entity;

import by.tms.entity.parameter.ProductParameter;
import lombok.*;

import javax.persistence.*;
import java.util.List;

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
    @OneToMany
    private List<ProductParameter> parameters;



}
