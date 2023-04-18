import java.util.Scanner;

class Main {
  //  Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius. C = 5 * ((F-32) / 9).

  public static void main(String[] args) {

    // declarando variaveis
    Scanner input = new Scanner(System.in);
    int convertF = 32;

    // pegar o valor em fahrenheit
    String textoUm = "Informe a tempetatura em graus Fahrenheit: ";
    System.out.print(textoUm);
    double tempF = input.nextDouble();

    // fazer o calculo de conversao de fahrenheit para celsius
    double tempC = ((tempF - convertF) * 5/9); 

    // mostrar o resultado da convesao
    System.out.println("A temperatura informada em celcius é: " + tempC + (" °C"));

    input.close();
  }
}





