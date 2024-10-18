package ex03;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * <h1> Consulta Faturamento </h1>
 * 
 * <p> Programa que calcula o menor e o maior faturamento em um mês e também lista os dias em que o faturamento foi maior que a média mensal. </p>
 * 
 * <h4> Language: Java </h4>
 * 
 * @author Evelyn Mendes
 * @version 1.0
*/


public class ConsultaFaturamento {
    public static void main(String[] args) {
        try {

            double lowerRevenues = Double.MAX_VALUE;
            int dayLowerRevenues = 0;

            double highestTurnover = Double.MIN_VALUE;
            int dayHighestTurnover = 0;

            double sum = 0;
            double average;

            File dataJson = new File("src/ex03/dados.json");

            ObjectMapper objectMapper = new ObjectMapper();

            List<Dados> dados = objectMapper.readValue(dataJson,
                objectMapper.getTypeFactory().constructCollectionType(List.class, Dados.class));


            //Menor e Maior faturamento ocorrido em um dia do mês
            for(Dados faturamento : dados) {

                System.out.println(faturamento);

                double value = faturamento.getValor();

                if(lowerRevenues > value && value != 0) {
                    lowerRevenues = value;
                    dayLowerRevenues = faturamento.getDia();
                }

                if(highestTurnover < value && value != 0) {
                    highestTurnover = value;
                    dayHighestTurnover = faturamento.getDia();
                }

                sum += value;
            }

            average = sum / dados.size();

            StringBuilder diasFaturamentos = new StringBuilder();

            for(Dados dias : dados) {

                double value = dias.getValor();

                if(value > average) {

                    diasFaturamentos.append("\nDia:").append(dias.getDia())
                    .append("\nValor: ").append(value).append("\n");
                }

            }

            System.out.println("\n>> O menor faturamento ocorreu no dia " + dayLowerRevenues + " que foi: " + lowerRevenues); // Menor faturamento

            System.out.println(">> O maior faturamento ocorreu no dia " + dayHighestTurnover + " que foi: " + highestTurnover + "\n"); // Maior faturamento

            System.out.print(">> Dias com faturamento acima da média mensal:" );
            System.out.println(diasFaturamentos);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}