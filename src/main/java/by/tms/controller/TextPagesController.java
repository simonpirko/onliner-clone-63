package by.tms.controller;

import by.tms.entity.TextPages;
import by.tms.service.TextPagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.format.TextStyle;
import java.util.List;

@Controller
@RequestMapping("/pages")
public class TextPagesController {
    @Autowired
    private TextPagesService textPagesService;
    @Transactional
    @GetMapping("/{url}")
    public String getByUrl(@PathVariable("url") String url, Model model) {
        TextPages byUrl = textPagesService.findByUrl(url);
        model.addAttribute("textPage", byUrl);
        return "page";
    }
}
