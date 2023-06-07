package by.tms.controller;

import by.tms.dto.LoginUserDto;
import by.tms.dto.RegistrationUserDto;
import by.tms.entity.Telephone;
import by.tms.entity.User;
import by.tms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UserController {
    private static final String USER = "user";
    private static final String LOGIN_USER = "loginUser";
    private static final String NEW_USER = "newUser";
    private static final String MESSAGE = "message";
    private static final String USER_NOT_FOUND = "User not found !!!";
    private static final String INCORRECT_PASSWORD = "Incorrect password !!!";
    @Autowired
    private UserService userService;

    @GetMapping("/reg")
    public String reg(Model model) {
        model.addAttribute(NEW_USER, new RegistrationUserDto());
        return "reg";
    }

    @GetMapping("/auth")
    public String auth(Model model) {
        model.addAttribute(LOGIN_USER, new LoginUserDto());
        return "auth";
    }

    @PostMapping("/reg")
    public String reg(@ModelAttribute(NEW_USER) RegistrationUserDto userDto) {
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
        userService.save(user);
        return "redirect:/user/auth";
    }

    @PostMapping("/auth")
    public String auth(@ModelAttribute(LOGIN_USER) LoginUserDto loginUserDto, Model model, HttpSession session) {
        Optional<User> byUsername = userService.findByUserName(loginUserDto.getUsername());
        if (byUsername.isPresent()) {
            User user = byUsername.get();
            if (user.getPassword().equals(loginUserDto.getPassword())) {
                session.setAttribute(USER, user);
                return "home";
            } else {
                model.addAttribute(MESSAGE, INCORRECT_PASSWORD);

            }
        } else {
            model.addAttribute(MESSAGE, USER_NOT_FOUND);
        }
        return "auth";

    }
}

