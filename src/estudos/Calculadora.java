package src.estudos;

import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int a, b;

    System.out.println("Digite o primeiro valor: ");
    a = scan.nextInt();
    System.out.println("Digite o segundo valor: ");
    b = scan.nextInt();

    int soma = soma(a, b);
    int sub = sub(a, b);
    int multi = mult(a, b);
    int div = div(a, b);

    System.out.println("soma = " + soma);
    System.out.println("subtração = " + sub);
    System.out.println("multiplicação = " + multi);
    System.out.println("divisão = " + div);
  }

  public static int soma(int a, int b) {
    return a + b;
  }

  public static int sub(int a, int b) {
    return a - b;
  }

  public static int mult(int a, int b) {
    return a * b;
  }

  public static int div(int a, int b) {
    return a / b;
  }

}
