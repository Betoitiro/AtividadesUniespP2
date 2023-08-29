package JAVA.Aula2.ex02;

import java.util.Scanner;

public class calculadora {
    
    Scanner sc = new Scanner(System.in);

    public void calc(){
        System.out.println("Digite a opção desejada:");
        System.out.println("1 somar \n 2 subtrair \n 3 multiplicar \n 4 dividir");
        int n = sc.nextInt();
        if(n ==1){
                System.out.println("Digite o primeiro numero: ");
                double n1 = sc.nextDouble();
        
                System.out.println("Digite o segundo numero: ");
                double n2 = sc.nextDouble();
        
                double somar = n1 + n2;
        
                System.out.printf("O resultado da soma é de: %s \n", somar);

        }else if(n ==2){
            System.out.println("Digite o primeiro numero: ");
            double n1 = sc.nextDouble();
        
            System.out.println("Digite o segundo numero: ");
            double n2 = sc.nextDouble();
        
            double subtrair = n1 - n2;  
        
            System.out.printf("O resultado da subtração é de %s \n", subtrair);

        }else if(n ==3){
            
            System.out.println("Digite o primeiro numero: ");
            double n1 = sc.nextDouble();
        
            System.out.println("Digite o segundo numero: ");
            double n2 = sc.nextDouble();
        
            double multiplicar = n1 * n2;
        
            System.out.printf("O resultado da multiplicação é de: %s \n", multiplicar);


        }else if(n ==4){
            
            System.out.println("Digite o primeiro numero: ");
            double n1 = sc.nextDouble();
        
            System.out.println("Digite o segundo numero: ");
            double n2 = sc.nextDouble();
        
            double dividir = n1 / n2;
        
            System.out.printf("O resultado da divisão é de: %s \n", dividir);

        }

    }   

}
