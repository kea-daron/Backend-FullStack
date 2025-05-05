package model;

public class Ship implements Transportation {

    @Override
    public void deliver() {
        System.out.println("Delivery by Ship");
    }
}
