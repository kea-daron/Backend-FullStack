import service.Service;
import service.ServiceImp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ServiceImp service1 = new ServiceImp();
        service1.run();
        service1.getAllUsers();
        ServiceImp service2 = new ServiceImp();
        service2.run();
        service2.getAllUsers();
    }
}