import java.util.Scanner;


public class While {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int x;
        System.out.println("Digite um número: ");
        x = entrada.nextInt();

        while (x < 18) {
            System.out.println("Você não tem permissão para entrar. "); x++;
        }
    }
    
}
