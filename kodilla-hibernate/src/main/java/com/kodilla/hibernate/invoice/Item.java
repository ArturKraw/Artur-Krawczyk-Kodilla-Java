package com.kodilla.hibernate.invoice;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;



public class Item {
    private int id;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Product product;

    public Item (BigDecimal price, int quantity, BigDecimal value) {
        this.price = price;
        this.quantity = quantity;
        this.value = value;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID", unique=true)
    public int getId () {
        return id;
    }
    @Column(name="PRICE")
    public BigDecimal getPrice () {
        return price;
    }
    @Column(name="QUANTITY")
    public int getQuantity () {
        return quantity;
    }
    @Column(name="VALUE")
    public BigDecimal getValue () {
        return value;
    }


    public void setId (int id) {
        this.id = id;
    }

    public void setPrice (BigDecimal price) {
        this.price = price;
    }

    public void setQuantity (int quantity) {
        this.quantity = quantity;
    }

    public void setValue (BigDecimal value) {
        this.value = value;
    }
}
