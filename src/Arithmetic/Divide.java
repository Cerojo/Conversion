package Arithmetic;

import Binary.*;

public class Divide implements ArithmeticInterface {
    private Binary binary = null;
    private Octal octal = null;
    private Hexadecimal hexadecimal = null;
    private Decimal decimal = null;

    public Divide(){
        binary = new Binary();
        octal = new Octal();
        hexadecimal = new Hexadecimal();
        decimal = new Decimal();
    }


    @Override
    public String binary(String x, String y) {
        x = binary.toDecimal(x);
        y = binary.toDecimal(y);
        try {
            return decimal.toBinary(_div(x,y));
        }
        catch (Exception e){
            return nil;
        }
    }

    @Override
    public String octal(String x, String y) {
        x = octal.toDecimal(x);
        y = octal.toDecimal(y);
        try {
            return decimal.toOctal(_div(x,y));
        }
        catch (Exception e){
            return nil;
        }
    }

    @Override
    public String hexadecimal(String x, String y) {
        x = hexadecimal.toDecimal(x);
        y = hexadecimal.toDecimal(y);
        try {
            return decimal.toHexadecimal(_div(x,y));
        }
        catch (Exception e){
            return nil;
        }
    }

    @Override
    public String decimal(String x, String y) {
        try {
            return _div(x,y);
        }
        catch (Exception e){
            return nil;
        }
    }

    private String _div(String x, String y){
        int _x = Integer.parseInt(x);
        int _y = Integer.parseInt(y);
        int result = _x/_y;
        return result+"";
    }
}
