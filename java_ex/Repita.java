import javax.swing.JOptionPane;

public class Repita {
    public static void main(String[] args) {
        int n, s= 0;
        int c = 0;
        int p = 0;
        int i = 0; 
        int acima = 0;
    do{
        c++;
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html> Informe um número <br> <em> [valor 0 interrompe]</em></html>"));
        s += n;
        if (n % 2 == 0){
            p++;
        } else {
            i++;
        }
        if (n > 100){
            acima++;
        }
    } while (n!= 0);
    JOptionPane.showInputDialog(null, "<html> Resultado Final <br> <hr> Somatório vale" + s + "<br> Total de valores: "+ c + "<br> Total de Pares: " + p + "<br> Total de Imoares: " + i + "<br> Acima de 100: " + acima +  "</html>");
    }

}
