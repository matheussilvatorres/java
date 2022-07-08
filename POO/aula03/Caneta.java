package aula03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    public void status(){
        System.out.println("uma caneta " + this.cor);
        System.out.println("Está tampada?  " + this.tampada);
    }

    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro não posso rabiscar!");
        }
        else{
            System.out.println("O que deseja desenhar?");
        }
    }

    protected void tampar(){
        this.tampada = true;
    }

    protected void destampar(){
        this.tampada = false;
    }
}
