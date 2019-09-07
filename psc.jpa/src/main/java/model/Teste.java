package model;


public class Teste {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		c.setEmail("lll");
		DAOCliente dc = new DAOCliente();
		dc.saveorUpdate(c);
	}

}
