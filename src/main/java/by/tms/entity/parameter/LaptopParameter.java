package by.tms.entity.parameter;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "laptopParameters")
@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class LaptopParameter implements Parameter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String maker;
    private String color;
    private String RAM;
    private double screenSize;
    private LocalDateTime productionDate;
}