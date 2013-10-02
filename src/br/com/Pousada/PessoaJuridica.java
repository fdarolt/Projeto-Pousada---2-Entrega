package br.com.Pousada;

public class PessoaJuridica extends Pessoa {
    
    //INSTANCIAR ATRIBUTOS 
    
    private String cnpj;    
    private String pessoaContatoEmpresa;
    
     //GERAR CONSTRUTOR
    public PessoaJuridica() {
    }
        
    //INSTANCIAR METODOS ACESSORES
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
