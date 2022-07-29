package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Meat extends Material  implements Serializable {
    private double weight;

    @Override
    public double getAmount() {
        return weight*this.getPrice();
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.getManufacturingDate().plusWeeks(1);
    }

    public Meat() {
    }

    public Meat(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
