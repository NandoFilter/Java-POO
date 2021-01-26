package aula04;

public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta(String m, String c, float p){ // Este é o método Construtor
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.tampar();
    }

    public String getModelo(){ // Getters recebem Valores
        return this.modelo;
    } 

    public void setModelo(String m){ // Setters modificam Valores
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
