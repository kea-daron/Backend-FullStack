package sreamAPI;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Ronn");
        names.add("Robert");
        names.remove("John");
        names.stream().filter(e->e.startsWith("R"))
                .map(e->e.toUpperCase())
                .forEach(e->System.out.println(e));
        System.out.println(names);
    }
}
