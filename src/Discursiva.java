/** classe "Discursiva" herdada da classe "Questao"
 * e que compoe a classe "Prova" */
public class Discursiva extends Questao {
    
    /** construtor para inicializar as String vazias e inteiros com 0 (zero)*/
    public Discursiva () {
        this.criteriosCorrecao = ""  ;
    }
    
    
    // --------------- ATRIBUTOS (privados) --------------- //
    /** sao os Criterios de Correcao que serao avaliados para determinar
     * se a Questao esta correta ou nao */
    private String criteriosCorrecao  ;
    
    // -------------------- SETs -------------------- //
    /** atribui os Criterios de Correcao
     * @param criteriosCorrecao Criterios de Correcao */
    public void setCriteriosCorrecao (String criteriosCorrecao) {
        this.criteriosCorrecao = criteriosCorrecao ;
    }
    
    
    // -------------------- GETs -------------------- //
    /** obter os Criterios de Correcao da Questao Discursiva
     * @return Criterios de Correcao */
    public String getCriteriosCorrecao () {
        return this.criteriosCorrecao ;
    }
    
    
    /** retornar como ficou a Questao Discursiva
     * @return String concatenada com todas as informacoes*/
    public String retornaQuestao () {
        String questao = "" ;
        
        questao += "(" + this.getPeso () + ") " ;
        questao += this.getPergunta () + "\n" ;
        questao += "Criterios Correcao: " + this.getCriteriosCorrecao () + "\n" ;
        questao += "\n" ;
        
        return questao ;
    }
}