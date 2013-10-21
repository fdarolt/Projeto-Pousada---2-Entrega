package br.com.fabianodarolt.pousada.Model.Persistencia;

import br.com.fabianodarolt.pousada.Model.Endereco;
import br.com.fabianodarolt.pousada.Model.Persistencia.DAO.EnderecoDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class EnderecoDAOImplements implements EnderecoDAO {

    private static final String INSERT = "insert into endereco "
            + "(rua,numero,complemento,bairro,cidade,estado,pais,cep) values (?,?,?,?,?,?,?,?);";

    private int inserir(Endereco e) {
        int status = -1;
        Connection con = null;
        PreparedStatement pstm = null;
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(INSERT,Statement.RETURN_GENERATED_KEYS );
            pstm.setString(1, e.getRua());
            pstm.setString(2, e.getNumero());
            
            pstm.execute();
            try (ResultSet rs = pstm.getGeneratedKeys()) {
                rs.next();
                status = rs.getInt(1);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir um Endereço" + ex.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Fechar" + ex.getMessage());
            }
        }
        return status;
    }

    @Override
    public int salvar(Endereco e) {
        if (e.getIdEndereco() == 0) {
            return inserir(e);

        } else {
            return -1;
        }


    }
}
