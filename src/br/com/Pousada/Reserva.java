
package br.com.Pousada;

import java.util.Date;

public class Reserva {
    
    //INSTANCIAR ATRIBUTOS
    
    private int id;
    private String nomeReserva;
    private String cartaoCredito;
    private Date dataEntrada;
    private Date dataSaida;
    private int numeroPessoas;
    private Endereco enderecoReserva;
    private String telefoneReserva;
    private String emailReserva;
    //GERAR CONSTRUTOR
    public Reserva() {
    }

    //INSTANCIAR METODOS ACESSORES
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeReserva() {
        return nomeReserva;
    }

    public void setNomeReserva(String nomeReserva) {
        this.nomeReserva = nomeReserva;
    }

    public String getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(String cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }

    public Endereco getEnderecoReserva() {
        return enderecoReserva;
    }

    public void setEnderecoReserva(Endereco enderecoReserva) {
        this.enderecoReserva = enderecoReserva;
    }

    public String getTelefoneReserva() {
        return telefoneReserva;
    }

    public void setTelefoneReserva(String telefoneReserva) {
        this.telefoneReserva = telefoneReserva;
    }

    public String getEmailReserva() {
        return emailReserva;
    }

    public void setEmailReserva(String emailReserva) {
        this.emailReserva = emailReserva;
    }

    //INSTANCIAR METODO TO STRING
    @Override
    public String toString() {
        return "Reserva{" + "id=" + id + ", nomeReserva=" + nomeReserva + ", cartaoCredito=" + cartaoCredito + ", dataEntrada=" + dataEntrada + ", dataSaida=" + dataSaida + ", numeroPessoas=" + numeroPessoas + ", enderecoReserva=" + enderecoReserva + ", telefoneReserva=" + telefoneReserva + ", emailReserva=" + emailReserva + '}';
    }
    
}
