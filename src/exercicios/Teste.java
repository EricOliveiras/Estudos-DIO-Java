package src.exercicios;
import java.util.Scanner;

public class  Teste {
	
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int cont = 0;
    int soma = 0;
    //complete o codigo
    while (  true    ) {
        int n = leitor.nextInt();
        if (  n < 0  ) { 
          break;
        } else {
          cont++;
          soma+=n;
        }
    }
    double media = soma /(double)cont;
    System.out.println(String.format("%.2f", media));
  }
}
  