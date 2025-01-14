package br.com.targetsistemas;

public class FaturamentoMensal {

    public static void main(String[] args) {
        double SP = 67836.43, RJ = 36678.66, MG = 29229.88, ES = 27165.48, Outros = 19849.53;
        double total = SP + RJ + MG + ES + Outros;

        System.out.printf("Percentual de SP: %.2f%%\n", (SP / total) * 100);
        System.out.printf("Percentual de RJ: %.2f%%\n", (RJ / total) * 100);
        System.out.printf("Percentual de MG: %.2f%%\n", (MG / total) * 100);
        System.out.printf("Percentual de ES: %.2f%%\n", (ES / total) * 100);
        System.out.printf("Percentual de Outros: %.2f%%\n", (Outros / total) * 100);
    }
}
