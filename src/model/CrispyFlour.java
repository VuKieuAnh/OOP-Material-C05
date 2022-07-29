package model;

import java.io.Serializable;
import java.time.LocalDate;

public class CrispyFlour extends Material implements Serializable {
    private double quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity*this.getPrice();
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.getManufacturingDate().plusYears(1);
    }

    @Override
    public String toString() {
        return "CrispyFlour{" +
                "quantity=" + quantity +
                '}';
    }
}
