package ex05;

import java.util.Scanner;

/**
 * <h1> Invertendo uma String </h1>
 * 
 * <p> Programa que recebe um valor do tipo String, e o inverte. </p>
 * 
 * <h4> Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
*/

public class InvertendoString {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite algo: ");
        String palavra = input.nextLine();

        String invertida = "";

        for(int i = palavra.length() - 1; i >= 0; i--) {

            invertida += palavra.charAt(i);
        }

        System.out.println(">> A palavra: " + palavra);
        System.out.println(">> Invertida: " + invertida);

        input.close();
    }
}
