package br.com.Pousada;

import java.util.Date;

public class Estadia {

    //ISTANCIAR ATRIBUTOS 
    private int idEstadia;
    private UnidadeHabitacional unidadeHabEstadia;
    private Cliente cliente;    
    private Date dataEntradaEstadia;
    private Date dataSaidaEstadia;
    private int numeroPessoasEstadia;
    
    //GERAR CONSTRUTOR
    public Estadia() {
    }
    
    //ISTANCIAR METODOS ACESSORES
    public int getIdEstadia() {
        return idEstadia;
    }

    public void setIdEstadia(int idEstadia) {
        this.idEstadia = idEstadia;
    }

    public UnidadeHabitacional getUnidadeHabEstadia() {
        return unidadeHabEstadia;
    }

    public void setUnidadeHabEstadia(UnidadeHabitacional unidadeHabEstadia) {
        this.unidadeHabEstadia = unidadeHabEstadia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDataEntradaEstadia() {
        return dataEntradaEstadia;
    }

    public void setDataEntradaEstadia(Date dataEntradaEstadia) {
        this.dataEntradaEstadia = dataEntradaEstadia;
    }

    public Date getDataSaidaEstadia() {
        return dataSaidaEstadia;
    }

    public void setDataSaidaEstadia(Date dataSaidaEstadia) {
        this.dataSaidaEstadia = dataSaidaEstadia;
    }

    public int getNumeroPessoasEstadia() {
        return numeroPessoasEstadia;
    }

    public void setNumeroPessoasEstadia(int numeroPessoasEstadia) {
        this.numeroPessoasEstadia = numeroPessoasEstadia;
    }
    
    //ISTANCIAR METODO TO STRING
    @Override
    public String toString() {
        return "Estadia{" + "idEstadia=" + idEstadia + ", unidadeHabEstadia=" + unidadeHabEstadia + ", cliente=" + cliente + ", dataEntradaEstadia=" + dataEntradaEstadia + ", dataSaidaEstadia=" + dataSaidaEstadia + ", numeroPessoasEstadia=" + numeroPessoasEstadia + '}';
    }   
}
