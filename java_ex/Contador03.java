public class Contador03 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10){
            i ++;

            if (i == 2 || i == 3 || i ==4){
                continue;
            }
            if(i == 7){
                break;
            }
            System.out.println(i  +"° Número adicionado!");
        }
    }
}
