package cn.linyt.study.productviewserviceribbon.entity;

import lombok.Data;

/**
 * @ClassName Product
 * @Description TODO
 * @Author Mojo
 * @Date 2020/4/28 21:54
 * @Version 1.0
 **/
@Data
public class Product {

    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
