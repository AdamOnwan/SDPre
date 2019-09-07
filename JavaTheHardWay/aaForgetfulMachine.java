import java.util.Scanner;

public class aaForgetfulMachine {
    public static void main( String[] args ) {
      Scanner keyboard = new Scanner(System.in);

      System.out.println( "What city is the capital of France?" );
      keyboard.next();

      System.out.println( "What is 6 multiplied by 7?" );
      keyboard.nextInt(); // cannot type a number with a decimal

      System.out.println( "Enter a number between 0.0 and 1.0." );
      keyboard.nextDouble(); //cannot type any letters

      System.out.println( "Is there anything else you would like to say?" );
      keyboard.next();
  }
}
