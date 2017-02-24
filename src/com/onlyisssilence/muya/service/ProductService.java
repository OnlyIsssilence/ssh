package com.onlyisssilence.muya.service;

import com.onlyisssilence.muya.dao.ProduceDao;
import com.onlyisssilence.muya.domain.Product;

/**
 * Author: MuYa
 * Date  : 2017/2/24
 * Description:
 */
public class ProductService {

    // 业务层 注入dao
    private ProduceDao produceDao;

    public void setProduceDao(ProduceDao produceDao) {
        this.produceDao = produceDao;
    }

    public void save(Product product) {
        System.out.println("service层调用了");
        produceDao.save(product);
    }
}
