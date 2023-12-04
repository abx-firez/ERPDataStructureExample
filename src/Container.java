import java.util.ArrayList;

/**
 * Container -->
 *  -------------------
 * - shipments: ArrayList <Shipment> -->
 *  -------------------
 * + addShipment(Shipment)
 * + getPrice()
 * + print()
 */
public class Container extends Shipment {

    private String cName;
    private ArrayList<Shipment> shipments;

    public Container(String cName) {
        this.cName = cName;
        this.shipments = new ArrayList<>();
    }

    public void addShipment(Shipment sh){
        this.shipments.add(sh);
    }

    @Override
    protected double getPrice() {
        double totalPrice = 0.0;
        for(Shipment s : shipments){
            totalPrice += s.getPrice();
        }
        return totalPrice;
    }

    @Override
    protected void print() {
        System.out.println(this);
        for (Shipment s : shipments){
            s.print();
        }
    }

    public String toString(){
        return "Container: " + cName + " and the total price is... " + getPrice() +  "\n";
    }
}
