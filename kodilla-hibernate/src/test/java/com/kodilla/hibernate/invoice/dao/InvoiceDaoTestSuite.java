package com.kodilla.hibernate.invoice.dao;

// test - testInvoiceDaoSave
//sprawdza czy faktura z kilkoma pozycjami
// zapisuje się poprawnie w bazie danych


import com.kodilla.hibernate.invoice.Invoice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
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
    private final String Number1 = "A-1-01-2018";
    private final String Number2 = "A=2-01-2018";

    public void before(){
        System.out.println("Test Case: begin");
        invoiceDao.deleteAll();

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
        //CleanUp
        invoiceDao.deleteAll();
    }

    @Test
    public void testInvoiceDaoSave() {
        //Given
        invoice = new Invoice (Number1);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getInvoiceId();

        //Then
        Invoice readInvoice = invoiceDao.findOne(invoiceId);
        Assert.assertEquals(invoiceId, readInvoice.getInvoiceId());
        invoiceDao.deleteAll();
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
        invoiceDao.deleteAll();
    }
}
