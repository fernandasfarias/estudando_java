import java.util.Scanner;

public class Quadrante{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        while(true){
            int primeiroNum = input.nextInt();
            int segundoNum = input.nextInt();

            if (primeiroNum == 0 || segundoNum == 0){
                break;
            }
            else{
                if (primeiroNum > 0){
                    if (segundoNum > 0) System.out.println("primeiro");
                    else System.out.println("quarto");
                }
                else if (primeiroNum < 0){
                    if (segundoNum > 0) System.out.println("segundo");
                    else System.out.println("terceiro");
                }
            }
        }
    }
}