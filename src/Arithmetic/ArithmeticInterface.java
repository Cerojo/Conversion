package Arithmetic;
public interface ArithmeticInterface {
    final String nil = "Invalid Input";

    String binary(String x, String y);

    String octal(String x, String y);

    String hexadecimal(String x, String y);

    String decimal(String x, String y);
}
