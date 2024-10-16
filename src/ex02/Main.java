package ex02;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print(">> Digite o até qual digíto da séria de Fibonacci deseja ir: ");
        int num = input.nextInt();

        System.out.println();

        System.out.print(">> 0 ");
        for(int i = 0; i < num; i++) {
            System.out.print(Fibonacci.fibonacci(i) + " ");
        }

        System.out.println("\n");
        input.close();
    }
}
