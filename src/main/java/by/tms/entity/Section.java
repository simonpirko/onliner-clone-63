package by.tms.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="sections")
@Setter
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
