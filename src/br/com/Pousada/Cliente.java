package br.com.Pousada;

 public class Cliente extends Pessoa {
     
    //INSTANCIAR ATRIBUTOS   
    private String passaporte;    
    private String cartaoCredito;    
    private String telefoneEmpresaCliente;
    private String procedenciaCliente;
    private String destinoCliente;
    private ServicoGeral servicoGeral;
    private Reserva reservaCliente;
    private Estadia estadiaCliente;    
    
     //GERAR CONSTRUTOR
    public Cliente() {
    }
    
    //INSTANCIAR METODOS ACESSORES
    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    public String getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(String cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public String getTelefoneEmpresaCliente() {
        return telefoneEmpresaCliente;
    }

    public void setTelefoneEmpresaCliente(String telefoneEmpresaCliente) {
        this.telefoneEmpresaCliente = telefoneEmpresaCliente;
    }

    public String getProcedenciaCliente() {
        return procedenciaCliente;
    }

    public void setProcedenciaCliente(String procedenciaCliente) {
        this.procedenciaCliente = procedenciaCliente;
    }

    public String getDestinoCliente() {
        return destinoCliente;
    }

    public void setDestinoCliente(String destinoCliente) {
        this.destinoCliente = destinoCliente;
    }

    public ServicoGeral getServicoGeral() {
        return servicoGeral;
    }

    public void setServicoGeral(ServicoGeral servicoGeral) {
        this.servicoGeral = servicoGeral;
    }

    public Reserva getReservaCliente() {
        return reservaCliente;
    }

    public void setReservaCliente(Reserva reservaCliente) {
        this.reservaCliente = reservaCliente;
    }

    public Estadia getEstadiaCliente() {
        return estadiaCliente;
    }

    public void setEstadiaCliente(Estadia estadiaCliente) {
        this.estadiaCliente = estadiaCliente;
    }

    //INSTANCIAR METODO TO STRING
    @Override
    public String toString() {
        return "Cliente{" + "passaporte=" + passaporte + ", cartaoCredito=" + cartaoCredito + ", telefoneEmpresaCliente=" + telefoneEmpresaCliente + ", procedenciaCliente=" + procedenciaCliente + ", destinoCliente=" + destinoCliente + ", servicoGeral=" + servicoGeral + ", reservaCliente=" + reservaCliente + ", estadiaCliente=" + estadiaCliente + '}';
    }  
}
