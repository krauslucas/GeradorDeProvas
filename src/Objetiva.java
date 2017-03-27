/** classe "Objetiva" herdada da classe "Questao" e que compoe a classe "Prova" */
public class Objetiva extends Questao {
    
    // ------------------------------ ATRIBUTOS ----------------------------- //
    /** sao as alternativas (a, b, c, d, e) da pergunta Objetiva */
    private String[] opcoes ;
    
    /** eh a Respota Correta dentra as alternativas disponiveis */
    private int respostaCorreta ;
    
    
    // ----------------------------- CONSTRUTOR ----------------------------- //
    public Objetiva () {
        for (int i = 0 ; i < 5 ; i++) {
            if (this.opcoes == null) {
                this.opcoes = new String[5] ;
            }
            this.opcoes[i] = "" ;
        }
        this.respostaCorreta = 0 ;
    }
	
	
	// -------------------------------- SETs -------------------------------- //
    /** atribui uma alternativa para uma Questao Objetiva
     * @param i indica a posicao no vetor de opcoes
     * @param opcao eh a String da opcao, indicada por "i" */
    public void setOpcoes (int i, String opcao) {
        this.opcoes[i] = opcao ;
    }
    
    /** atribui a Resposta Correta dentre as alternativas
     * @param respostaCorreta eh a Resposta Correta dentre as alternativas */
    public void setRespostaCorreta (int respostaCorreta) {
        this.respostaCorreta = respostaCorreta ;
    }
    
    
    // -------------------------------- GETs -------------------------------- //
    /** obter uma das opcoes da Questao Objetiva, indicada pelo indice "i"
     * @return opcao indica pelo indice "i" */
    public String getOpcoes () {
        String ops = "" ;
        for (int i = 0 ; i < 5 ; i++) {
            ops += this.opcoes[i] + "\n" ;
        }
        return ops ;
    }
    
    /** obter a Respota Correta dentre as alternativas
     * @return Resposta Correta */
    public int getRespostaCorreta () {
        return this.respostaCorreta ;
    }
    
    
    // --------------------------- OUTROS METODOS --------------------------- //
    /** retornar como ficou a Questao Objetiva
     * @return String concatenada com todas as informacoes da Questao Objetiva */
    public String retornaQuestao () {
        String questao = "" ;
        
        questao += "(" + this.getPeso() + ") " ;
        questao += this.getPergunta() + "\n" ;
        for (int i = 0 ; i < 5 ; i++)
            questao += "(" + (char)(97 + i) + ") " + this.opcoes[i] + "\n" ;
        questao += "\n" ;
        
        return questao ;
    }
}