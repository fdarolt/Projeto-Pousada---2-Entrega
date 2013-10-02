package br.com.Pousada;

public class Fornecedor extends PessoaJuridica {
    
    //INSTANCIAR ATRIBUTOS
    private String descricao;    
    
    //GERAR CONTRUTOR
    public Fornecedor() {
    }

    //ISTANCIAR METODOS ACESSORES
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    } 
     
    //ISTANCIAR METODO TO STRING
    @Override
    public String toString() {
        return "Fornecedor{" + "descricao=" + descricao + '}';
    }        
}
