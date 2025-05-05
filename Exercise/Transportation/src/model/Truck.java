package model;

public class Truck implements Transportation {

    @Override
    public void deliver() {
        System.out.println("Delivery by Truck");
    }
}
