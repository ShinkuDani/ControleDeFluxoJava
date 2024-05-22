import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o Primeiro numero ");
        int numero1 = scanner.nextInt();
        System.out.println("Escreva o Segundo numero ");
        int numero2 = scanner.nextInt();
        
        try {

            contarNumeros(numero1, numero2);

            
        } catch (ParametrosInvalidosException e) {

            System.out.println("\n O segundo Numero deve ser maior que o primeiro");
        }
    }

    public static void contarNumeros (int numero1, int numero2) throws ParametrosInvalidosException{
        
        int contador =  numero2 - numero1;

        if(numero1 > numero2){

            throw new ParametrosInvalidosException();

        } else {

            for(int x = 0; x <= contador; x++){

                System.out.println("\n Imprimindo o numero: " + x );
            }

            System.out.println("\n 12Fim da Impressão dos Numeros.");
        }

    }
}
