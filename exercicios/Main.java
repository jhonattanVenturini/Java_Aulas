package exercicios;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println();
    System.out.println("-------------------------------");
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o seu nome: ");
    String name = sc.nextLine();
    System.out.println("Olá, " + name + "!");
    System.out.println("-------------------------------");
    sc.close();
  }
}
