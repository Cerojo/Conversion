import Arithmetic.*;

public class Main {
    private static Add add = new Add();
    public static void main(String[] args) {
        String x = "A";
        String y = "A";
        print(add.hexadecimal(x, y));
    }

    private static void print(Object o){
        System.out.println(o);
    }
}
