package exercicios;

// programação  orientada a objetos usando classes e instancias 
public class Exercicio01 {
//as intancias que recebem isso 
  public static void main(String[] args) {
    var male = new Person();
    male.setName("John");
    male.setAge(12);

    System.out.println("Name: " + male.getName());
    System.out.println("Age: " +  male.getAge());
  }

}
