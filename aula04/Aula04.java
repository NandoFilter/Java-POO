package aula04;

public class Aula04{
    public static void main (String[] args){

        Caneta c1 = new Caneta("BIC", "Azul", 0.5f);

        c1.status();

        System.out.println("------------------");

        Caneta c2 = new Caneta("Faber Castell", "Preta", 1.5f);
        c2.status();

    }
}