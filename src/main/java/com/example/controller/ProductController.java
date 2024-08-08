//package com.example.controller;
////
////import org.springframework.stereotype.Controller;
////import org.springframework.ui.Model;
////import org.springframework.web.bind.annotation.GetMapping;
////
////import com.example.servicee.ProductService;
////
////@Controller
////public class ProductController {
////    private ProductService productService;
////
////    public ProductController(ProductService productService) {
////        super();
////        this.productService= productService;
////
////    }
////    //handler method to handle list products and return list view mode
////    @GetMapping("/product")
////    public String listProduct(Model model) {
////        model.addAttribute("Products", productService.getAllProduct());
////        return "products";
////
////    }
////
////}


package com.example.controller;

import com.example.entity.Product;

import com.example.servicee.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public String viewProducts(Model model) {
        List<Product> products = productService.getAllProduct();
        model.addAttribute("products", products);
        return "products";
    }
}
