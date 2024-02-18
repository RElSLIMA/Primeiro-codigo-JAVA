import java.util.Scanner;

public class PrimeiroCodigoJava {
  public static void main(String[] args) {

    String nome, operador;
    int valor1, valor2, resultado = 0;
    
    System.out.println("Informe seu nome: ");
    Scanner entrada1 = new Scanner(System.in);
    nome = entrada1.nextLine();

    System.out.println("Informe o primeiro valor: ");
    Scanner entrada2 = new Scanner(System.in);
    while (true) {
        if (entrada2.hasNextInt()) {
            valor1 = entrada2.nextInt();
            break; 
        } else {
            System.out.println("Valor inválido. Por favor, informe um número inteiro.");
            entrada2.next(); 
        }
    }
    
    System.out.println("Informe o operador: ");
    Scanner entrada3 = new Scanner(System.in);
    while (true) {
        operador = entrada3.next();
        if (operador.equals("+") || operador.equals("-") || operador.equals("*") || operador.equals("/")) {
            break;
        } else {
            System.out.println("Operador inválido. Informe um dos operadores permitidos (+, -, *, /): ");
        }
    }
     
    System.out.println("Informe o segundo valor: ");
    Scanner entrada4 = new Scanner(System.in);
    while (true) {
        if (entrada4.hasNextInt()) {
            valor2 = entrada4.nextInt();
            break; 
        } else {
            System.out.println("Valor inválido. Por favor, informe um número inteiro.");
            entrada4.next(); 
        }
    }
    
    if (operador.equals("+")){
      resultado = valor1 + valor2;
    }
    if (operador.equals("-")){
      resultado = valor1 - valor2;
    }
    if (operador.equals("*")){
      resultado = valor1 * valor2;
    }
    if (operador.equals("/")){
      resultado = valor1 / valor2;
    }
    
    System.out.println("Seja bem-vindo " + nome +"! O reultado da sua operação é: " + resultado);
    
  }
}