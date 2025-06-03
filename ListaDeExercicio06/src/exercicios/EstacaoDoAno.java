package exercicios;

import java.util.Scanner;

public class EstacaoDoAno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 4 para escolher a estação do ano:\n" +
                         "1 - Primavera" +
                         "2 - Verão" +
                         "3 - Outono" +
                         "4 - Inverno" +
                         "Escolha: ");
        int estacao = sc.nextInt();

        switch (estacao) {
            case 1:
                System.out.println("Estação: Primavera");
                break;
            case 2:
                System.out.println("Estação: Verão");
                break;
            case 3:
                System.out.println("Estação: Outono");
                break;
            case 4:
                System.out.println("Estação: Inverno");
                break;
            default:
                System.out.println("Número inválido! Digite um número entre 1 e 4.");
        }
        sc.close();
    }
}