package by.tms.entity.delivery;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "")
@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class DeliveryToAddress implements DeliveryType{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
}
