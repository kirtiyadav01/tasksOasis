
package javaapplication.numberguessinggame;

public class NumberGuessingGame {
    public static void guessNumber(){
        // Generating the number
        int number = (int)(100 * Math.random());
        // Given K trials
        int K = 5;
        int guess;
        int i = 0;
        System.out.println("A number is chosen between 1 to 100."+ "Guess the number within 5 trials.");
        // Iterate over K Trials
        while(i < K){
            System.out.println("Guess the number:");
         // Take input for guessing
            guess = new java.util.Scanner(System.in).nextInt();
         //matching the number
            if (number == guess) {
                System.out.println("Congratulations! You guessed the number right.");
                break;
            }
            else if (number > guess) {
                System.out.println( "The number is greater than " + guess);
            }
            else if (number < guess) {
                System.out.println( "The number is less than " + guess);
                }
            i++;
            if (i == K) {
            System.out.println(
                "You have exhausted"+ K +"trials.");
            System.out.println("The number was " + number);
            }
        }
        
   }
    public static void main(String[] args) {
            guessNumber();
       
    }
}
