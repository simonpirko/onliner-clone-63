package by.tms.entity;

import by.tms.entity.parameter.ProductParameter;
import by.tms.entity.role.User;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Table(name="products")
@Setter @Getter
@ToString
@Builder @AllArgsConstructor @NoArgsConstructor
public class Product extends AbstractEntity{
    private String name;
    private String itemNumber;
    private long quantity;
    private double price;
    private String image;
    @OneToOne
    private User owner;
    @OneToOne
    private Category category;
    @OneToMany
    private List<ProductParameter> parameters;



}
