package by.tms.entity.parameter;

import by.tms.entity.AbstractEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "parameters")
@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class Parameter extends AbstractEntity {
    private String name;
}
