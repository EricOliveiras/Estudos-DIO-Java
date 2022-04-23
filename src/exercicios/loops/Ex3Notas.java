package src.exercicios.loops;

import java.util.Scanner;

public class Ex3Notas {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numero;

    System.out.println("Nota: ");
    numero = scan.nextInt();
    
    while (numero <= 0 || numero > 10) {
      System.out.println("Nota inválida! Digite novamente: ");
      numero = scan.nextInt();
    }

    System.out.println("Programa finalizado!");

  }
}
