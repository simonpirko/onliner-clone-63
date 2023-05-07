package by.tms.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="category's")
@Setter
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}