import java.util.Scanner;

public class Saldo {
    public static void main(String[] args){
        double valor;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do saldo a sofrer o reajuste: ");
        valor = sc.nextDouble();

        double valorReajustado = valor * 1.01;

        System.out.printf("\nO valor com reajuste ficou igual a: %.2f\n", valorReajustado);

        sc.close();
    }
}