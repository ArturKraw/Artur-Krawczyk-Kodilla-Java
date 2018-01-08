package com.kodilla.hibernate.invoice;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="PRODUCTS")
public class Product {
    private int productId;
    private String name;
    //private Item item;


    public Product() {
    }

    public Product (String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID", unique=true)
    public int getProductId () {
        return productId;

   }
    @Column(name="PRODUCT_NAME")
    public String getName () {
        return name;
    }

    public void setProductId (int productId) {
        this.productId = productId;
    }
    public void setName (String name) {
        this.name = name;
    }

    /*
    @ManyToOne
    @JoinColumn (name = "Product_ID")
    public Item getItem () {
        return item;
    }

    public void setItem (Item item) {
        this.item = item;
    }
    */
}
