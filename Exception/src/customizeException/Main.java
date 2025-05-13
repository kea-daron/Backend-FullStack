package customizeException;
import java.util.Scanner;

class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}
public class Main {
    static int inputAge() throws MyException{
        try{
            System.out.print("[+] Insert age: ");
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            System.out.println("Age is: " + age);
            return age;
        }catch (Exception exception){
            throw new MyException("Invalid input");
        }
    }
    public static void main(String[] args) {
        try{
            inputAge();
        }catch (MyException myException){
            System.out.println(myException.getMessage());
        }
    }
}

