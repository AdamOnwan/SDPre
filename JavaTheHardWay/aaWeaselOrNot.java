import java.util.Scanner;

public class aaWeaselOrNot {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    String word;
    boolean yep, nope;

    System.out.println( "Type the word \"weasel\", please." );
    word = keyboard.next();

    yep   =   word.equals("weasel"); // weasel does not work after word and before .
    nope  = ! word.equals("weasel");

    System.out.println( "You typed what was requested: " + yep );
    System.out.println( "You ignored polite instructions: " + nope );
  }
}
