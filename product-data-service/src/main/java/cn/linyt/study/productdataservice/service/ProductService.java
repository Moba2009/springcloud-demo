package cn.linyt.study.productdataservice.service;

import cn.linyt.study.productdataservice.entity.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ProductService
 * @Description TODO
 * @Author Mojo
 * @Date 2020/4/28 21:59
 * @Version 1.0
 **/
@Service
public class ProductService {

    @Value("${server.port}")
    String port;

    public List<Product> listProducts(){
        List<Product> ps = new ArrayList<>();
        ps.add(new Product(1,"product a from port:"+port, 50));
        ps.add(new Product(2,"product b from port:"+port, 150));
        ps.add(new Product(3,"product c from port:"+port, 250));
        return ps;
    }
}
