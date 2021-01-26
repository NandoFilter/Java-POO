package aula03;

public class Caneta03 {

    // Aula 03 - Visibilidade de Atributos e Métodos

    public String modelo, cor;
    private float ponta; // Disponível apenas Dentro da Classe
    protected int carga; // Disponível apenas pras heranças
    private boolean tampada;  
     
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("Está tampada? " + this.tampada);
    }

    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("[ERROR] A caneta está tampada");
        }else{
            System.out.println("Estou Rabiscando");
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
}