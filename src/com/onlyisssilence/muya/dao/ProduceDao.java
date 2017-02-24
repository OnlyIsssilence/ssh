package com.onlyisssilence.muya.dao;

import com.onlyisssilence.muya.domain.Product;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Author: MuYa
 * Date  : 2017/2/24
 * Description:
 */
public class ProduceDao extends HibernateDaoSupport {
    public void save(Product product) {
        System.out.println("dao层调用了");

        this.getHibernateTemplate().save(product);
    }
}
