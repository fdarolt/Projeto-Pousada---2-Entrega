/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fabianodarolt.pousada.Controller;

import br.com.fabianodarolt.pousada.Model.Endereco;
import br.com.fabianodarolt.pousada.Model.Persistencia.DAO.EnderecoDAO;
import br.com.fabianodarolt.pousada.Model.Persistencia.EnderecoDAOImplements;
import java.util.List;

/**
 *
 * @author guest01
 */
public class EnderecoController {
    public int salvar (Endereco e){
        EnderecoDAO dao = new EnderecoDAOImplements();
        return dao.salvar(e);
    }
    
    public List< Endereco> listarTodos() {
        EnderecoDAO dao = new EnderecoDAOImplements();
        return dao.listAll();
    }
     public List<Endereco> listByNome(String nome) {
        EnderecoDAO dao = new EnderecoDAOImplements();
        return dao.listByNome(nome);
    }

    public boolean remove(int id) {
        EnderecoDAO dao = new EnderecoDAOImplements();
        return dao.remove(id);
    }

    public Endereco listById(int id) {
        EnderecoDAO dao = new EnderecoDAOImplements();
        return dao.listById(id);
    }   
}
