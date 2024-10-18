package ex04;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * <h1> Faturamento </h1>
 * 
 * <p> Programa que calcula o total de faturamento mensal de uma distribuidora. E após calcula qual foi a porcentagem de representação de cada Estado nesse valor total. </p>
 * 
 * <h4> Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
*/

public class FaturamentoPorcent {
    
    public static void main(String[] args) {
        
        double sp = 67836.43;
        double rj = 36678.46;
        double mg = 29165.48;
        double es = 27165.48;
        double outros = 19849.53;

        double total = sp + rj + mg + es + outros;
        NumberFormat formato = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-BR"));

        String totalFormatado = formato.format(total);
        System.out.println(">> Total de faturamento mensal: " + totalFormatado);

        System.out.printf("\n>> O estado de São Paulo teve a participação de: %.2f%%\n", ((sp * 100) / total));

        System.out.printf(">> O estado do Rio de Janeiro teve a participação de: %.2f%%\n", ((rj * 100) / total));

        System.out.printf(">> O estado de Minas Gerais teve a participação de: %.2f%%\n", ((mg * 100) / total));

        System.out.printf(">> O estado do Espírito Santo teve a participação de: %.2f%%\n", ((es * 100) / total));

        System.out.printf(">> Os outros estados tiveram a participação de: %.2f%%\n\n", ((outros * 100) / total));
    }
}
