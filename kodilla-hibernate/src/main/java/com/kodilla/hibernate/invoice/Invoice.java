package com.kodilla.hibernate.invoice;

        import javax.persistence.*;
        import javax.validation.constraints.NotNull;
        import java.util.ArrayList;
        import java.util.List;

@Entity
@Table(name="INVOICE")
public class Invoice {
    private int invoiceId;
    private String number;
    private List<Item> items = new ArrayList<>();

    public Invoice() {
    }

    public Invoice (String number) {
        this.number = number;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="Invoice_ID", unique=true)
    public int getInvoiceId () {
        return invoiceId;
    }

    @Column(name="INVOICE_NUMBER")
    public String getNumber () {
        return number;
    }

    private void setInvoiceId (int invoiceId) {
        this.invoiceId = invoiceId;
    }
    private void setNumber (String number) {
        this.number = number;
    }


    @OneToMany (
            targetEntity = Item.class,
            mappedBy = "invoice",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List <Item> getItems () {
        return items;
    }

    private void setItems (List <Item> items) {
        this.items = items;
    }


}
