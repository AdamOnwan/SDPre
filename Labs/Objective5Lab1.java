import java.util.Scanner;

public class Objective5Lab1 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    //int month = 6;
    int month;
    String monthName;

    System.out.print( "Which month? (1-12) " );
    month = keyboard.nextInt();

    switch (month) {
      case 1 : monthName = "January";
        //System.out.println("January");
        break;
      case 2 : monthName = "February";
        break;
      case 3 : monthName = "March";
        break;
      case 4 : monthName = "April";
        break;
      case 5 : monthName = "May";
        break;
      case 6 : monthName = "June";
        break;
      case 7 : monthName = "July";
        break;
      case 8 : monthName = "August";
        break;
      case 9 : monthName = "September";
        break;
      case 10: monthName = "October";
        break;
      case 11: monthName = "November";
        break;
      case 12: monthName = "December";
        break;

      /*
      Your solution goes here
      */

      default: monthName = "error";
        System.out.println("That is not a valid month");
        break;
    }
    System.out.println(monthName);
  }
}
