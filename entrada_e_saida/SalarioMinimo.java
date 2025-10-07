import java.util.Scanner;

public class SalarioMinimo{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor atual do salário mínimo: ");
        double valorMinimo = sc.nextDouble();

        System.out.println("\nDigite o seu salário atual: ");
        double salario = sc.nextDouble();

        int quant = (int)salario / (int)valorMinimo;

        System.out.printf("\nVocê recebe %d salário(s) mínimo(s)", quant);

        sc.close();
    }
}