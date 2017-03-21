import java.util.Scanner ;

/** classe "Principal" a qual contem o metodo (main) que torna a classe executavel */
public class Principal {
    
    public static void main (String[] args) {
        
        /** Scanner para colerar dados digitados pelo usuario */
        Scanner entradaM = new Scanner (System.in) ;
        
        Prova av1 = new Prova () ;
        String disciplina ;
        String local ;
        String data ;
        String pergunta ;
        double peso ;
        
        
        /* obetencao dos dados para o Cabecalho da Prova (av1) */
        System.out.print ("Disciplina: ") ;
        disciplina = entradaM.nextLine () ;
        
        System.out.print ("Local: ") ;
        local = entradaM.nextLine () ;
        
        System.out.print ("Data: ") ;
        data = entradaM.nextLine () ;
        
        System.out.print ("Peso: ") ;
        peso = Double.parseDouble (entradaM.nextLine ()) ;
        
        
        /* monta o Cabecalho da Prova */
        av1.setCabecalho (disciplina, local, data, peso) ;
        
        
        /* quantas Questoes Discursivas terao na Prova */
        System.out.print ("\n" + "Qtd Discursiva: ") ;
        av1.setNDiscursivas (Integer.parseInt (entradaM.nextLine ())) ;
        
        /* coleta os dados sobre as Questoes Discursivas */
        for (int i = 0 ; i < av1.getNDiscursivas () ; i++) {
            String cC ;
            
            System.out.print ("Discursiva (" + (i + 1) + ")" + "\n") ;
            System.out.print ("  Pergunta: ") ;
            pergunta = entradaM.nextLine () ;
            
            System.out.print ("  Criterios Correcao: ") ;
            cC = entradaM.nextLine () ;
            
            System.out.print ("  Peso: ") ;
            peso = Double.parseDouble (entradaM.nextLine ()) ;
            
            av1.setQuestaoDiscursiva (i, pergunta, cC, peso) ;
            
            System.out.print ("\n") ;
        }
        
        
        /* quantas Questoes Objetivas terao na prova */
        System.out.print ("\n" + "Qtd Objetivas: ") ;
        av1.setNObjetivas (Integer.parseInt (entradaM.nextLine ())) ;
        
        /* coleta os dados sobre as Questoes Discursivas */
        for (int i = 0 ; i < av1.getNObjetivas () ; i++) {
            String[] opcoes = new String[5] ;
            int oC ;
            
            System.out.print ("Objetiva (" + (i + 1) + ")" + "\n") ;
            System.out.print ("  Pergunta: ") ;
            pergunta = entradaM.nextLine () ;
            
            for (int j = 0 ; j < 5 ; j++) {
                System.out.print ("  (" + (char)(97 + j) + "): " ) ;
                opcoes[j] = entradaM.nextLine () ;
            }
            
            System.out.print ("  Resposta Correta: ") ;
            oC = Integer.parseInt (entradaM.nextLine ()) ;
            
            System.out.print ("  Peso: ") ;
            peso = Double.parseDouble (entradaM.nextLine ()) ;
            
            av1.setQuestaoObjetiva (i, pergunta, oC, peso) ;
            for (int j = 0 ; j < 5 ; j++)
                av1.setQuestaoObjetiva (i, j, opcoes[j]) ;
            
            System.out.print ("\n") ;
        }
        
        System.out.print ("\n" + "_______________ IMPRIMINDO A PROVA _______________" + "\n\n") ;
                
        /* Imprime a Prova Completa */
        System.out.print (av1.imprimirProva ()) ;
    }
}