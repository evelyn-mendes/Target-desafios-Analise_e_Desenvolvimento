package ex02;

public class Fibonacci {
    
    public static int fibonacci (int num) {

        if(num == 0) {
            return 0;
        } else if(num == 1) {
            return 1;
        }

        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
