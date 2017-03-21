/** classe "Objetiva" herdada da classe "Questao"
 * e que compoe a classe "Prova" */
public class Objetiva extends Questao {
    
    /** construtor para inicializar as String vazias e inteiros com 0 (zero)*/
    public Objetiva () {
        for (int i = 0 ; i < 5 ; i++) {
            if (this.opcoes == null) {
                this.opcoes = new String[5] ;
            }
            this.opcoes[i] = "" ;
        }
        this.opcaoCorreta = 0 ;
    }
    
    
    // --------------- ATRIBUTOS (privados) --------------- //
    /** sao as alternativas (a, b, c, d, e) da pergunta objetiva */
    private String[] opcoes ;
    /** eh a Opcao Correta dentra as alternativas disponiveis */
    private int opcaoCorreta ;
    
    // -------------------- SETs -------------------- //
    /** atribui uma Opcao a questao objetiva
     * @param i indica a posicao no vetor de opcoes
     * @param opcao eh a String da opcao, indicada por "i" */
    public void setOpcoes (int i, String opcao) {
        this.opcoes[i] = opcao ;
    }
    
    /** atribui a Opcao Certa dentre as alternativas
     * @param opcaoCorreta eh a Opcao Correta dentre as alternativas */
    public void setOpcaoCorreta (int opcaoCorreta) {
        this.opcaoCorreta = opcaoCorreta ;
    }
    
    
    // -------------------- GETs -------------------- //
    /** obter uma das opcoes da questao Objetiva, indicada pelo indice "i"
     * @return opcao indica pelo indice "i" */
    public String getOpcoes () {
        String ops = "" ;
        for (int i = 0 ; i < 5 ; i++) {
            ops += this.opcoes[i] + "\n" ;
        }
        return ops ;
    }
    
    /** obter a Opcao Certa dentre as alternativas
     * @return Opcao Certa */
    public int getOpcaoCorreta () {
        return this.opcaoCorreta ;
    }
    
    
    /** retornar como ficou a Questao Objetiva
     * @return String concatenada com todas as informacoes*/
    public String retornaQuestao () {
        String questao = "" ;
        
        questao += "(" + this.getPeso () + ") " ;
        questao += this.getPergunta () + "\n" ;
        for (int i = 0 ; i < 5 ; i++)
            questao += "(" + (char)(97 + i) + ") " + this.opcoes[i] + "\n" ;
        questao += "\n" ;
        
        return questao ;
    }
}