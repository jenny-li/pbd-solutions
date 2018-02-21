import java.util.Scanner;

public class AgeInFive {
	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;

		System.out.print("Hello. What is your name?");
		name = keyboard.next();

		System.out.print("Hi, " + name + "! How old are you?");
		age = keyboard.nextInt();

		int ageFive = age + 5;
		int ageLess = age - 5;

		System.out.println("Did you know that in five years you will be " + ageFive + " years old?");
		System.out.println("And five years ago you were " + ageLess + "! Imagine that!");

    }
}

