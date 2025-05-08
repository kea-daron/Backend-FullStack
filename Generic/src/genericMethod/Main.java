package genericMethod;

class Util{
    public static <T> void getInfo(T data){
        System.out.println(data);
    }
}
public class Main {
    public static void main(String[] args) {
        Util.<Integer>getInfo(1);
        Util.getInfo("Hello");
        Util.getInfo(12.23);
        Util.getInfo(new String[]{"hi",",","hello"});
    }
}
