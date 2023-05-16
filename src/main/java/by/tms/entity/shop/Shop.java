package by.tms.entity.shop;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "shops")
@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}
