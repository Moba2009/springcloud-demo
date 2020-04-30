package cn.linyt.study.productviewservicefeign.service;

import cn.linyt.study.productviewservicefeign.client.ProductClientFeign;
import cn.linyt.study.productviewservicefeign.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductClientFeign productClientFeign;

    public List<Product> listProducts(){

        return productClientFeign.listProdcuts();
    }
}