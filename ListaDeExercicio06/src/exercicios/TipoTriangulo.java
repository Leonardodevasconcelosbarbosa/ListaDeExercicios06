package exercicios;

import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado 1: ");
        int lado1 = sc.nextInt();

        System.out.print("Digite o lado 2: ");
        int lado2 = sc.nextInt();

        System.out.print("Digite o lado 3: ");
        int lado3 = sc.nextInt();

       
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0 || 
            (lado1 + lado2 <= lado3) || (lado1 + lado3 <= lado2) || (lado2 + lado3 <= lado1)) {
            System.out.println("Os valores informados não formam um triângulo válido.");
            return;
        }

        int tipo = 0;

        if (lado1 == lado2 && lado2 == lado3) {
            tipo = 1;
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            tipo = 2;
        } else {
            tipo = 3;
        }

        switch (tipo) {
            case 1:
                System.out.println("Triângulo Equilátero");
                break;
            case 2:
                System.out.println("Triângulo Isósceles");
                break;
            case 3:
                System.out.println("Triângulo Escaleno");
                break;
                
        }
        sc.close();
    }
  
}