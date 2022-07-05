import java.util.Scanner;

public class Pernas {
    public static void main(String[] args) {
        System.out.print("Digite a quantidade de pernas do animal: ");
        Scanner teclado = new Scanner(System.in);
        int pernas = teclado.nextInt();
        String tipo;
        System.out.print("isto é um(a) ");
        switch (pernas){
            case 1:
            tipo = "Saci";
            break;
            case 2:
            tipo = "Bipede";
            break;
            case 4:
            tipo = "Quadrupede";
            break;
            case 6,8:
            tipo  ="Aranha";
            break;
            default:
            tipo = "ET";
        }
        System.out.println(tipo);
    }
}
