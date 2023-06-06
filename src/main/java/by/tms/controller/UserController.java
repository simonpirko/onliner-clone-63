package by.tms.controller;

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
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";
    private static final String MESSAGE = "message";
    private static final String USER_NOT_FOUND = "User not found !!!";
    private static final String INCORRECT_PASSWORD = "Incorrect password !!!";
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
    public String reg(RegistrationUserDto userDto, HttpSession session) {
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
        session.setAttribute(USERNAME, userDto.getUsername());
        session.setAttribute(PASSWORD, userDto.getPassword());
        return "redirect:/user/auth";
    }

    @PostMapping("/auth")
    public String auth(@ModelAttribute(USERNAME) String username, @ModelAttribute(PASSWORD) String password, Model model) {
        Optional<User> byUsername = userService.findByUsername(username);
        if (byUsername.isPresent()) {
            User user = byUsername.get();
            if (user.getPassword().equals(password)) {
                return "redirect:/user/req";
            } else {
                model.addAttribute(MESSAGE, INCORRECT_PASSWORD);

            }
        } else {
            model.addAttribute(MESSAGE, USER_NOT_FOUND);
        }
        return "auth";

    }
}

