public class Test {
    public static void main(String[] args) {
      // This is a simple comment
      /*
      This is a block comment 
      */
      String text = "Hello world";
      System.out.println("My text is: " + text);
      System.out.print("Hello ");
      System.out.print("this goes in the same line \n");
      float num = 4.98f; // 8e4f for scientific notation
      double num2 = 2.43d; // 3E4d for scientific notation
      long num3 = 12312342L;
      short num4 = 43;
      System.out.println(3 * 5 + 4 - 2);
      System.out.println(num * num2);

      //Casting
      double num5 = num4; //This is done automatically
      short num6 = (short) num2; //If you don't do this manually, it will throw an exception
      System.out.println(String.format("Num reconvertido: %d", num6)); 
      // In java you can't use %i for integers, you use %d for integers and %f for float and doubles, %t for date/time and %s for string

      //Conditionals
      int myAge = 25;
      int votingAge = 18;

      if (myAge >= votingAge) {
        System.out.println("Old enough to vote!");
      }
      else if (myAge == votingAge) {
        System.out.println("You have 18 years old.");
      } 
      else {
        System.out.println("Not old enough to vote.");
      }
      
      //Short conditional: variable = (condition) ? expressionTrue :  expressionFalse;

      // Loops are the same in C, except for the inclusion of 'for each'
      // Arrays are quite similar also
      String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
      for (String i : cars) {
        System.out.println(i);
      }
      // Get the length of an array
      System.out.println(String.format("The number of cars available is: %d", cars.length));
    }
  }