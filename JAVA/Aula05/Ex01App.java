package Aula05;

import java.util.Scanner;

public class Ex01App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);



        System.out.println("Digite a opção desejada \n 1: Aluno\n2:Professor");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("Digite seu nome: ");
                String nome = sc.nextLine();
                sc.nextLine();

                System.out.println("Digite sua idade: ");
                int idade = sc.nextInt();

                System.out.println("Digite sua matricula: ");
                int matricula = sc.nextInt();

                Ex01_A a1 = new Ex01_A( nome, idade, matricula);
                a1.Status();
                break;
            case 2:
                System.out.println("Digite seu nome: ");
                String nomep = sc.nextLine();
                sc.nextLine();

                System.out.println("Digite sua idade: ");
                int idadep = sc.nextInt();

                System.out.println("Digite o seu salario: ");
                double salario = sc.nextDouble();
                Ex01_P p1 = new Ex01_P(nomep, idadep, salario);

                p1.Status();

                break;

            default:
                break;
        }
    }
}
