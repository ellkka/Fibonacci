package md.roadmap;

public class App {
    public static void main(String[] args) {



        System.out.println();

        Fibonacci number = new Fibonacci();

        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        int fIterative = number.fibonacciIterative(2_000_000);

        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        long timeOfExecution = (endTime - startTime);
        System.out.println(fIterative);
        System.out.println("Time: " + timeOfExecution);

        int fRecursion = number.fibonacciRecursion(3);


        System.out.println(fRecursion);

        Factorial f1 = new Factorial();

        long fi = f1.factorialIterative(5);

        long fr = f1.factorialRecursive(5);


        System.out.println(fi);
       // System.out.println(fr);


    }
}
