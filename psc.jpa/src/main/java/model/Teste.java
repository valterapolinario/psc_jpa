package model;

import atividades.atv07.DAOUsuario;
import atividades.atv07.Usuario;
import atividades.atv07.UsuarioId;
import atividades.atv08.DAOPessoa;
import atividades.atv08.Pessoa;
import atividades.atv08.Pet;
import atividades.atv10.DAOfuncionario;
import atividades.atv10.Funcionario;

public class Teste {

	public static void main(String[] args) {
		Funcionario fc = new Funcionario();
		fc.setNome("joca");
		
		DAOfuncionario dao = new DAOfuncionario();
		dao.saveorUpdate(fc);
	}

}
