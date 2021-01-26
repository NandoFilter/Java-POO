package aula02;

public class Garrafa {
    
    //Atividade Aula 02

    String marca, bebida, cor;
    int carga;
    boolean isOpen;

    void status(){
        System.out.println("Bebida: " + this.bebida);
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("Está aberta? " + this.isOpen);
    }

    void tampar(){
        this.isOpen = false;
    }

    void destampar(){
        this.isOpen = true;
    }

    void beber(){
        if(this.isOpen == true && carga > 0){
            System.out.println("Estou bebendo " + this.bebida);
        }else if(this.isOpen == false){
            System.out.println("[ERROR] A garrafa está FECHADA");
        }else if(this.carga == 0){
            System.out.println("[ERROR] A garrafa está VAZIA");
        }
    }

    void refill(){
        if(this.carga >= 0 && this.carga <= 100 && this.isOpen == true){
            this.carga = 100;
            System.out.println("Garrafa reabastecida");
        }else if(this.carga == 100 && this.isOpen == true){
            System.out.println("[ERROR] A garrafa está CHEIA");
        }else if(this.isOpen == false){
            System.out.println("[ERROR] A garrafa está FECHADA");
        }
    }
    
}
