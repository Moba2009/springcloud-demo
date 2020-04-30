package cn.linyt.study.productviewservicefeign.client;

import cn.linyt.study.productviewservicefeign.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "PRODUCT-DATA-SERVICE", fallback = ProductClientFeignHystrix.class)
public interface ProductClientFeign {
 
    @GetMapping("/products")
    List<Product> listProdcuts();
}