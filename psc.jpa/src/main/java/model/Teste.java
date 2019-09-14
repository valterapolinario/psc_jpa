package model;

import atividades.atv07.DAOUsuario;
import atividades.atv07.Usuario;
import atividades.atv07.UsuarioId;

public class Teste {

	public static void main(String[] args) {
		UsuarioId uid = new UsuarioId();
		uid.setEmpresa(1);
		uid.setId(1);
	Usuario us = new Usuario();
		us.setCpf("023165484");
		us.setNome("jota23");
		us.setId(uid);
		
		DAOUsuario dao = new DAOUsuario();
		dao.saveorUpdate(us);
	}

}
