import java.util.Random;

public class FlickerPhrase {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        
        for (int i = 0; i < 100000; i++) {
            int randomNumber = 1 + randomNumberGenerator.nextInt(5);
            // Write five if statements here.
            if (randomNumber == 1) {
                first();
            } else if (randomNumber == 2) {
                second();
            } else if (randomNumber == 3) {
                third();
            } else if (randomNumber == 4) {
                fourth();
            } else if (randomNumber == 5) {
                fifth();
            }
            

            // Optional: after the if statements are over, add in a slight delay.
        }

        System.out.println("I pledge allegiance to the flag.");
        
    }

    public static void first() {
        System.out.print("I                               \r");
    }

    public static void second() {
        System.out.print("  pledge                        \r");
    }

    public static void third() {
        System.out.print("         allegiance             \r");
    }

    public static void fourth() {
        System.out.print("                    to the      \r");
    }

    public static void fifth() {
        System.out.print("                           flag.\r");
    }
}
