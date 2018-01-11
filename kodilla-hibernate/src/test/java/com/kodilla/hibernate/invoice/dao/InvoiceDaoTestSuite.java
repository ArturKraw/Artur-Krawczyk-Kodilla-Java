package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    private Invoice invoice;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;
    private Product product1;
    private Product product2;
    private Product product3;
    private Product product4;
    private final String Number1 = "A-1-01-2018";
    private final String Number2 = "A=2-01-2018";
    private static final BigDecimal price1 = new BigDecimal(3000.00);
    private static final BigDecimal price2 = new BigDecimal(2000.00);
    private static final BigDecimal price3 = new BigDecimal(1000.00);
    private static final String Product1 = "PC";
    private static final String Product2 = "Laptop";
    private static final String Product3 = "Monitor";

    @Before
    public void before(){
        System.out.println("Test Case: begin");
        invoiceDao.deleteAll();
        productDao.deleteAll();
        product1 = new Product(Product1);
        product2 = new Product(Product2);
        product3 = new Product(Product3);
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
    }

    @Test
    public void testInvoiceDaoQuantity() {
        //Given
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
    public void testInvoiceDaoSave1() {
        //Given
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
        invoice = new Invoice (Number1);
        invoiceDao.save(invoice);
        //When
        String number = invoice.getNumber();
        //Then
        Assert.assertEquals(number, Number1);
    }
    @Ignore
    @Test
    public void testInvoiceDaoSaveWithItems() {
        //Given
        invoice = new Invoice (Number1);
        Item item1 = new Item(price1, 5);
        Item item2 = new Item(price2, 3);
        item1.setProduct(product1);
        item2.setProduct(product2);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getInvoiceId();
        //Then
        Assert.assertNotEquals(0, invoiceId);
    }

    @Test
    public void testInvoiceDaoSave() {
        //Given
        invoice = new Invoice (Number1);
        Item item1 = new Item(price1, 5);
        Item item2 = new Item(price2, 3);
        Item item3 = new Item(price3, 2);
        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getInvoiceId();
        Invoice readInvoice = invoiceDao.findOne(invoiceId);
        String invoiceNumber = readInvoice.getNumber();

        Item findItemByPrice1 = itemDao.findItemByPrice(price1);
        Item findItemByPrice2 = itemDao.findItemByPrice(price2);
        Item findItemByPrice3 = itemDao.findItemByPrice(price3);

        int item1Id = findItemByPrice1.getItemId();
        int item1Quant = findItemByPrice1.getQuantity();
        String item1ProdName = findItemByPrice1.getProduct().getName();
        int item1ProdId = findItemByPrice1.getProduct().getProductId();
        String item1InvoiceNumber = findItemByPrice1.getInvoice().getNumber();
        int item1InvoiceId = findItemByPrice1.getInvoice().getInvoiceId();

        int item2Id = findItemByPrice2.getItemId();
        int item2Quant = findItemByPrice2.getQuantity();
        String item2ProdName = findItemByPrice2.getProduct().getName();
        int item2ProdId = findItemByPrice2.getProduct().getProductId();
        String item2InvoiceNumber = findItemByPrice2.getInvoice().getNumber();
        int item2InvoiceId = findItemByPrice2.getInvoice().getInvoiceId();

        int item3Id = findItemByPrice3.getItemId();
        int item3Quant = findItemByPrice3.getQuantity();
        String item3ProdName = findItemByPrice3.getProduct().getName();
        int item3ProdId = findItemByPrice3.getProduct().getProductId();
        String item3InvoiceNumber = findItemByPrice3.getInvoice().getNumber();
        int item3InvoiceId = findItemByPrice3.getInvoice().getInvoiceId();

        //Then
        Assert.assertEquals(1, invoiceDao.count());
        Assert.assertEquals(3, productDao.count());
        Assert.assertEquals(3, invoice.getItems().size());

        Assert.assertEquals(Number1, invoiceNumber);

        Assert.assertEquals(5, item1Quant);
        Assert.assertEquals(3, item2Quant);
        Assert.assertEquals(2, item3Quant);
        Assert.assertNotEquals(0, item1Id);
        Assert.assertNotEquals(0, item2Id);
        Assert.assertNotEquals(0, item3Id);

        Assert.assertEquals(Product1, item1ProdName);
        Assert.assertEquals(Product2, item2ProdName);
        Assert.assertEquals(Product3, item3ProdName);
        Assert.assertNotEquals(0, item1ProdId);
        Assert.assertNotEquals(0, item2ProdId);
        Assert.assertNotEquals(0, item3ProdId);

        Assert.assertEquals(Number1, item1InvoiceNumber);
        Assert.assertEquals(Number1, item2InvoiceNumber);
        Assert.assertEquals(Number1, item3InvoiceNumber);
        Assert.assertNotEquals(0, item1InvoiceId);
        Assert.assertNotEquals(0, item2InvoiceId);
        Assert.assertNotEquals(0, item3InvoiceId);
    }
}
