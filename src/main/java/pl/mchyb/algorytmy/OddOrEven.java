/*
Given an array of numbers (a list in groovy), determine whether the sum of all of the numbers is odd or even.
Give your answer in string format as 'odd' or 'even'.
*/

public class OddOrEven {
  public static String oddOrEven (int[] array) {
      int result = 0;
      for(int i = 0; i < array.length; i++){
          result = result + array[i];
      }
      return (result%2 == 0) ? "even" : "odd";
  }
}
