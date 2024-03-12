//Write a recursive function to calculate the Fibonacci series up to a specified term .

public class Fibonacci {

    public static void main(String[] args) {
        int terms = 20;
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
