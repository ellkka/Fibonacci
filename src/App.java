public class App {
    public static void main(String[] args) {

        Fibonacci n1 = new Fibonacci();
        int a = n1.fibonacciIterative(3);
        int b = n1.fibonacciRecursion(3);

        //System.out.println(a);
        System.out.println(b);


    }
}
