package aula05;

import java.util.Scanner;

public class ContaBanco {
    
        
    public int numConta;
    protected String tipo;
    private String nome;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta(){
        return this.numConta;
    }

    public void setNumConta(int conta){
        numConta = conta;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String type){
        tipo = type;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String n){
        nome = n;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setSaldo(float s){
        saldo = s;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(boolean st){
        status = st;
    }

    public void abrirConta(String t){
        setTipo(t);
        setStatus(true); 
        System.out.println("Conta criada");

        if(t.equals("CC")){
            this.setSaldo(50);
        }else if(t.equals("CP")){
            this.setSaldo(150);
        }
    }

    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        }else if(this.getSaldo() < 0){
            System.out.println("Conta com saldo negativo");
        }else{
            this.setStatus(false);
        }
    }

    public void depositar(float money){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + money);
            System.out.println("Depósito realizado na conta de " + this.getNome());
        }else{
            System.out.println("Impossível depositar em uma conta fechada");
        }
    }

    public void sacar(float money){
        if(this.getStatus()){
            if(this.getSaldo() >= money){
                this.setSaldo(this.getSaldo() - money);
                System.out.println("Saque realizado na conta de " + this.getNome());
            }else{
                System.out.println("Saldo insuficiente para saque");
            }
        }else{
            System.out.println("Impossível sacar");
        }
    }

    public void pagarMensal(){
        float valor = 0;

        if(this.getTipo().equals("CC")){
            valor = 12;
        }else if(this.getTipo().equals("CP")){
            valor = 20;
        }

        if(this.getStatus()){
            if(this.getSaldo() > valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Mensalidade paga com sucesso por " + this.getNome());
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossível pagar");
        }
    }

    
}
