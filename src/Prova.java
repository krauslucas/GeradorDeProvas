/** classe "Prova" */
public class Prova {
    
    /** construtor para inicializar as String vazias e numeros zerados */
    public Prova () {
        this.data = ""  ;
        this.disciplina = "" ;
        this.local = "" ;
        this.nDiscursivas = 0 ;
        this.nObjetivas = 0 ;
        this.peso = 0 ;
    }
    
    
    // ------------------------------ ATRIBUTOS ----------------------------- //
    /** eh a Disciplina da Prova */
    private String disciplina ;
    /** eh o Local que sera realizada a Prova */
    private String local ;
    /** eh a Data de quando sera realizada a Prova */
    private String data ;
    /** eh o Peso da Prova */
    private double peso ;
    /** eh o Numero de Questoes Discursivas */
    private int nDiscursivas ;
    /** eh o Numero de Questoes Objetivas */
    private int nObjetivas ;
    /** sao as Questoes Discursivas */
    private Discursiva[] qDiscursivas ;
    /** sao as Questoes Objetivas */
    private Objetiva[] qObjetivas ;
    
    
    // -------------------------------- SETs -------------------------------- //
    /** @param disciplina Disciplina */
    public void setDisciplina (String disciplina) {
        this.disciplina = disciplina ;
    }
    
    /** @param local Local */
    public void setLocal (String local) {
        this.local = local ; 
    }
    
    /** @param data Data */
    public void setData (String data) {
        this.data = data ;
    }
    
    /** @param peso Peso da Prova */
    public void setPeso (double peso) {
        this.peso = peso ;
    }
    
    /** @param nDiscursivas Numero de Questos Discursivas */
    public void setNDiscursivas (int nDiscursivas) {
        this.nDiscursivas = nDiscursivas  ;
    }
    
    /** @param nObjetivas Numero de Questoes Objetivas */
    public void setNObjetivas (int nObjetivas) {
        this.nObjetivas = nObjetivas ;
    }
    
    /** cria uma Questao Discursiva
     * @param i     indice do vetor de Questoes Discursivas
     * @param perg  Perguntaunta da Questao Discursiva indicada por "i"
     * @param cC    Criterios de Correcao da Questao Discursiva
     * @param peso  Peso da Questao Discursiva indicada por "i" */
    public void setQuestaoDiscursiva (int i, String perg, String cC, double peso) {
        Discursiva dis = new Discursiva () ;
        if (this.qDiscursivas == null) {
            this.qDiscursivas = new Discursiva[this.getNDiscursivas ()] ;
        }
        this.qDiscursivas[i] = new Discursiva () ;
        dis.setPergunta (perg) ;
        dis.setPeso (peso) ;
        dis.setCriteriosCorrecao (cC) ;
        this.qDiscursivas[i] = dis ;
    }
    
    /** cria uma Questao Objetiva
     * @param i     indice do vetor de Questoes Objetivas
     * @param perg  Perguntaunta da Questao Objetiva indicada por "i"
     * @param rC    Resposta Correta dentre as alternativas
     * @param peso  Peso da Questao Objetiva indicada por "i" */
    public void setQuestaoObjetiva (int i, String perg, int rC, double peso) {
        Objetiva obj = new Objetiva () ;
        if (this.qObjetivas == null){
            this.qObjetivas = new Objetiva[this.getNObjetivas ()] ;
        }
        this.qObjetivas[i] = new Objetiva () ;
        obj.setPergunta (perg) ;
        obj.setRespostaCorreta (rC) ;
        obj.setPeso (peso) ;
        this.qObjetivas[i] = obj ;
    }
    
    /** atribui as alternativas de uma Questao Objetiva ja criada
     * @param i     indice do vetor de Questoes Objetivas
     * @param j     indice do vetor de Opcoes
     * @param opcao Descricao de uma das Opcoes (a, b, c, d, e) */
    public void setQuestaoObjetiva (int i, int j, String opcao) {
        this.qObjetivas[i].setOpcoes (j, opcao) ;
    }
    
    /** dados para criar o Cabecalho da Prova
     * @param disciplina   Disciplina
     * @param local Local
     * @param data  Data
     * @param peso  Peso da Prova */
    public void setCabecalho (String disciplina, String local, String data, double peso) {
        setDisciplina (disciplina) ;
        setLocal (local) ;
        setData (data) ;
        setPeso (peso) ;
    }
    
            
    // -------------------------------- GETs -------------------------------- //
    /** @return Disciplina */
    public String getDisciplina () {
        return this.disciplina ;
    }
    
    /** @return Local */
    public String getLocal () {
        return this.local ;
    }
    
    /** @return Data */
    public String getData () {
        return this.data ;
    }
    
    /** @return Peso da Prova */
    public double getPeso () {
        return this.peso ;
    }
    
    /** @return Numero de Questoes Discursivas */
    public int getNDiscursivas () {
        return this.nDiscursivas ;
    }
    
    /** @return Numero de Questoes Objetivas */
    public int getNObjetivas () {
        return this.nObjetivas ;
    }
    
    /** @return Cabecalho da Prova */
    public String getCabecalho () {
        String cabecalho = "" ;
        
        cabecalho += "Disciplina: " + this.disciplina + "\n" ;
        cabecalho += "Nome: ________________________________" + "\n" ;
        cabecalho += "Local: "+ this.local + "\t" ;
        cabecalho += "Data: " + this.data + "\t" ;
        cabecalho += "Peso: " + this.peso + "\n" ;
        
        return cabecalho ;
    }
    
    
    // --------------------------- OUTROS METODOS --------------------------- //
    /** @return Impressao da Prova Completa */
    public String imprimirProva () {
        String prova = "" ;
        int nQuestao = 1 ;
        
        prova += this.getCabecalho () + "\n" ;
        
        for (int i = 0 ; i < this.getNDiscursivas () ; i++) {
            prova += nQuestao + ". " + this.qDiscursivas[i].retornaQuestao () ;
            nQuestao++ ;
        }
        
        for (int i = 0 ; i < this.getNObjetivas () ; i++) {
            prova += nQuestao + ". " + this.qObjetivas[i].retornaQuestao () ;
            nQuestao++ ;
        }
        
        prova += "-->> BOA SORTE <<--" + "\n" ;
        
        return prova ;    
    }
}