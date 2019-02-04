package Binary;

public class Octal implements BinaryInterface {
    Decimal decimal = null;
    Binary binary = null;

    public Octal(){
        decimal = new Decimal();
        binary = new Binary();
    }

    @Override
    public String toBinary(String val) {
        if(val.toCharArray().length == 0){
            return nil;
        }
        String result = "";
        for(char c: val.toCharArray()){
            try{
                int octChar = Integer.parseInt(c+"");
                if(octChar < 8){
                    if(octChar < 4){
                        if(octChar < 2){
                            result += "00" + decimal.toBinary(c + "");
                        }
                        else {
                            result += "0" + decimal.toBinary(c + "");
                        }
                    }
                    else {
                        result += decimal.toBinary(c + "");
                    }
                }
                else{
                    return nil;
                }
            }
            catch (Exception e){
                return nil;
            }
        }
        for(char c: result.toCharArray()){
            if(c == '1'){
                return result;
            }
            result = result.substring(1);
        }
        if(result.toCharArray().length == 0){
            return "0";
        }
        return result;
    }

    @Override
    public String toDecimal(String val) {
        return binary.toDecimal(toBinary(val));
    }

    @Override
    public String toOctal(String val) {
        return val;
    }

    @Override
    public String toHexadecimal(String val) {
        return binary.toHexadecimal(toBinary(val));
    }
}
