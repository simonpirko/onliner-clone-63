package by.tms.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "categories")
@Setter @Getter
@ToString
@Builder @AllArgsConstructor @NoArgsConstructor
public class Category extends AbstractEntity{
    private String url;
    private String name;
    private String image;
    private boolean is_active;
 }
