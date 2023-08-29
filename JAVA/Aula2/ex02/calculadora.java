package JAVA.Aula2.ex02;

import java.util.Scanner;

public class calculadora {
    
    Scanner sc = new Scanner(System.in);

    public void Somar(){
        System.out.println("Digite o primeiro numero: ");
        double n1 = sc.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double n2 = sc.nextDouble();

        double somar = n1 + n2;

        System.out.printf("O resultado da soma é de: %s \n", somar);
    }

    public void subtrair(){
        System.out.println("Digite o primeiro numero: ");
        double n1 = sc.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double n2 = sc.nextDouble();

        double subtrair = n1 - n2;  

        System.out.printf("O resultado da subtração é de %s \n", subtrair);

    }

    public void multiplicar(){
        System.out.println("Digite o primeiro numero: ");
        double n1 = sc.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double n2 = sc.nextDouble();

        double multiplicar = n1 * n2;

        System.out.printf("O resultado da multiplicação é de: %s \n", multiplicar);
    }

    public void dividir(){
        System.out.println("Digite o primeiro numero: ");
        double n1 = sc.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double n2 = sc.nextDouble();

        double dividir = n1 / n2;

        System.out.printf("O resultado da divisão é de: %s \n", dividir);
    }

}
