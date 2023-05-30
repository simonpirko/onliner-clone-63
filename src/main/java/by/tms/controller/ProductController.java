package by.tms.controller;

import by.tms.dto.CreateProductDto;
import by.tms.entity.Product;
import by.tms.entity.parameter.ProductParameter;
import by.tms.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/create")
    public String getProductForm(Model model) {
        model.addAttribute("newProduct", new Product());
        return "createProduct";
    }

    @PostMapping("/create")
    public String createProduct(@ModelAttribute("newProduct") CreateProductDto dto) {
        ProductParameter parameter1 = ProductParameter.builder()
                .parameter(dto.getParameter1())
                .value(dto.getParameterValue1())
                .build();

        ProductParameter parameter2 = ProductParameter.builder()
                .parameter(dto.getParameter2())
                .value(dto.getParameterValue2())
                .build();

        ProductParameter parameter3 = ProductParameter.builder()
                .parameter(dto.getParameter3())
                .value(dto.getParameterValue3())
                .build();

        Product product = Product.builder()
                .name(dto.getName())
                .itemNumber(dto.getItemNumber())
                .image(dto.getImage())
                .quantity(dto.getQuantity())
                .price(dto.getPrice())
                .category(dto.getCategory())
                .parameters(List.of(parameter1, parameter2, parameter3))
                .build();
        productService.save(product);
        return "createProduct";
    }
}
