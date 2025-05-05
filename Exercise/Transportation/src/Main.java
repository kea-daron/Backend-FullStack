import model.Transportation;
import model.TransportationFactory;

public class Main {
    public static void main(String[] args) {
        Transportation transport1 = TransportationFactory.getTransportation("ship");
        transport1.deliver();
    }
}
