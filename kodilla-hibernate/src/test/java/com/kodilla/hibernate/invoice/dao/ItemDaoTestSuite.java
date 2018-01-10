package com.kodilla.hibernate.invoice.dao;


import com.kodilla.hibernate.invoice.Item;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemDaoTestSuite {
    @Autowired
    private ItemDao itemDao;
    private Item item;
    private static final BigDecimal price1 = new BigDecimal(3000.00);

    @Before
    public void before(){
        System.out.println("Test Case: begin");
        itemDao.deleteAll();
    }

    @Test
    public void testItemDaoSave() {
        //CleanUp if one test
        //itemDao.deleteAll();

        //Given
        item = new Item(price1, 3);
        //When
        itemDao.save(item);
        //Then
        int itemId = item.getItemId();
        Item readItem = itemDao.findOne(itemId);
        Assert.assertEquals(itemId, readItem.getItemId());

        }

    @Test
    public void testItemDaoFindByPrice() {
        //CleanUp if one test
        //itemDao.deleteAll();

        //Given
        Item item = new Item(price1, 5);
        itemDao.save(item);
        BigDecimal price = item.getPrice();
        //When
        List<Item> readItems = itemDao.findByPrice(price);
        //Then
        Assert.assertEquals(1, readItems.size());

    }
}
