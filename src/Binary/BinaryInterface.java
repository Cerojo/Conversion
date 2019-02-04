package Binary;

public interface BinaryInterface {
    final String A = "A", B = "B", C = "C", D = "D", E = "E", F = "F";
    final String ten = "1010", eleven = "1011", twelve = "1100", thirteen = "1101", fourteen = "1110", fifteen = "1111";
    final String nil = "Invalid Input";


    String toBinary(String val);
    String toDecimal(String val);
    String toOctal(String val);
    String toHexadecimal(String val);
}
