import java.util.Scanner;

public class IdadeEmDias{
    public static void main(String[] args){
        int anos, meses, dias, totalDias;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de anos: ");
        anos = sc.nextInt();

        System.out.println("\nDigite a quantidade de meses: ");
        meses = sc.nextInt();
        
        System.out.println("\nDigite a quantidade de dias: ");
        dias = sc.nextInt();

        totalDias = (anos*365) + (meses*30) + dias;

        System.out.println("\nO total de dias é igual a: " + totalDias);

        sc.close();
    }
}