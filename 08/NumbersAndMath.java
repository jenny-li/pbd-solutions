public class NumbersAndMath
{
	public static void main( String[] args )
	{	// prints a string
		System.out.println( "I will now count my chickens:" );

		// prints nummber of hens and roosters
		System.out.println( "Hens " + ( 25.0 + 30.0 / 6.0 ) );
		System.out.println( "Roosters " + ( 100.0 - 25.0 * 3.0 % 4.0 ) );

		System.out.println( "Now I will count the eggs:" );
		
		// % means take the remainder, print the number of eggs
		System.out.println( 3.0 + 2.0 + 1.0 - 5.0 + 4.0 % 2.0 - 1.0 / 4.0 + 6.0 );

		// print string
		System.out.println( "Is it true that 3 + 2 < 5 - 7?" );
		
		// prints false 
		System.out.println( 3 + 2 < 5 - 7 );

		// Print questions and answer questions by adding or subtracting numbers
		System.out.println( "What is 3 + 2? " + ( 3.0 + 2.0 ) );
		System.out.println( "What is 5 - 7? " + ( 5.0 - 7.0 ) );

		// Print string, previouse code showed how 2 < 5
		System.out.println( "Oh, that's why it's false." );

		System.out.println( "How about some more." );

		// print true or false
		System.out.println( "Is it greater? " + ( 5 > -2 ) );
		System.out.println( "Is it greater or equal? " + ( 5 >= -2 ) );
		System.out.println( "Is it less or equal? " + ( 5 <= -2 ) );
	}
}
