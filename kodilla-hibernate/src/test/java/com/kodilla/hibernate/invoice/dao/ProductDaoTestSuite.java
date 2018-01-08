package com.kodilla.hibernate.invoice.dao;


import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductDaoTestSuite {
    @Autowired
    private ProductDao productDao;
    private Product product;
    private static final String PRODUCT1 = "PC";

    public void before(){
        System.out.println("Test Case: begin");
        productDao.deleteAll();
    }

    @Test
    public void testProductDaoSave() {
        //Given
        product = new Product(PRODUCT1);

        //When
        productDao.save(product);

        //Then
        int productId = product.getProductId();
        Product readProduct = productDao.findOne(productId);
        Assert.assertEquals(productId, readProduct.getProductId());
    }


    @Test
    public void testProdcuctDaoFindByName() {
        //Given
        Product product = new Product(PRODUCT1);
        productDao.save(product);
        String name = product.getName();
        //When
        long productsQuantity = productDao.count();
        //Then
        Assert.assertEquals(1, productsQuantity);
    }
}
