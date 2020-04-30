package cn.linyt.study.productdataservice.controller;

import cn.linyt.study.productdataservice.entity.Product;
import cn.linyt.study.productdataservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
  
    @Autowired
    ProductService productService;
     
    @RequestMapping("/products")
    public List products() {

        List<Product> ps = productService.listProducts();
        return ps;
    }
}