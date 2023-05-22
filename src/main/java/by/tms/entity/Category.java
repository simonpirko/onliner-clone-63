package by.tms.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category's")
@Setter @Getter
@ToString
@Builder @AllArgsConstructor @NoArgsConstructor
public class Category extends AbstractEntity{
    private String url;
    private String name;
    private String image;
    private boolean is_active;
 }
