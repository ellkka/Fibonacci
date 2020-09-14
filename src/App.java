public class App {
    public static void main(String[] args) {

        Fibonacci n1 = new Fibonacci();
        //int a = n1.fibonacciIterative(3);
        int b = n1.fibonacciRecursion(3);

        //System.out.println(a);
        System.out.println(b);

        Factorial f1 = new Factorial();

        //long fi = f1.factorialIterative(5);
        long fr = f1.factorialRecursive(5);


        System.out.println(fi);
        System.out.println(fr);


    }
}
