package projeto;

import java.util.Scanner;

public class Funcionario {

    public String nome;
    public String funcao;
    public double salario;
    private int matricula;
    private double INSS;

    Scanner sc = new Scanner(System.in);

    public Funcionario(final String nome, final double salario, final String funcao) {
        this.nome = nome;
        this.salario = salario;
        this.funcao = funcao;
    }

    public void escolherFuncao() {
        System.out.println("1: Gerente");
        System.out.println("2: Caixa");
        System.out.println("3: Atendente");
        System.out.println("Informe a função do funcionário: ");
        final String fc = sc.nextLine();

        switch (fc) {
            case "1":
                this.salario = 1750;
                this.INSS = 20;
                final double SAlarioGerente = this.salario - (this.salario * this.INSS) / 100;
                System.out.println("Novo salário: " + SAlarioGerente);
                break;
            case "2":
                this.salario = 1500;
                this.INSS = 15;
                final double SalarioCaixa = this.salario - (this.salario - this.INSS) / 100;
                System.out.println("O salario final do Caixa é de R$" + SalarioCaixa);
                break;
            
            case "3":
            this.salario = 1350;
            this.INSS = 10;
            final double Salarioatendente = this.salario - (this.salario - this.INSS) / 100;
            System.out.println("O salario final do Caixa é de R$" + Salarioatendente);
            break;

            default:
                break;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(final String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(final double salario) {
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(final int matricula) {
        this.matricula = matricula;
    }

    public double getINSS() {
        return INSS;
    }

    public void setINSS(final double INSS) {
        this.INSS = INSS;
    }
}
