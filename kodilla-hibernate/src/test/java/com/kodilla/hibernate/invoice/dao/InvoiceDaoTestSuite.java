package com.kodilla.hibernate.invoice.dao;

// test - testInvoiceDaoSave
//sprawdza czy faktura z kilkoma pozycjami
// zapisuje się poprawnie w bazie danych


import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.Before;


@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    private Invoice invoice;
    private Product product;
    private final String Number1 = "A-1-01-2018";
    private final String Number2 = "A=2-01-2018";
    private static final BigDecimal price1 = new BigDecimal(3000.00);
    private static final BigDecimal price2 = new BigDecimal(2000.00);
    private static final String Product1 = "PC";
    private static final String Product2 = "Laptop";

    public void before(){
        System.out.println("Test Case: begin");
        invoiceDao.deleteAll();

    }

    @Test
    public void testInvoiceDaoQuantity() {
        //Given
        invoiceDao.deleteAll();
        Invoice invoice1 = new Invoice(Number1);
        Invoice invoice2 = new Invoice(Number2);
        invoiceDao.save(invoice1);
        invoiceDao.save(invoice2);
        //When
        long invoicesQuantity = invoiceDao.count();
        //Then
        Assert.assertEquals(2, invoicesQuantity);
    }

    @Test
    public void testInvoiceDaoSave() {
        //Given
        //invoiceDao.deleteAll();
        invoice = new Invoice (Number1);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getInvoiceId();

        //Then
        Invoice readInvoice = invoiceDao.findOne(invoiceId);
        Assert.assertEquals(invoiceId, readInvoice.getInvoiceId());
    }

    @Test
    public void testInvoiceDaoFindByNumber() {
        //Given
        //invoiceDao.deleteAll();
        invoice = new Invoice (Number1);
        invoiceDao.save(invoice);

        //When
        String number = invoice.getNumber();

        //Then
        Assert.assertEquals(number, Number1);

    }

    @Test
    public void testInvoiceDaoSaveWithItems() {
        //Given
        invoiceDao.deleteAll();
        invoice = new Invoice (Number1);
        //product = new Product(Product1);
        Item item1 = new Item(price1, 5);
        Item item2 = new Item(price2, 3);
        item1.setProduct(product);
        item2.setProduct(product);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        //product.getItems().add(item1);
        //product.getItems().add(item2);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getInvoiceId();

        //Then
        Assert.assertNotEquals(0, invoiceId);
    }

}
