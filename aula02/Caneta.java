package aula02;

public class Caneta {
    
    // Aula 02 - Objetos
    
    String modeloCan, corCan;
    float pontaCan;
    int cargaCan;
    boolean tampadaCan;  
     
    public void status(){
        System.out.println("Modelo: " + this.modeloCan);
        System.out.println("Cor: " + this.corCan);
        System.out.println("Ponta: " + this.pontaCan);
        System.out.println("Carga: " + this.cargaCan + "%");
        System.out.println("Está tampada? " + this.tampadaCan);
    }

    void rabiscar(){
        if(this.tampadaCan == true){
            System.out.println("[ERROR] A caneta está tampada");
        }else{
            System.out.println("Estou Rabiscando");
        }
    }

    void tampar(){
        this.tampadaCan = true;
    }

    void destampar(){
        this.tampadaCan = false;
    }
}