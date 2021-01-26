package aula03;

public class Aula03 {

    // Aula 03 - Visibilidade de Atributos e Métodos

    public static void main(String[] args){

        Caneta03 c1 = new Caneta03();
        c1.modelo = "BIC Cristal";
        c1.cor = "Preta";
        // c1.ponta = 0.5f;
        c1.carga = 80;
        // c1.tampada = false;
        c1.destampar(); // Método público que altera o valor de um atributo Privado
        c1.status();

    }
}
