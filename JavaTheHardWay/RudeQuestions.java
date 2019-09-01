import java.util.Scanner;

public class RudeQuestions {
  public static void main( String[] args ) {
    String name;
    int age;
    double weight, income, rent;

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

    System.out.print( "Last question how much is your rent " );
    rent = keyboard.nextDouble();
    System.out.println( "Wow " + rent + " is a lot!" );
    /* 1. No it does not blow up, an interger can be a Double
       2. No a String can be a number
       3. To make it blow up I type a word when its asking for the interger or the double, and for the String it stores everything so I can't blow it up
       */
  }
}
