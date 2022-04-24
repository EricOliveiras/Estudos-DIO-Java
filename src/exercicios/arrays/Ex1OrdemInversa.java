package src.exercicios.arrays;

public class Ex1OrdemInversa {
  public static void main(String[] args) {
    
    int[] numeros = {1, 2, 7, -10, -3, 32};

    for (int i = (numeros.length - 1); i >= 0 ; i--) {
      System.out.print(numeros[i] + " ");
    }
  }
}
