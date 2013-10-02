package br.com.Pousada;


public class ServicoGeral {
    
    //INSTANCIAR ATRIBUTOS 
    
    private int idServicoGeral;
    private String nomenclatura;
    private String descricao;
    private double valorInicialServico;
    private double margemLucroValorServico;
    private double valorFinalServico;
    
    //GERAR CONSTRUTOR
    public ServicoGeral() {
    }
    
    //INSTANCIAR METODOS ACESSORES
    public int getId() {
        return idServicoGeral;
    }

    public void setId(int id) {
        this.idServicoGeral = idServicoGeral;
    }

    public String getNomenclatura() {
        return nomenclatura;
    }

    public void setNomenclatura(String nomenclatura) {
        this.nomenclatura = nomenclatura;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorInicialServico() {
        return valorInicialServico;
    }

    public void setValorInicialServico(double valorInicialServico) {
        this.valorInicialServico = valorInicialServico;
    }

    public double getMargemLucroValorServico() {
        return margemLucroValorServico;
    }

    public void setMargemLucroValorServico(double margemLucroValorServico) {
        this.margemLucroValorServico = margemLucroValorServico;
    }

    public double getValorFinalServico() {
        return valorFinalServico;
    }

    public void setValorFinalServico(double valorFinalServico) {
        this.valorFinalServico = valorFinalServico;
    }

    //INSTANCIAR METODO TO STRING
    @Override
    public String toString() {
        return "ServicoGeral{" + "idServicoGeral=" + idServicoGeral + ", nomenclatura=" + nomenclatura + ", descricao=" + descricao + ", valorInicialServico=" + valorInicialServico + ", margemLucroValorServico=" + margemLucroValorServico + ", valorFinalServico=" + valorFinalServico + '}';
    }        
}
