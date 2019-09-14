package model;

import atividades.atv07.DAOUsuario;
import atividades.atv07.Usuario;
import atividades.atv07.UsuarioId;
import atividades.atv08.DAOPessoa;
import atividades.atv08.Pessoa;
import atividades.atv08.Pet;

public class Teste {

	public static void main(String[] args) {
	Pessoa ps = new Pessoa();
	Pet pt = new Pet();
	ps.setNome("flavio");
	pt.setNome("loa");
	pt.setId(3);
	ps.setPetId(pt);
		
		DAOPessoa dao = new DAOPessoa();
		dao.saveorUpdate(ps);
	}

}
