package by.tms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class CreateProductDto {
    private String name;
    private String itemNumber;
    private long quantity;
    private String image;
    private double price;
}
