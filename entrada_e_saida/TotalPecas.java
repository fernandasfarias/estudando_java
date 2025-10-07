import java.util.Scanner;

public class TotalPecas{
    public static void main(String[] args){
        double porcentagemIPI, valorPeca1, valorPeca2;
        int codigoPeca1, quantPecas1, codigoPeca2, quantPecas2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a porcentagem do IPI: ");
        porcentagemIPI = sc.nextDouble();

        System.out.println("Digite o código da peça 1: ");
        codigoPeca1 = sc.nextInt();

        System.out.println("Digite o valor unitário da peça 1: ");
        valorPeca1 = sc.nextDouble();

        System.out.println("Digite a quantidade de peças 1: ");
        quantPecas1 = sc.nextInt();

        System.out.println("\nDigite o código da peça 2: ");
        codigoPeca2 = sc.nextInt();

        System.out.println("Digite o valor unitário da peça 2: ");
        valorPeca2 = sc.nextDouble();

        System.out.println("Digite a quantidade de peças 2: ");
        quantPecas2 = sc.nextInt();

        double totalValor = (valorPeca1 * quantPecas1 + valorPeca2 * quantPecas2) * (porcentagemIPI/100 + 1);

        System.out.printf("O valor total é igual: %.2f", totalValor);
        sc.close();
    }
}