package com.works.vize_1.controllers;

import com.works.vize_1.entities.Product;
import com.works.vize_1.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {
    final ProductService productService;

    @GetMapping("/")
    public String home(Model model){
        Page<Product> products = productService.someProducts();
        model.addAttribute("products",products);
        return "home";
    }
}
