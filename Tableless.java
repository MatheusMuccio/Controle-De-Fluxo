import java.util.Scanner;

public class Tableless {

    public static void main(String[] args){

        int n1;
        int n2;
        
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        n1 = leitura.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = leitura.nextInt();

        System.out.println((n1 > n1 ? n1 + " é o maior número" : n2 + " é o maior número"));

    }
}
