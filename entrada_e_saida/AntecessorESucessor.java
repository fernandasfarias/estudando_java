import java.util.Scanner;

public class AntecessorESucessor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        int antecessor = numero-1;
        int sucessor = numero+1;

        System.out.printf("\nO antecessor de %d é %d e o sucessor é %d.\n", numero, antecessor, sucessor);

        sc.close();
    }

}