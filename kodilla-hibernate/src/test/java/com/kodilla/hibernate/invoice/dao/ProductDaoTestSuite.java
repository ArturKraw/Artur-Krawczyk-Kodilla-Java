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
    private static final String PRODUCT2 = "Laptop";

    public void before(){
        System.out.println("Test Case: begin");
        productDao.deleteAll();

    }

    @Test
    public void testProductDaoQuantity() {
        //Given
        Product product1 = new Product(PRODUCT1);
        Product product2 = new Product(PRODUCT2);
        productDao.save(product1);
        productDao.save(product2);
        //When
        long productsQuantity = productDao.count();
        //Then
        Assert.assertEquals(2, productsQuantity);
        //CleanUp
        productDao.deleteAll();
    }

    @Test
    public void testProductDaoSave() {
        //Given
        product = new Product(PRODUCT1);

        //When
        productDao.save(product);
        int productId = product.getProductId();

        //Then
        Product readProduct = productDao.findOne(productId);
        Assert.assertEquals(productId, readProduct.getProductId());
        productDao.deleteAll();
    }




    @Test
    public void testProductDaoFindByName() {
        //Given
        Product product = new Product(PRODUCT1);
        productDao.save(product);

        //When
        String name = product.getName();
        //long productsQuantity = productDao.count();
        //Then
        Assert.assertEquals(name, PRODUCT1);
        productDao.deleteAll();
    }
}
