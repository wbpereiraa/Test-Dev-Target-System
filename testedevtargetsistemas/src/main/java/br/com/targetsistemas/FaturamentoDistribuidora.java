package br.com.targetsistemas;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class FaturamentoDistribuidora {

    public static void main(String[] args) {
        
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            FaturamentoData[] dados = objectMapper.readValue(new File("testedevtargetsistemas/src/main/resources/dados.json"), FaturamentoData[].class);

            double menor = Double.MAX_VALUE;
            double maior = Double.MIN_VALUE;
            double soma = 0;
            int diasComFaturamento = 0;

            for (FaturamentoData dado : dados) {
                double valor = dado.getValor();
                if (valor > 0) {
                    soma += valor;
                    diasComFaturamento++;
                    if (valor < menor) menor = valor;
                    if (valor > maior) maior = valor;
                }
            }

            double media = soma / diasComFaturamento;
            int diasAcimaDaMedia = 0;

            for (FaturamentoData dado : dados) {
                if (dado.getValor() > media) diasAcimaDaMedia++;
            }

            System.out.println("Menor valor de faturamento: " + menor);
            System.out.println("Maior valor de faturamento: " + maior);
            System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class FaturamentoData {
    private int dia;
    private double valor;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
