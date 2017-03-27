import java.util.Scanner ;

/** classe "Principal" a qual contem o metodo (main) que torna a classe executavel */
public class Principal {
    
    public static void main (String[] args) {
        
        /** Scanner para colerar dados digitados pelo usuario */
        Scanner entrada = new Scanner (System.in) ;
        
        Prova av1 = new Prova () ;
        String disciplina ;
        String local ;
        String data ;
        String pergunta ;
        String tipoQuestao ;
        String continuar ;
        double peso ;
        
        
        /* obetencao dos dados para o Cabecalho da Prova (av1) */
        System.out.print ("Disciplina: ") ;
        disciplina = entrada.nextLine () ;
        
        System.out.print ("Local: ") ;
        local = entrada.nextLine () ;
        
        System.out.print ("Data: ") ;
        data = entrada.nextLine () ;
        
        System.out.print ("Peso: ") ;
        peso = Double.parseDouble (entrada.nextLine ()) ;
        
        
        /* monta o Cabecalho da Prova */
        av1.setCabecalho (disciplina, local, data, peso) ;
        
        do {
            
            /* usuario informara se deseja ou nao inserir novas questoes */
            System.out.print ("\n" + "Tipo da Questao (D-Discursiva | O-Objetiva): ") ;
            do {
                tipoQuestao = entrada.nextLine () ;
                // converte a entrada do usuario para "CAIXA ALTA", facilitando a validacao
                tipoQuestao = tipoQuestao.toUpperCase () ;

                if (tipoQuestao.equals ("D")) {
                    break ;
                } else if (tipoQuestao.equals ("O")) {
                    break ;
                } else {
                    System.out.print ("ERRO! Digite um caracter valido (D-Discursiva | O-Objetiva): ") ;
                }
            } while (true) ;

            switch (tipoQuestao) {
                case "D" : 
                    try {
                        String cC ;

                        System.out.print ("\n" + "DISCURSIVA" + "\n") ;
                        System.out.print ("  Pergunta: ") ;
                        pergunta = entrada.nextLine () ;

                        System.out.print ("  Criterios Correcao: ") ;
                        cC = entrada.nextLine () ;

                        System.out.print ("  Peso: ") ;
                        peso = Double.parseDouble (entrada.nextLine ()) ;

                        av1.setQuestaoDiscursiva (pergunta, cC, peso) ;

                    } catch (Exception e) {
                        System.out.print ("\n" + "ERRO! Nao foi possivel criar Questao Discursiva") ;   
                    }

                    break ;

                case "O" : 
                    try {
                        String[] opcoes = new String[5] ;
                        int rC ;

                        System.out.print ("\n" + "OBJETIVA" + "\n") ;
                        System.out.print ("  Pergunta: ") ;
                        pergunta = entrada.nextLine () ;

                        for (int i = 0 ; i < 5 ; i++) {
                            System.out.print ("  (" + (char)(97 + i) + "): " ) ;
                            opcoes[i] = entrada.nextLine () ;
                        }

                        System.out.print ("  Resposta Correta: ") ;
                        rC = Integer.parseInt (entrada.nextLine ()) ;

                        System.out.print ("  Peso: ") ;
                        peso = Double.parseDouble (entrada.nextLine ()) ;

                        av1.setQuestaoObjetiva (pergunta, opcoes, rC, peso) ;

                    } catch (Exception e) {
                        System.out.print ("\n" + "ERRO! Nao foi possivel criar Questao Objetiva") ;
                    }

                    break ;

                default : 
                    System.out.print ("\n" + "ERRO! Nao foi possivel criar Questao") ;
                    System.out.print ("\n" + "Finalizando programa") ;
            }
            
            System.out.print ("\n" + "Deseja adicionar outra Questao? (S-Sim | N-Nao): ") ;
            continuar = entrada.nextLine () ;
                // converte a entrada do usuario para "CAIXA ALTA", facilitando a validacao
                continuar = continuar.toUpperCase () ;
        } while (continuar.equals("S")) ;
        
        System.out.print ("\n\n" + "____________________ IMPRIMINDO A PROVA ____________________" + "\n\n") ;
                
        /* Imprime a Prova Completa */
        System.out.print (av1.imprimirProva ()) ;
    }
}