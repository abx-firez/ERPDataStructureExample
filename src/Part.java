/**
 * Part -->
 * ---------------
 * - Name: String  -->
 * - Price: Double -->
 * ----------------
 * + getPrice() -->
 * + print() -->
 */
public class Part extends Shipment {

    private String name;
    private double price;
    public Part(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    protected double getPrice() {
        return price;
    }

    @Override
    protected void print() {
        System.out.println(this);
    }

    public String toString(){
        return "Name: " + name + " \t" + "Price: " + price + "\n";
    }
}
