package Binary;

public class Binary implements BinaryInterface {

    Binary(){ }

    @Override
    public String toBinary(String val) {
        return val;
    }

    @Override
    public String toDecimal(String val) {
        int i = val.length()-1;
        int result = 0;

        if(val.toCharArray().length == 0 || val.equals(nil))
            return nil;

        for(char c: val.toCharArray()){
            if(c == '1'){
                result += Math.pow(2, i);
            }
            else if(c != '0'){
                return nil;
            }
            i--;
        }
        return result+"";
    }

    @Override
    public String toOctal(String val) {
        String result = "";

        if(val.toCharArray().length == 0 || val.equals(nil))
            return nil;

        int size = val.length();
        for(int i = 3; i <= size; i += 3){
            String sub = val.substring(size-i);
            result = toDecimal(sub) + result;
            val = val.substring(0, size-i);
        }

        if(val.length() > 0)
            result = toDecimal(val) + result;

        return result;
    }

    @Override
    public String toHexadecimal(String val) {
        String result = "";

        if(val.toCharArray().length == 0 || val.equals(nil))
            return nil;

        int size = val.length();
        for(int i = 4; i <= size; i += 4){
            String sub = val.substring(size-i);
            switch (sub){
                case ten:
                    result = A + result;
                    break;
                case eleven:
                    result = B + result;
                    break;
                case twelve:
                    result = C + result;
                    break;
                case thirteen:
                    result = D + result;
                    break;
                case fourteen:
                    result = E + result;
                    break;
                case fifteen:
                    result = F + result;
                    break;
                default:
                    result = toDecimal(sub) + result;
                    break;
            }
            val = val.substring(0, size-i);
        }

        if(val.length() > 0)
            result = toDecimal(val) + result;

        return result;
    }
}
