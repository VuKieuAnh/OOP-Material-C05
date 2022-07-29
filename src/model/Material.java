package model;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Material implements Serializable {
    private String id;
    private String name;
    private LocalDate manufacturingDate;
    private int price;

    public abstract double getAmount();
    public abstract LocalDate getExpiryDate();

    public Material() {
    }

    public Material(String id, String name, LocalDate manufacturingDate, int price) {
        this.id = id;
        this.name = name;
        this.manufacturingDate = manufacturingDate;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
