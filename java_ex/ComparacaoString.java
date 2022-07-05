public class ComparacaoString {
    public static void main(String[] args) {
        String nome1 = "Matheus";
        String nome2 = "Matheus";
        String nome3 = new String("Matheus");
        String res; 
        String res1;
        /*Como objeto é diferente a construção */
        res = (nome1 == nome3)?"Igual":"Diferente";
        /*O conteúdo é o mesmo */
        res1 = (nome1.equals(nome3))?"Igual":"Diferente";
        System.out.println(res);
        System.out.println(res1);
    }
}
