package handleExceptionByThrowing;

import java.util.Scanner;

public class Main {
    static int inputAge() throws Exception{
        try {
            System.out.print("Input Age : ");
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            System.out.print("Input Age : "+ age);
            return age;
        }catch (Exception e){
            throw  new Exception("Invalid input");
        }
    }
    public static void main(String[] args) {
        try {
            inputAge();
        }catch (Exception e){
            System.out.println("Please enter a valid age");
        }
    }
}
