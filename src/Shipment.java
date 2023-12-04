/**
 * {abstract} -->
 * Shipment
 *  ----------------
 *  ----------------
 * + getPrice() -->
 * + print() -->
 */
public abstract class Shipment {

    public Shipment() {
    }

    protected abstract double getPrice();
    protected abstract void print();
}
