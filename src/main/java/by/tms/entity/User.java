package by.tms.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Setter @Getter
@ToString
@Builder @AllArgsConstructor @NoArgsConstructor
public class User extends AbstractEntity {
    private String name;
    private String username;
    private String password;
}
