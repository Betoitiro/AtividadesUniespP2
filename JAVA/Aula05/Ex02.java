package Aula05;

public class Ex02 {
    
    private String tipo;
    private double preco;
    private String nome;

    public Ex02(String tipo, double preco, String nome) {
        this.tipo = tipo;
        this.preco = preco;
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void Status(){
        System.out.printf(tipo +"\nPreço "  + preco + "\n" + nome +"\n");
    }
}
