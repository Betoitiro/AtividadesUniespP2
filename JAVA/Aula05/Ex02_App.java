package Aula05;

public class Ex02_App {
    public static void main(String[] args) {
        
        Ex02 p1 = new Ex02("camisa", 100.0, "Polo branca");
        Ex02 p2 = new Ex02("Calça", 50.0, "Calça azul");

        p1.Status();
        System.out.println();
        p2.Status();
    }
}
