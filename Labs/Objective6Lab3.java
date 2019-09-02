import java.util.Scanner;

public class Objective6Lab3 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int counter = 1;

      while(counter <= 20) {
        if (counter % 2 != 0 ) {
          System.out.println( counter + " is odd" );
        }
        if (counter % 2 == 0 ) {
          System.out.println( counter + " is even" );
        }
        counter = counter + 1;

      }
  }
}
