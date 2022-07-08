package aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("uma caneta " + this.cor);
        System.out.println("Está tampada?  " + this.tampada);
    }

    void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro não posso rabiscar!");
        }
        else{
            System.out.println("O que deseja desenhar?");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }
}
