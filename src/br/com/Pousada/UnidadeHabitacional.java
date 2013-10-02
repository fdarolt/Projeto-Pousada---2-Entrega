
package br.com.Pousada;


public class UnidadeHabitacional {
    
    //INSTANCIAR ATRIBUTOS 
    
    private int id;
    private String nomeUnidade;    
    private String categoriaUnidade;
    private String descricaoUnidade;
    private double valorUnidade;
    private double margemLucro;
    private double valorFinal;
    
    //GERAR CONSTRUTOR
    public UnidadeHabitacional() {
    }
     
    //INSTANCIAR METODOS ACESSORES
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeUnidade() {
        return nomeUnidade;
    }

    public void setNomeUnidade(String nomeUnidade) {
        this.nomeUnidade = nomeUnidade;
    }

    public String getCategoriaUnidade() {
        return categoriaUnidade;
    }

    public void setCategoriaUnidade(String categoriaUnidade) {
        this.categoriaUnidade = categoriaUnidade;
    }

    public String getDescricaoUnidade() {
        return descricaoUnidade;
    }

    public void setDescricaoUnidade(String descricaoUnidade) {
        this.descricaoUnidade = descricaoUnidade;
    }
    
    //INSTANCIAR METODO TO STRING
    @Override
    public String toString() {
        return "UnidadeHabitacional{" + "id=" + id + ", nomeUnidade=" + nomeUnidade + ", categoriaUnidade=" + categoriaUnidade + ", descricaoUnidade=" + descricaoUnidade + '}';
    }
}
