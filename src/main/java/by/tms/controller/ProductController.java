package by.tms.controller;

import by.tms.entity.Category;
import by.tms.entity.Product;
import by.tms.entity.parameter.Parameter;
import by.tms.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    private ProductService productService;
    private static List<Category> categories = null;
    private static List<Parameter> parameterList = null;

    @ModelAttribute("categories")
    public List<Category> getCategories(){
        categories = new ArrayList<>();
        categories.add(new Category("Phones"));
        categories.add(new Category("Laptops"));
        categories.add(new Category("Headphones"));
        return categories;
    }

    @ModelAttribute("parameterList")
    public List<Parameter> getParameter(){
        parameterList = new ArrayList<>();
        parameterList.add(new Parameter("Battery capacity"));
        parameterList.add(new Parameter("Screen size"));
        parameterList.add(new Parameter("RAM"));
        parameterList.add(new Parameter("color"));
        return parameterList;
    }

    @GetMapping("/create")
    public String getProductForm(Model model) {
        model.addAttribute("categories", categories);
        model.addAttribute("parameters", parameterList);
        model.addAttribute("newProduct", new Product());
        return "createProduct";
    }

    @PostMapping("/create")
    public String createProduct(@ModelAttribute("newProduct") Product product, Model model) {
        Product readyProduct = Product.builder()
                .name((String) model.getAttribute("name"))
                .itemNumber((String) model.getAttribute("itemAttribute"))
                .quantity((Long) model.getAttribute("quantity"))
                .price((Double) model.getAttribute("price"))
                .image((String) model.getAttribute("image"))
                .category((Category) model.getAttribute("category"))
                .build();
        productService.save(readyProduct);
        return "createProduct";
    }
}
