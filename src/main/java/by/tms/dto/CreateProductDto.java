package by.tms.dto;

import by.tms.entity.Category;
import by.tms.entity.parameter.Parameter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor @AllArgsConstructor
public class CreateProductDto {
    @NotBlank(message = "not blank")
    @NotEmpty(message = "not empty")
    private String name;
    @NotBlank(message = "not blank")
    @NotEmpty(message = "not empty")
    private String itemNumber;
    @Min(value = 0)
    private long quantity;
    @NotBlank(message = "not blank")
    @NotEmpty(message = "not empty")
    private String image;
    @Min(value = 0)
    private double price;
    private Category category;
    private Parameter parameter1;
    private String parameterValue1;
    private Parameter parameter2;
    private String parameterValue2;
    private Parameter parameter3;
    private String parameterValue3;
}
