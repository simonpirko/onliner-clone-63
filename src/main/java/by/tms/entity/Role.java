package by.tms.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="roles")
@Setter
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
