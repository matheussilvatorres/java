import java.util.Locale;

public class IdiomaSystem {
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.print("O idioma do sistema é: ");
        System.out.println(idioma.getDisplayLanguage()); /* imprime português */ 
    }
}
