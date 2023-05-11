package by.tms.entity;

import lombok.*;

import javax.persistence.*;

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
}
