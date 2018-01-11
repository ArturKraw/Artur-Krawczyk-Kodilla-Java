package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.math.BigDecimal;
import java.util.List;

@Transactional
@Repository
public interface ItemDao extends CrudRepository<Item, Integer> {
    List<Item> findByPrice (BigDecimal price);
    Item findItemByPrice (BigDecimal price);
}
