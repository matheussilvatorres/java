import java.util.Scanner;

public class ProgramaIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Em qua ano você nasceu? ");
        int nasc = teclado.nextInt();
        int idade = 2022 - nasc;
        if (idade >= 18){
            System.out.println("Maior de Idade!");
        } else{
            System.out.println("Menor de idade!");
        }
    }
}
