package Binary;

public class Hexadecimal implements BinaryInterface {
    private Decimal decimal;
    private Binary binary;

    public Hexadecimal(){
        decimal = new Decimal();
        binary = new Binary();
    }

    @Override
    public String toBinary(String val) {
        boolean init = false;
        String result = "";
        if(val.toCharArray().length == 0){
            return nil;
        }
        for(char h: val.toCharArray()){
            switch (h+""){
                case "-":
                    return nil;
                case A:
                    result += ten;
                    break;
                case B:
                    result += eleven;
                    break;
                case C:
                    result += twelve;
                    break;
                case D:
                    result += thirteen;
                    break;
                case E:
                    result += fourteen;
                    break;
                case F:
                    result += fifteen;
                    break;
                default:
                    if(init) {
                        if (Integer.parseInt(h + "") < 2) {
                            result +=  "000" + decimal.toBinary(h + "");
                        } else if (Integer.parseInt(h + "") < 4) {
                            result += "00" + decimal.toBinary(h + "");
                        } else if (Integer.parseInt(h + "") < 8) {
                            result += "0" + decimal.toBinary(h + "");
                        } else {
                            result += decimal.toBinary(h + "");
                        }
                    }else{
                        result += decimal.toBinary(h + "");
                    }
                    break;
            }
            init = true;
        }
        return result;
    }

    @Override
    public String toDecimal(String val) {
        String result = toBinary(val);
        return binary.toDecimal(result);
    }

    @Override
    public String toOctal(String val) {
        String result = toBinary(val);
        return binary.toOctal(result);
    }

    @Override
    public String toHexadecimal(String val) {
        return val;
    }
}
