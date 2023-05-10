package by.tms.entity.parameter;

import lombok.*;

import java.time.LocalDateTime;

@Setter @Getter
@Builder @NoArgsConstructor @AllArgsConstructor
public class LaptopParameter implements Parameter {
    private long id;
    private String maker;
    private String color;
    private String RAM;
    private double screenSize;
    private LocalDateTime productionDate;
}
