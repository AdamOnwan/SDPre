import java.util.Scanner;

public class aaBMICalculator {
   public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, m1, m2, lbs, in, ft;

    /*System.out.print( "Your height in m: " );
    m = keyboard.nextDouble();

    System.out.print( "Your weight in kg: " );
    kg = keyboard.nextDouble();

    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );*/
    System.out.print( "Your height in ft: " );
    ft = keyboard.nextDouble();
    m1 = ft / 3.281;
    System.out.print( "Your " + ft + "ft and how many inches?" );
    in = keyboard.nextDouble();
    m2 = in / 39.37;
    m = m1 + m2;

    System.out.print( "Your weight in lbs: " );
    lbs = keyboard.nextDouble();
    kg = lbs / 2.205;

    bmi = kg / (m*m);
    System.out.println( "Your BMI is " + bmi );
  }
}
