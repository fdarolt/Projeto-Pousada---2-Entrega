package br.com.fabianodarolt.pousada.Model.Persistencia;

import br.com.fabianodarolt.pousada.Model.Endereco;
import br.com.fabianodarolt.pousada.Model.Persistencia.DAO.EnderecoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;

public class EnderecoDAOImplements implements EnderecoDAO {

    private static final String INSERT = "insert into endereco "
            + "(rua,numero,complemento,bairro,cidade,estado,pais,cep) values (?,?,?,?,?,?,?,?);";
    private static final String LIST = "select * from endereco;"; //, endereco where  funcionario.endereco_id = endereco.id;";
    private static final String REMOVE = "delete from endereco where id = ?;";
//    private static final String UPDATE = "update endereco set rua =?, numero=?,"
//            + "complemento=?,bairro=?, cidade=?, estado=?, pais=?, cep=?;";
//    private static final String LISTBYID = "select * from endereco where id = ?;";
//    private static final String LISTBYNOME = "select * from endereco where rua like ?;";

    private int inserir(Endereco e) {
        int status = -1;
        Connection con = null;
        PreparedStatement pstm = null;
        try {
            con = ConnectionFactory.getConnection();
            pstm = con.prepareStatement(INSERT,Statement.RETURN_GENERATED_KEYS );
            pstm.setString(1, e.getRua());
            pstm.setInt(2, e.getNumero());
            pstm.setString(3, e.getComplemento());
            pstm.setString(4, e.getBairro());
            pstm.setString(5, e.getCidade());
            pstm.setString(6, e.getEstado());
            pstm.setString(7, e.getPais());
            pstm.setString(8, e.getCep());         
            
            pstm.execute();
            try (ResultSet rs = pstm.getGeneratedKeys()) {
                rs.next();
                status = rs.getInt(1);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir um Endereço " + ex.getMessage());
        } finally {
            try {
                ConnectionFactory.closeConnection(con, pstm);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao Fechar " + ex.getMessage());
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
    
    
//    @Override
//    public boolean remove(int id) {
//        boolean status = false;
//        Connection con = null;
//        PreparedStatement pstm = null;
//        try {
//            con = ConnectionFactory.getConnection();
//            pstm = con.prepareStatement(REMOVE);
//            pstm.setInt(1, id);
//            pstm.execute();
//            status = true;
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Erro ao Excluir Funcionário " + e.getMessage());
//
//        } finally {
//            try {
//                ConnectionFactory.closeConnection(con, pstm);
//            } catch (Exception ex) {
//                JOptionPane.showMessageDialog(null, "Erro ao Fechar a Conexão " + ex);
//            }
//        }
//        return status;
//    }
//    
//    
//    @Override
//    public List<Endereco> listAll() {
//        Connection con = null;
//        PreparedStatement pstm = null;
//        ResultSet rs = null;
//        List<Endereco> endereco = new ArrayList<>();
//        try {
//            con = ConnectionFactory.getConnection();
//            pstm = con.prepareStatement(LIST);
//            rs = pstm.executeQuery();
//            while (rs.next()) {
//              
//                Endereco en = new Endereco();
//
//                en.setRua(rs.getString("rua"));
//                en.setNumero(Integer.parseInt(rs.getString("numero")));
//                en.setComplemento(rs.getString("complemento"));
//                en.setBairro(rs.getString("bairro"));
//                en.setCidade(rs.getString("cidade"));
//                en.setPais(rs.getString("pais"));
//                en.setCep(rs.getString("cep"));
//                endereco.add(en);
//
//               
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Erro ao Listar Funcionário " + e.getMessage());
//        } finally {
//            try {
//                ConnectionFactory.closeConnection(con, pstm, rs);
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, "Erro ao Fechar a conexão " + e.getMessage());
//            }
//        }
//        return endereco;
//    }
//    
    

    
    
    
    
    @Override
    public int editar(Endereco e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    @Override
    public Endereco listById(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Endereco> listByNome(String rua) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Endereco> listAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
