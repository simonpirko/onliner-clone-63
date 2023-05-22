package by.tms.entity.role;

import by.tms.entity.AbstractEntity;
import lombok.*;

import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "admins")
@Setter @Getter
@ToString
@Builder @AllArgsConstructor @NoArgsConstructor
public class Admin extends AbstractEntity {
    private String name;
    private String username;
    private String password;
    @ManyToOne
    private Role role;
}
