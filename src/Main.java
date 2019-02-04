import Arithmetic.*;

public class Main {
    private static Add add = new Add();
    private static Divide divide = new Divide();
    public static void main(String[] args) {
        String x = "14";
        String y = "2";
        print(divide.hexadecimal(x, y));
    }

    private static void print(Object o){
        System.out.println(o);
    }
}
