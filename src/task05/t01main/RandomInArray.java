package task05.t01main;
import java.util.Random;
import static task05.t01main.Constants.*;

public final class RandomInArray {
    public static String randomString(){
        Random random = new Random();
        char[] tempSomeString = new char[7];
        for (int i = 0; i < tempSomeString.length; i++) {
            tempSomeString[i] = LETTERS.charAt(random.nextInt(LETTERS.length()));
        }
        return String.valueOf(tempSomeString);
    }

    public static String randomDouble(){
        return String.valueOf(Math.random()*10).substring(0,7);
    }
}
