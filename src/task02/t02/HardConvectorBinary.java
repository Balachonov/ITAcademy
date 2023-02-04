package task02.t02;

public class HardConvectorBinary {

    public int hardConversionBinaryToDecimal (String inputBinaryNumber){
        int outputDecimalNumber = 0;
        for (int i = 0 ; i < inputBinaryNumber.length(); i++)
        {
            int index = inputBinaryNumber.length() - 1 - i;
            int value = Character.getNumericValue(inputBinaryNumber.charAt(index));
            outputDecimalNumber = (int) (outputDecimalNumber + value * Math.pow(2, i));
        }
        return outputDecimalNumber;
    }

    public String hardConversionDecimalToBinary (int inputDecimalNumber) {
        StringBuilder outputBinaryNumber = new StringBuilder();
        while (inputDecimalNumber != 0)
        {
            outputBinaryNumber.insert(0, (inputDecimalNumber % 2));
            inputDecimalNumber = inputDecimalNumber / 2;
        }
        return outputBinaryNumber.toString();
    }
}
