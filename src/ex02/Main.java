package ex02;

import java.util.Scanner;

/**
 * <h1> Fibonacci </h1>
 * 
 * <p> Programa que possui um método para verificar se um número, dado pelo usuário, pertence à série de Fibonacci. </p>
 *
 * <h4> Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
 */

public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print(">> Digite até qual número deseja verificar: ");
        int num = input.nextInt();

        boolean belongs = false; 

        System.out.println();

        for(int i = 0; ; i++) {

            int fib = Fibonacci.fibonacci(i);

            System.out.print(fib + " ");

            if(num == fib) {
                
                belongs = true;
            }

            if(fib > num) {
                break;
            }
        }

        String isFibonacci = (belongs) ? " pertence" : " não pertence";

        System.out.println("\n>> O número " + num + isFibonacci + " a série de Fibonacci.\n");

        input.close();
    }
}
