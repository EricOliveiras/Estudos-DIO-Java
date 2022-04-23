package src.exercicios.loops;

import java.util.Scanner;

public class Ex1NomeIdade {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String nome;
    int idade;

    while (true) {
      System.out.println("Digite seu nome:");
      nome = scan.next();

      if(nome.equals("0")) break;

      System.out.println("Digite sua idade:");
      idade = scan.nextInt();
    }

    System.out.println("Programa Parado!");

  }
}
