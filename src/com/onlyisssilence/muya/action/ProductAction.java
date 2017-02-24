package com.onlyisssilence.muya.action;

import com.onlyisssilence.muya.domain.Product;
import com.onlyisssilence.muya.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Author: MuYa
 * Date  : 2017/2/24
 * Description:
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product>{

    //模型驱动使用的类
    private Product product;

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public Product getModel() {
        return product;
    }

    private ProductService productService;

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }


    public String add(){
        System.out.println("action层");

        productService.save(product);
        return  NONE;
    }

}
