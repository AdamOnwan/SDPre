import java.util.Scanner;

public class aaRudeQuestions {
    public static void main( String[] args ) {
      String name, work;
      int age;
      double weight, income;

      Scanner keyboard = new Scanner(System.in);

      System.out.print( "Hello. What is your name? " );
      name = keyboard.next();

      System.out.print( "Hi, " + name + "! How old are you? " );
      age = keyboard.nextInt();

      System.out.println( " So you're " + age + ", eh? That's not very old." );
      System.out.print( "How much do you weigh, " + name + "? " );
      weight = keyboard.nextDouble();

      System.out.println( weight + "! Better keep that quiet!!" );
      System.out.print( "Finally, what's your income, " + name + "? " );
      income = keyboard.nextDouble();

      System.out.print( "Hopefully that is " + income + " per hour" );
      System.out.println( " and not per year!" );
      System.out.print( "Well, thanks for answering my rude questions, " );
      System.out.println( name + "." );
      //does not blow up, int can be put into double.
      // 2. does not blow up, int can be inside a string
      // 3. string can be anything so it did not blow up
      System.out.print( "What do you do at work " + name + "? " );
      work = keyboard.next();
      System.out.println( "So " + name + " is a " + age + " year old and " + work );
  }
}
