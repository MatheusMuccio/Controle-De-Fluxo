import java.util.Scanner;

public class Switch {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int valor;

        System.out.println("Digite um valor: ");
        valor = entrada.nextInt();
        
        switch (valor) {
            case 1:
                System.out.println("Valor = 1");
                break;
            case 2:
                System.out.println("Valor = 2");
                break;
            case 3:
                System.out.println("Valor = 3");
                break;
            default:
                System.out.println("Valor inválido");
        }
    }
    
}
