package by.tms.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@org.hibernate.annotations.NamedQueries({
        @org.hibernate.annotations.NamedQuery(name = "User.remove",
                query = "delete from User u where u.id = :id"),
        @org.hibernate.annotations.NamedQuery(name = "User.findAll",
                query = "select u from User u"),
        @org.hibernate.annotations.NamedQuery(name = "User.findByName",
                query = "select u from User u where u.username = :username")
})

@Entity
@Table(name = "users")
@Setter @Getter
@ToString
@Builder @AllArgsConstructor @NoArgsConstructor
public class User extends AbstractEntity {
    private String name;
    private String username;
    private String password;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Telephone> telephones;
}
