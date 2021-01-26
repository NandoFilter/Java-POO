package aula02;

public class Aula02{

    // Aula 02 - Objetos
    
    public static void main(String[] args){

        /*         
          (C)onfiável
          (O)portuno
          (M)anutenível
          (E)xtensível
          (R)eutilizável
          (N)atural
           a
           d
           a
        */

        Caneta c1 = new Caneta(); // Instanciamento | Objeto chamado c1 da Classe Caneta

        c1.modeloCan = "BIC Cristal";
        c1.corCan = "Azul";
        c1.pontaCan = 0.5f;
        c1.cargaCan = 90;

        c1.destampar();
        System.out.println("-------------");
        c1.status();
        System.out.println("-------------");
        c1.rabiscar();
        
        Garrafa g1 = new Garrafa();

        g1.bebida = "Água";
        g1.marca = "Voss";
        g1.cor = "Transparente";
        g1.carga = 50;
        g1.destampar();
        System.out.println("-------------");
        g1.refill();
        System.out.println("-------------");
        g1.status();        
    }
}