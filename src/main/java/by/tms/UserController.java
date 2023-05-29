package by.tms;

import by.tms.dto.RegistrationUserDto;
import by.tms.entity.Telephone;
import by.tms.entity.User;
import by.tms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/reg")
    public String reg() {
        return "reg";
    }

    @GetMapping("/auth")
    public String auth() {
        return "auth";
    }

    @PostMapping("/reg")
    public String reg(RegistrationUserDto userDto) {
        Telephone telephone1 = Telephone.builder()
                .number(userDto.getNumber1())
                .code(userDto.getCode1()).build();
        Telephone telephone2 = Telephone.builder()
                .number(userDto.getNumber2())
                .code(userDto.getCode2()).build();
        User user = User.builder()
                .name(userDto.getName())
                .username(userDto.getUsername())
                .password(userDto.getPassword())
                .telephones(List.of(telephone1, telephone2))
                .build();
        userService.createUser(user);
        return "redirect:/user/auth";
    }

}
