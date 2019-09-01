import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, feet, inches, pounds;

    System.out.print( "Your height in m: " );
    m = keyboard.nextDouble();

    System.out.print( "Your weight in kg: " );
    kg = keyboard.nextDouble();

    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );

    System.out.print( "Your height (feet only): ");
    feet = keyboard.nextDouble();
    System.out.print( "Your height (inches): ");
    inches = keyboard.nextDouble();
    System.out.print( "Your weight in pounds:" );
    pounds = keyboard.nextDouble();

    System.out.println( "Your BMI is " + bmi );
    System.out.println( "height of " + (feet * 12 + inches) / 39.37 + " meters" );
    System.out.println( "weight of " + pounds / 2.205 + " kg" );
  }
}
