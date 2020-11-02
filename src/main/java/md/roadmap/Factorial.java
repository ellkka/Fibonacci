package md.roadmap;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        long result = factorial.factorialRecursive(6);
        System.out.println(result);


    }
    public long factorialIterative(long number){

        int num = 1;

        for (int i = 1; i <= number; i++){
            num = num * i;
        }
        return num;
    }

    public long factorialRecursive(long number){

        if (number >= 1)
            return number*factorialRecursive(number - 1);
        else
            return 1;
    }
}
