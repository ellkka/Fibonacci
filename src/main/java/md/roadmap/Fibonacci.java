package md.roadmap;

public class Fibonacci {

    public final int DEFAULT_NUMBER = 10;

    public int fibonacciIterative(int number){

        int prepreNumber, preNumber = 0, currentNumber = 1;

        for (int i = 1; i < number; i++){

            prepreNumber = preNumber;
            preNumber = currentNumber;
            currentNumber = prepreNumber + preNumber;

        }

        return  currentNumber;

    }
    public int fibonacciRecursion(int number) {
        //use recursion
        if (number == 0) {

            return 0;

        } else if (number == 1) {

            return 1;
        }
        return fibonacciRecursion(number - 1) + fibonacciRecursion(number - 2);
    }


}
