package basicExceptionHandling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            System.out.print("Input age : ");
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            System.out.print("Age : " + age);
        }catch(Exception e){
            System.out.println("Invalid input");
        }
        System.out.print("Hello World");
    }
}
