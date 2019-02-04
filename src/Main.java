import Arithmetic.*;

public class Main {
    private static Add add = new Add();
    public static void main(String[] args) {
        String x = "1";
        String y = "11";
        print(add.binary(x, y));
    }

    private static void print(Object o){
        System.out.println(o);
    }
}
