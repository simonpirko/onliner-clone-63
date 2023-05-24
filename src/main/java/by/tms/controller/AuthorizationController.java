package by.tms.controller;

import by.tms.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class AuthorizationController {
    @GetMapping("/auth")
    public String auth() {
        return "auth";
    }

    @PostMapping("/auth")
    public String auth(@ModelAttribute("userAuth") @Valid User user, BindingResult bindingResult, HttpServletRequest request) {
        String passDataBase = "";
        if (user.getPassword().equals(passDataBase)) {
            request.getSession().setAttribute("userName", user.getName());
        }
        System.out.println(user);
        return "auth";
    }
}
