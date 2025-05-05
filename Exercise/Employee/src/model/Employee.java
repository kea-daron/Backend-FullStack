package model;

public class Employee {
    private int id;
    private String name;
    private String position;
    private double salary;

    public Employee(int id, String name, String position, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + '\n' +
                ", id : " + id + '\n' +
                ", name : '" + name + '\n' +
                ", position : '" + position + '\n' +
                ", salary : " + salary +
                '}';
    }
}

