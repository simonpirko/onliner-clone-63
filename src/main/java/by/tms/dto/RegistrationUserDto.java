package by.tms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationUserDto {
    private String name;
    private String username;
    private String password;
    private String code1;
    private String number1;
    private String code2;
    private String number2;
}
