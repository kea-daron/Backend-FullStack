import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> vector = new Vector<>(
                List.of(1,12,5)
        );
//        Vector<Integer> vector1 = new Vector<>(
//                List.of(1,12, 4)
//        );
        //vector.addAll(vector1);
        //vector.removeAll(vector1);// remove the same element of one vector comparing to another
        // stream api
        vector.stream()
                .filter(e->e%2==0)
                .map(e->e*2)
                .forEach(System.out::println);
        // search and convert to list
        List<Integer> result = vector.stream()
                .filter(e->e%2!=0)
                .toList();
        Integer found = vector.stream()
                .filter(e->e.equals(5))
                .findFirst().get();


    }
}
