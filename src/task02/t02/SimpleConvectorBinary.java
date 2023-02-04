package task02.t02;

public class SimpleConvectorBinary {

    public int simpleConversionBinaryToDecimal(String inputBinaryNumber){

        return Integer.parseInt(inputBinaryNumber, 2);
    }

    public String simpleConversionDecimalToBinary(int inputDecimalNumber){

        return Integer.toBinaryString(inputDecimalNumber);
    }
}
