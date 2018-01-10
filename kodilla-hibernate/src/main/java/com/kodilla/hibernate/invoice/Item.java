package com.kodilla.hibernate.invoice;


        import javax.persistence.*;
        import javax.validation.constraints.NotNull;
        import java.math.BigDecimal;


@Entity
@Table(name="ITEMS")
public class Item {
    private int itemId;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;

    private Invoice invoice;

    public Item() {
    }

    public Item (BigDecimal price, int quantity) {
        this.price = price;
        this.quantity = quantity;
        this.value = price.multiply(new BigDecimal(quantity));
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="Item_ID", unique=true)
    public int getItemId () {
        return itemId;
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

    public void setItemId (int itemId) {this.itemId = itemId;   }
    public void setPrice (BigDecimal price) {
        this.price = price;
    }
    public void setQuantity (int quantity) {
        this.quantity = quantity;
    }
    public void setValue (BigDecimal value) {
        this.value = value;
    }

    @ManyToOne
    @JoinColumn (name = "Invoice_ID")

    public Invoice getInvoice () {
        return invoice;
    }
    public void setInvoice (Invoice invoice) {
        this.invoice = invoice;
    }

    @ManyToOne
    @JoinColumn (name = "Product_ID")
    public Product getProduct () {
        return product;
    }
    public void setProduct (Product product) {
        this.product = product;
    }
}
