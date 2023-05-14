package by.tms.controller;

import by.tms.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class RegistrationController {

    @GetMapping("/reg")
    public String reg(Model model) {
        model.addAttribute("newUser", new User());
        return "reg";
    }

    @PostMapping("/auth")
    public String auth(@ModelAttribute("userAuth") @Valid User user, BindingResult bindingResult, HttpServletRequest request) {
        String passDataBase = "";
        if (user.getPassword().equals(passDataBase)) {
            request.getSession().setAttribute("userName", user.getName());
        }
        System.out.println(user);
        return "reg";
    }

    @PostMapping("/req")
    public String reg(@ModelAttribute("newUser") @Valid User user, BindingResult bindingResult) {
        return "reg";
    }
}
