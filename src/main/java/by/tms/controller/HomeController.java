package by.tms.controller;

import by.tms.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/user")
public class HomeController {
    @Autowired
    private SectionService sectionService;

    @GetMapping()
    public String home(Model model){
        model.addAttribute("sections", sectionService.findAll());
        return  "home";
    }
}
