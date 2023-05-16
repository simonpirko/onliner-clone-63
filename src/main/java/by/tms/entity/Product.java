package by.tms.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="products")
@Setter
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ElementCollection
    private List<String> image;
    @ElementCollection
    private List<String> parameter;
    @ElementCollection
    private List<String> characteristics;
    @ElementCollection
    private List<String> stores;
    private int vendorCode;
    private  String category;
    private String section;

}
