import java.util.Scanner;

public class Objective6Lab1 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int counter = 10;

    while(counter > 0) {
      System.out.println(counter);
      /*
      Your solution goes here
      */

      counter = counter - 1; //this makes we count down
    }
  }
}
