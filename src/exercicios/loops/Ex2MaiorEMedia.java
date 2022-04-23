package src.exercicios.loops;

import java.util.Scanner;

public class Ex2MaiorEMedia {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double nota;
    double soma = 0;
    double maior = 0;
    int contador = 0;

    do {
      System.out.println("Digite a nota:");
      nota = scan.nextDouble();

      if (nota > maior) maior = nota;

      soma = soma + nota;

      contador++;
      
      System.out.println("Maior: " + maior);
      System.out.println("Soma: " + soma);
    } while (contador < 5);

    System.out.println("Média: " + soma / 5);
  }
}
