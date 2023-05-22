package by.tms.entity;

import lombok.*;

import javax.persistence.*;

@Table(name="roles")
@Setter @Getter
@ToString
@Builder @AllArgsConstructor @NoArgsConstructor
public class Role extends AbstractEntity{
    private String admin;
    private String user;
}
