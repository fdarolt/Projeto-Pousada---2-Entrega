
package br.com.fabianodarolt.pousada.Model.Persistencia.DAO;

import br.com.fabianodarolt.pousada.Model.Endereco;
import br.com.fabianodarolt.pousada.Model.Funcionario;
import java.util.List;


public interface EnderecoDAO {
    
    int salvar (Endereco e);
    int editar (Endereco e);
    boolean remove (int id);
    List<Endereco> listAll();    
    Endereco listById (int codigo);
    List<Endereco> listByNome (String rua);
    
}
