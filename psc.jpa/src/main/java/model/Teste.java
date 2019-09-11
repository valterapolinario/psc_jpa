package model;


public class Teste {

	public static void main(String[] args) {
		//Cliente c = new Cliente();
		//c.setEmail("loloa");
		DAOCliente dc = new DAOCliente();
		dc.findAll(Cliente.class);
	}

}
