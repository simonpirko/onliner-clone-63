package by.tms;

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
        session.setAttribute("username", userDto.getUsername());
        session.setAttribute("password", userDto.getPassword());
        return "redirect:/user/auth";
    }

    @PostMapping("/auth")
    public String auth(@ModelAttribute("username") String username, @ModelAttribute("password") String password, Model model) {
        Optional<User> byUsername = userService.findByUsername(username);
        if (byUsername.isPresent()) {
            User user = byUsername.get();
            if (user.getPassword().equals(password)) {
                return "redirect:/user/req";
            } else {
                model.addAttribute("message", "Incorrect password!!!");

            }
        } else {
            model.addAttribute("message", "User not found.");
        }
        return "auth";

    }
}

