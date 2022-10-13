package homework_week_1mitali;

/**
 * 10. Write a Java program that takes two numbers as input and display the
 * product of two numbers.
 * Test Data:
 * Input first number: 25
 * Input second number: 5
 * Expected Output : 25 x 5 = 125
 */
public class Task10ProductOfTwoNumber {
    public static void main(String[] args) {
        //First Number declaration
        int firstNumber = 25;
        //Second number declaration
        int SecondNumber = 5;
        int produced = firstNumber * SecondNumber;
        //Expected output
        System.out.println(firstNumber + " x " + SecondNumber + " = " + produced);
    }
}
