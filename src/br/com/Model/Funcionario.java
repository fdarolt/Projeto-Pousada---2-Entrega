package br.com.Model;

import java.util.Date;

public class Funcionario extends Pessoa {

    //INSTANCIAR ATRIBUTOS 
    private String Salario;
    private Date dataAdmissao;
    private String funcao;
    
    //GERAR CONSTRUTOR
    public Funcionario() {
    }
        
    //INSTANCIAR METODOS ACESSORES
    public String getSalario() {
        return Salario;
    }

    public void setSalario(String Salario) {
        this.Salario = Salario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    //INSTANCIAR METODO TO STRING
    @Override
    public String toString() {
        return "Funcionario{" + "Salario=" + Salario + ", dataAdmissao=" + dataAdmissao + ", funcao=" + funcao + '}';
    }
    
}
