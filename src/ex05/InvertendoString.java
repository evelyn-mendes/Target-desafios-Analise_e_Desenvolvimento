package ex05;

import java.util.Scanner;

public class InvertendoString {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite algo: ");
        String palavra = input.nextLine();

        String invertida = "";

        for(int i = palavra.length(); i >= 0; i--) {

            invertida += palavra.charAt(i);
        }

        System.out.println(">> A palavra: " + palavra);
        System.out.println(">> Invertida: " + invertida);

        input.close();
    }
}
