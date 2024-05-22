package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "GABRIEL", "MITINAGA"};
        for( String candidato: candidatos ){
            entrandoEmContato(candidato);
        }
        
        //selecaoCandidatos();
        //imprimirSelecionados();
        /**
         * analisarCandidato(1090.0);
        analisarCandidato(2000.0);
        analisarCandidato(4000.0);
         * 
         */
        

    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {

            atendeu = atender();

            continuarTentando = !atendeu;

            if(continuarTentando){

                tentativasRealizadas++;

            } else{

                System.out.println("Contato Realizado como Sucesso");

            }


        } while (continuarTentando && tentativasRealizadas < 3);

        if(atendeu){

            System.out.println("Conseguimos contato com " + candidato + " NA " + tentativasRealizadas + " Vez.");

        }else {
            System.out.println("Não conseguimos contato com " + candidato + ", Numero Máximo de tentativas: " + tentativasRealizadas + " Realizadas");
        }

    }

    //Metodo atender
    static boolean atender(){
        return new Random().nextInt(3)== 1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MACIA", "JULIA", "PAULO", "GABRIEL", "MITINAGA"};
        
        System.out.println("Imprimindo lista de candidatos, informando o indice de seu elemento");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº " + (indice + 1) + " é o " + candidatos[indice]);
        }

        System.out.println("Candidatos de Forma Abreviada: \n");

        for(String candidato : candidatos){
            System.out.println("O cadidato selecionado foi: " + candidato);
        }


    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MACIA", "JULIA", "PAULO", "GABRIEL", "MITINAGA", "LETICIA", "REBECA", "DERICK", "CAIO", "BEATRIZ", "RAQUEL", "ANTONIO", "KAIQUE", "BRIAN", "EDUARDO", "DANIELA", "SALLY"};
        
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length ) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou o salario: " + salarioPretendido);
            
            if( salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi Selecionado para a vaga ! \n");
                candidatosSelecionados++;

            }
            candidatoAtual++;
        
        }
        System.out.println("5 Candidatos foram Selecionados.");
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.00;

        if(salarioBase > salarioPretendido){

            System.out.println("Ligar para o Candidato \n");

        } else if(salarioBase == salarioPretendido){

            System.out.println("Ligar para o Candidato com contra Proposta \n");


        } else {
            System.out.println("Aguardar o Resultado dos Demais Candidatos \n");
        }
    }
}
