package exercicios;

import java.util.Scanner;

public class CategoriaIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

       
        int categoria = 0;

        if (idade >= 0 && idade <= 12) {
            categoria = 1; 
        } else if (idade >= 13 && idade <= 17) {
            categoria = 2; 
        } else if (idade >= 18 && idade <= 59) {
            categoria = 3; 
        } else if (idade >= 60) {
            categoria = 4; 
        } else {
            categoria = 0; 
        }

        switch (categoria) {
            case 1:
                System.out.println("Categoria: Criança");
                break;
            case 2:
                System.out.println("Categoria: Adolescente");
                break;
            case 3:
                System.out.println("Categoria: Adulto");
                break;
            case 4:
                System.out.println("Categoria: Idoso");
                break;
            default:
                System.out.println("Idade inválida.");
        }
        sc.close();
    }
}