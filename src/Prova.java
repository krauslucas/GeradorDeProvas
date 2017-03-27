import java.util.ArrayList;

/** classe "Prova" */
public class Prova {
    
    // ------------------------------ ATRIBUTOS ----------------------------- //
    /** eh a Disciplina da Prova */
    private String disciplina ;
    
    /** eh o Local que sera realizada a Prova */
    private String local ;
    
    /** eh a Data de quando sera realizada a Prova */
    private String data ;
    
    /** eh o Peso da Prova */
    private double peso ;
    
    /** sao as Questoes da Prova, que poderao ser Discursivas ou Objetivas */
    private ArrayList <Questao> listaQuestoes  = new ArrayList () ;
    
    
    // ----------------------------- CONSTRUTOR ----------------------------- //
    public Prova () {
        this.data = ""  ;
        this.disciplina = "" ;
        this.local = "" ;
        this.peso = 0 ;
    }
    
	
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
    
    /** cria uma Questao Discursiva
     * @param perg  Pergunta da Questao Discursiva indicada por "i"
     * @param cC    Criterios de Correcao da Questao Discursiva
     * @param peso  Peso da Questao Discursiva */
    public void setQuestaoDiscursiva (String perg, String cC, double peso) {
        Discursiva dis = new Discursiva () ;
        
        dis.setPergunta(perg) ;
        dis.setPeso(peso) ;
        dis.setCriteriosCorrecao(cC) ;
        
        this.listaQuestoes.add(dis) ;
    }
    
    /** cria uma Questao Objetiva
     * @param perg  Pergunta da Questao Objetiva indicada por "i"
     * @param ops   sao as alternativas (a, b, c, d, e) da pergunta Objetiva
     * @param rC    Resposta Correta dentre as alternativas
     * @param peso  Peso da Questao Objetiva */
    public void setQuestaoObjetiva (String perg, String[] ops, int rC, double peso) {
        Objetiva obj = new Objetiva () ;
        
        obj.setPergunta(perg) ;
        obj.setPeso(peso) ;
        for (int i = 0 ; i < 5 ; i++) {
            obj.setOpcoes(i, ops[i]) ;
        }
        
        this.listaQuestoes.add(obj) ;
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
        int qtdQuestoes = this.listaQuestoes.size() ;
        
        prova += this.getCabecalho() + "\n" ;
        
        for (int i = 0 ; i < qtdQuestoes ; i++) {
            prova += nQuestao + ". " + this.listaQuestoes.get(i).retornaQuestao() ;
            nQuestao++ ;
        }
        
        prova += "-->> BOA SORTE <<--" + "\t\t\t\t" + "(Lucas Kraus)" + "\n" ;
        
        return prova ;    
    }
}