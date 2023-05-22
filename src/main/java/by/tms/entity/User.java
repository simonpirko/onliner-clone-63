package by.tms.entity;

import lombok.*;

import javax.persistence.*;

@Table(name = "users")
@Setter @Getter
@ToString
@Builder @AllArgsConstructor @NoArgsConstructor
public class User extends AbstractEntity{
    private String name;
    private String username;
    private String password;
    @ManyToOne(cascade = CascadeType.ALL)
    private Role role;
}
