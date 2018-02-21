import java.util.Scanner;

public class MoreUserInput {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		String firstName;
		String lastName;
		int grade;
		int id;
		String login;
		double gpa;

		System.out.println("Please enter the following information so I can sell it for a profit!");
		
		System.out.println("What is your first name?");
		firstName = keyboard.next();

		System.out.println("What is your last name?");
		lastName = keyboard.next();

		System.out.println("What grade are you in?");
		grade = keyboard.nextInt();

		System.out.println("What is your student ID?");
		id = keyboard.nextInt();

		System.out.println("What is your login?");
		login = keyboard.next();

		System.out.println("What is your GPA?");
		gpa = keyboard.nextDouble();

		System.out.println("Your information:");
		System.out.println("	Login: " + login);
		System.out.println("	ID:    " + id);
		System.out.println("	Name:  " + lastName + ", " + firstName);
		System.out.println("        GPA:   " + gpa);
		System.out.println("        Grade: " + grade);
    }

}

