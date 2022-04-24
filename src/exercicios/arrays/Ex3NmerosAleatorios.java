package src.exercicios.arrays;

import java.util.Random;

public class Ex3NmerosAleatorios {
  public static void main(String[] args) {
    Random random = new Random();

    int[] numerosAleatorios = new int[20];

    for (int i = 0; i < numerosAleatorios.length; i++) {
      int numero = random.nextInt(100);
      numerosAleatorios[i] = numero;
    }

    System.out.print("Números Alatórios: ");
    for (int numero : numerosAleatorios) {
      System.out.print(numero + " ");
    } 
    
  }
}
