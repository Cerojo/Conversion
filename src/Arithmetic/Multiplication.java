package Arithmetic;

import Binary.*;

public class Multiplication implements ArithmeticInterface{
    private Binary binary = null;
    private Octal octal = null;
    private Hexadecimal hexadecimal = null;
    private Decimal decimal = null;

    Multiplication(){
        binary = new Binary();
        octal = new Octal();
        hexadecimal = new Hexadecimal();
        decimal = new Decimal();
    }


    @Override
    public String binary(String x, String y) {
        return null;
    }

    @Override
    public String octal(String x, String y) {
        return null;
    }

    @Override
    public String hexadecimal(String x, String y) {
        return null;
    }

    @Override
    public String decimal(String x, String y) {
        return null;
    }
}
