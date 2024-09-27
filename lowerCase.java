/* Name: MorganAshli Harper
   Professor: Hoing
   Date: Jan 24, 2024
   Homework: fixing errors and creating changes


 */
/*
  * The tests will see if a string is in lowercase.
  *  String input will be checked
  * true meaning all is lowercase
  * String length has to be greater than zero
  * false if they are not lowercase
  * if something is a non-letter it will automatically be false.
  * loop should go through each character index so that it can determine what they are...
 */


public class lowerCase {
    public static void main(String[] args) {

        //test cases
        boolean case1 = isLowerCase("AbCdE"); //This will be false
        boolean case2 = isLowerCase("abc"); // This will be true
        boolean case3 = isLowerCase("ABC");//This will be false
        boolean case4 = isLowerCase("' ] "); //This will be false
        boolean case5 = isLowerCase("morgan"); // This will be true

        // This will print out the test cases
        System.out.println(case1); //This will be false
        System.out.println(case2); // This will be true
        System.out.println(case3);//This will be false
        System.out.println(case4);//This will be false
        System.out.println(case5); // This will be true
    }


    public static boolean isLowerCase(String s) { // boolean variable should be result to true
        // Each letter or character in each string will be updated by the result by checking to see if the character is between a or z. Then it will return the final result
        boolean result = true;
        for (int i = 0; i < s.length(); i++) { // the loop is going to go through each character in the string.
            result = result && (Character.isLowerCase(s.charAt(i))); // It will check to see if letters are lowercase.
        }
        return result; //
    }
} // closing the program
