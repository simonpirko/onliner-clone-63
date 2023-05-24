package by.tms.entity;

import lombok.*;

import javax.persistence.*;

//@Entity
//@Setter @Getter
//@Builder @NoArgsConstructor @AllArgsConstructor
@MappedSuperclass
public abstract class AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    public long getId(){
        return id;
    }
}
