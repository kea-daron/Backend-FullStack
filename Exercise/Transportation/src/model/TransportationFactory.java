package model;

public class TransportationFactory {
    public static Transportation getTransportation(String type) {
        if (type.equalsIgnoreCase("truck")) {
            return new Truck();
        } else if (type.equalsIgnoreCase("ship")) {
            return new Ship();
        } else {
            System.out.println("Unknown Transportation");
        }
        return null;
    }
}
