package Binary;

public class Decimal implements BinaryInterface{
    private Binary binary;

    Decimal(){
        binary = new Binary();
    }

    @Override
    public String toBinary(String val) {
        String result = "";
        try {
            int value = Integer.parseInt(val);
            if(value < 0){
                return nil;
            }
            else if(value == 0){
                return val;
            }
            else{
                while (value != 0){
                    if(value%2 == 0){
                        result = "0" + result;
                    }
                    else {
                        result = "1" + result;
                    }
                    value /= 2;
                }
                return result;
            }
        }
        catch (Exception e){
            return nil;
        }
    }

    @Override
    public String toDecimal(String val) {
        return val;
    }

    @Override
    public String toOctal(String val) {
        String result = toBinary(val);
        return binary.toOctal(result);
    }

    @Override
    public String toHexadecimal(String val) {
        String result = toBinary(val);
        return binary.toHexadecimal(result);
    }
}
