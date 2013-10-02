package br.com.Model;

import java.util.Date;

public abstract class Pessoa {

    //INSTANCIAR ATRIBUTOS 
    private int id;
    private String nome;
    private String sexo;
    private Date dataNascimento;    
    private Endereco endereco;
    private String telefoneResindecial;
    private String telefoneCelular;
    private String email;
    
    //GERAR CONSTRUTOR
    public Pessoa() {
    } 
    
    //INSTANCIAR METODOS ACESSORES
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }   

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefoneResindecial() {
        return telefoneResindecial;
    }

    public void setTelefoneResindecial(String telefoneResindecial) {
        this.telefoneResindecial = telefoneResindecial;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //INSTANCIAR METODO TO STRING
    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", sexo=" + sexo + ", dataNascimento=" + dataNascimento + ", endereco=" + endereco + ", telefoneResindecial=" + telefoneResindecial + ", telefoneCelular=" + telefoneCelular + ", email=" + email + '}';
    }    
}
