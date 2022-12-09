package OrangeHRM_demo;

import java.util.Random;

public class common {
    public static CharSequence randomNumber;

    public static int randomNumbers(){
        Random random = new Random();
        int randomNumber = random.nextInt();
        return randomNumber;
    }
}
