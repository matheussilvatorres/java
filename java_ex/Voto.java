import java.util.Scanner;

public class Voto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Em qual ano você nasceu? ");
        int nas = teclado.nextInt();
        int idade = 2022 - nas;
        if (idade < 16){
            System.out.println("Não vota!");
        } else{
            if ((idade >= 16 && idade < 18) || (idade > 70)){
                System.out.println("Voto opcional!");
            }else{
                System.out.println("Voto Obrigatório!");
            }
        }
    }
}
