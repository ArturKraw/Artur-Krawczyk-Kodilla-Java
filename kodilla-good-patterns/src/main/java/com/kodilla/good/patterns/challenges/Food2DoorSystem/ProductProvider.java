package com.kodilla.good.patterns.challenges.Food2DoorSystem;

public class ProductProvider {

    private final String name;
    private final String adress;

    public ProductProvider (String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName () {
        return name;
    }

    public String getAdress () {
        return adress;
    }

    @Override
    public String toString () {
        return "ProductProvider{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductProvider)) return false;

        ProductProvider that = (ProductProvider) o;

        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        return getAdress() != null ? getAdress().equals(that.getAdress()) : that.getAdress() == null;
    }

    @Override
    public int hashCode () {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getAdress() != null ? getAdress().hashCode() : 0);
        return result;
    }
}
