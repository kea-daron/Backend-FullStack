package uncheckedExpception;

import java.util.Scanner;

public class Main {
    static void run() throws RuntimeException {
        try{
            System.out.println(new Scanner(System.in).nextInt());
        }catch (Exception e){
            throw new RuntimeException("My unchecked exception");
        }
    }
    public static void main(String[] args) {
        run();
    }
}
