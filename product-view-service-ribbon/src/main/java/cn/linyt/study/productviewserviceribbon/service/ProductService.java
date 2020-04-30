package cn.linyt.study.productviewserviceribbon.service;

import cn.linyt.study.productviewserviceribbon.client.ProductClientRibbon;
import cn.linyt.study.productviewserviceribbon.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductClientRibbon productClientRibbon;

    public List<Product> listProducts(){

        return productClientRibbon.listProdcuts();
    }
}