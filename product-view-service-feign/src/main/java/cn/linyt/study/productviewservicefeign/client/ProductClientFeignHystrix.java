package cn.linyt.study.productviewservicefeign.client;

import cn.linyt.study.productviewservicefeign.entity.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ProductClientFeignHystrix
 * @Description TODO
 * @Author Mojo
 * @Date 2020/5/1 0:33
 * @Version 1.0
 **/
@Component
public class ProductClientFeignHystrix implements ProductClientFeign {

    @Override
    public List<Product> listProdcuts() {

        List<Product> result = new ArrayList<>();
        result.add(new Product(0,"产品数据微服务不可用",0));
        return result;
    }
}
