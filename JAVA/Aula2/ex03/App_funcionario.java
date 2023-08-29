package JAVA.Aula2.ex03;

public class App_funcionario {
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario(4567, "Humberto itiró", 1500);
        f1.Status();
        f1.Calcular_INSS();
        f1.Status();
    }
}
