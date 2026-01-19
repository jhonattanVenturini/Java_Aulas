package aula01;
import java.util.Scanner;
public class Test {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("digite sua idade: ");
     int idade = sc.nextInt();
     System.out.printf("sua idade é: %s ", idade);
     sc.close();
    }
  
}


