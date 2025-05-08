package boundedType;

class Util{
    public static <T extends Number> Number sum(T a, T b){
        return a.doubleValue() + b.doubleValue();
    }
}

public class Main {
    public static void main(String[] args) {
        Util.sum(1, 2);
        Util.sum(1.3, 2.5);
        System.out.println(Util.sum(1, 2));
        System.out.println(Util.sum(1.3, 2.5));


        Number number1 = Util.sum(1, 2);
        Number number2 = Util.sum(1.3, 2.5);
        System.out.println(number1);
        System.out.println(number2);
    }
}
