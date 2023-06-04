package by.tms.controller;

import by.tms.dto.CreateProductDto;
import by.tms.entity.Product;
import by.tms.entity.User;
import by.tms.entity.parameter.ProductParameter;
import by.tms.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import javax.validation.Valid;
import java.util.ArrayList;
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
    public String createProduct(@ModelAttribute("newProduct") @Valid CreateProductDto dto,
                                BindingResult bindingResult,
                                HttpSession session) {
        Product product = getProduct(dto, session);
        addProductInProductParameter(product);
        productService.save(product);
        return "createProduct";
    }

    private void addProductInProductParameter(Product product){
        for (ProductParameter parameter : product.getParameters()){
            parameter.setProduct(product);
        }
    }

    private Product getProduct(CreateProductDto dto,
                               HttpSession session){
        List<ProductParameter> parameters = getProductParameter(dto);
        return Product.builder()
                .name(dto.getName())
                .itemNumber(dto.getItemNumber())
                .image(dto.getImage())
                .quantity(dto.getQuantity())
                .price(dto.getPrice())
                .category(dto.getCategory())
                .parameters(parameters)
                .owner((User) session.getAttribute("user"))
                .build();
    }

    private List<ProductParameter> getProductParameter(CreateProductDto dto){
        return List.of(ProductParameter.builder()
                        .parameter(dto.getParameter1())
                        .value(dto.getParameterValue1())
                        .build(),
                ProductParameter.builder()
                        .parameter(dto.getParameter2())
                        .value(dto.getParameterValue2())
                        .build(),
                ProductParameter.builder()
                        .parameter(dto.getParameter3())
                        .value(dto.getParameterValue3())
                        .build());
    }
}
