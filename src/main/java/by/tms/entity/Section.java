package by.tms.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

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
    private String url;
    private String name;
    private String image;
    private boolean is_active;
    @ElementCollection
    private List<String> categories;
}
