import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n1, n2, soma =0;
        System.out.println("Digite o numero 1: ");
        n1 = leitor.nextInt();
        System.out.println("Digite o numero 2: ");
        n2 = leitor.nextInt();
        while(n1 <= n2){
            soma = soma+n1;
            n1++;

        }
        System.out.println("A soma dos numeros é " +soma);
    }
}
