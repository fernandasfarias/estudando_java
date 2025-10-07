public class Media{
    public static void main(String[] args){
        double primeiraMedia = (8+9+7)/3;
        double segundaMedia = (4+5+6)/3;

        System.out.printf("Primeira média com os valores 8, 9 e 7: %.2f", primeiraMedia);
        System.out.printf("\nSegunda média com os valores 4, 5 e 6: %.2f", segundaMedia);

        double somaMedias = primeiraMedia + segundaMedia;
        System.out.printf("\nA soma das duas médias é igual a: %.2f", somaMedias);

        double mediaMedias = somaMedias/2;
        System.out.printf("\nA média das médias é igual a: %.2f\n", mediaMedias);
    }
}