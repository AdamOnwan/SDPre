public class aaCreatingVariables {
  public static void main( String[] args ) {
    int x, y, age, z;
    double seconds, e, checking, big;
    String firstName, lastName, title, jobTitle, addy;

    x = 10;
    y = 400;
    age = 39;
    z = 5;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    big = 100000000000000000000000.0; //without decimal it gives error

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";
    jobTitle = "Developer";
    addy = "123 Dev Ave.";

    System.out.println( "The variable x contains " + x );
    System.out.println( "The value " + y + " is stored in the variable y." );
    System.out.println( "The experiment took" + seconds + "seconds." );
    System.out.println( "A favorite irrational # is Euler's number: " + e);
    System.out.println( "Hopefully you have more than $" + checking + "!" );
    System.out.println( "My name's " + title + " " + firstName + " " + lastName );
    System.out.println( big + " " + title + lastName + " " + jobTitle + z + " from " + addy);
  }
}
