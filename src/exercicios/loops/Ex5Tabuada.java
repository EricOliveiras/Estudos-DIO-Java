package src.exercicios.loops;

import java.util.Scanner;

public class Ex5Tabuada {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numero, resultado;

    System.out.println("Digite o valor da tabuáda:");
    numero =  scan.nextInt();

    System.out.println("Tabuáda de " + numero);

    for (int i = 1; i <= 10; i++) {
      resultado = numero * i;
      System.out.printf("%d X %d = %d\n", numero, i, resultado);
    }
  }
}
