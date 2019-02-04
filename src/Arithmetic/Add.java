package Arithmetic;

import Binary.*;

public class Add implements ArithmeticInterface {
    private Binary binary = null;
    private Octal octal = null;
    private Hexadecimal hexadecimal = null;
    private Decimal decimal = null;

    Add(){
        binary = new Binary();
        octal = new Octal();
        hexadecimal = new Hexadecimal();
        decimal = new Decimal();
    }


    @Override
    public String binary(String x, String y) {
        x = binary.toDecimal(x);
        y = binary.toDecimal(y);
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
