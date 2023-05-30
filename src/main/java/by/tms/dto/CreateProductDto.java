package by.tms.dto;

import by.tms.entity.Category;
import by.tms.entity.parameter.Parameter;
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
    private Category category;
    private Parameter parameter1;
    private String parameterValue1;
    private Parameter parameter2;
    private String parameterValue2;
    private Parameter parameter3;
    private String parameterValue3;
}
