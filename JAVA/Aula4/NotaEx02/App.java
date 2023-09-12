package Aula4.NotaEx02;

import java.util.Scanner;

public class App {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1: Diretor\n2:Gerente");
        String cargo = sc.nextLine();

        switch (cargo) {
            case 1:
                System.out.println("Nome: ");
                String nome = sc.nextLine();
                sc.nextLine();
                System.out.println("Salario: ");
                double salario = sc.nextDouble();
                System.out.println("Quantidade de ações: ");
                int acoes = sc.nextInt();

                Diretor d1 = new Diretor(nome, salario, acoes);
                d1.ExibiDados();
                break;
        
            default:
                break;
        }
    }
}
