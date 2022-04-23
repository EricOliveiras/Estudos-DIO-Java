package src.exercicios.loops;

import java.util.Scanner;

public class Ex4ParOuImpar {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int quantidadeDeNumeros, numero;
    int quantidadePares = 0, quantidadeImpares = 0;

    System.out.println("Digite a quantidade de números:");
    quantidadeDeNumeros = scan.nextInt();
    
    for (int i = 0; i < quantidadeDeNumeros; i++) {
      System.out.println("Número:");
      numero = scan.nextInt();

      if (numero % 2 == 0) {
        quantidadePares++;
      } else {
        quantidadeImpares++;
      }
    }

    System.out.println("Total de números pares: " + quantidadePares);
    System.out.println("Total de números impares: " + quantidadeImpares);
  }
}
