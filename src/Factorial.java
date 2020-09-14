public class Factorial {

    protected long factorialIterative(long number){

        int num = 1;

        for (int i = 1; i <= number; i++){
            num = num * i;
        }
        return num;
    }

    protected long factorialRecursive(long number){

        if (number >= 1)
            return number*factorialRecursive(number - 1);
        else
            return 1;
    }
}
