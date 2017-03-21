/** classe "Questao" */
public abstract class Questao {
    
    /** construtor para inicializar as String vazias e inteiros com 0 (zero)*/
    public Questao () {
        this.pergunta = "" ;
        this.peso = 0 ;
    }
    
    
    // --------------- ATRIBUTOS (privados) --------------- //
    /** eh a Pergunta da Questao */
    private String pergunta ;
    /** eh o Peso da Questao */
    private double peso ;
    /** metodo abstrato o qual retorna uma Questao (discursiva ou objetiva),
    implementadas em suas respectivas classes */
    public abstract String retornaQuestao () ;
    
    // -------------------- SETs -------------------- //
    /** atribui uma Perguntaunta para a Questao
     * @param pergunta Perguntaunta */
    public void setPergunta (String pergunta) {
        this.pergunta = pergunta ;
    }
    
    /** atribui o peso da Questao
     * @param peso Peso */
    public void setPeso (double peso) {
        this.peso = peso ;
    }
    
    
    // -------------------- GETs -------------------- //
    /** obter Pergunta da Questao
     * @return Pergunta */
    public String getPergunta () {
        return this.pergunta ;
    }
    
    /** obter o Peso da Questao
     * @return Peso */
    public double getPeso () {
        return this.peso ;
    }
}