package by.tms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationUserDto {
    @NotBlank(message = "The field must be field in!!!")
    @NotNull(message = "The field must be field in!!!")
    private String name;
    @Size(min = 5, max = 20, message = "The username must contain from 5 to 12 characters!!!")
    private String username;
    @Size(min = 8, max = 12, message = "The password must contain from 8 to 15 characters!!!")
    private String password;
    @Size(min = 2, max = 4, message = "The phone code must contain from 2 to 4 characters!!!")
    private String code1;
    @Size(min = 7, max = 7, message = "The phone number must contain 7 characters!!!")
    private String number1;
    @Size(min = 2, max = 4, message = "The phone code must contain from 2 to 4 characters!!!")
    private String code2;
    @Size(min = 7, max = 7, message = "The phone number must contain 7 characters!!!")
    private String number2;
}
