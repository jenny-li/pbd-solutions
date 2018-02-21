import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		int feet;
		int inches;
		double pounds;

		System.out.print("Your height (feet only): ");
		feet = keyboard.nextInt();

		System.out.print("Your height (inches): ");
		inches = keyboard.nextInt();

		System.out.print("Your weight in pounds: ");
		pounds = keyboard.nextDouble();
		
		int inchesTotal = (feet * 12) + inches;
        double heightM = inchesTotal * 0.254;
		double heightSq = heightM * heightM;
		double weightKg = pounds * 0.453592;
		double bmi = weightKg / heightSq;
		
		System.out.println("");
		System.out.println("Your BMI is: " + bmi);
    }
}

