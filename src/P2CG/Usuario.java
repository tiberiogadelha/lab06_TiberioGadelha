package P2CG;

import java.util.ArrayList;

public class Usuario {
	private String nomeUsuario;
	private String nomeLogin;
	private double saldo;
	private ArrayList<Jogo> bibliotecaDeJogos;
	private boolean noob;
	
	public Usuario(String nomeUsuario, String nomeLogin) throws Exception{
		if (nomeUsuario.trim().equals("") || nomeUsuario == null) {
			throw new Exception("O nome do usuario nao pode ser nulo ou vazio.");
		}
		if (nomeLogin.trim().equals("") || nomeLogin == null) {
			throw new Exception("O nome do login nao pode ser nulo ou vazio.");
		}
		this.nomeUsuario = nomeUsuario;
		this.nomeLogin = nomeLogin;
		saldo = 0;
		noob = true;
		bibliotecaDeJogos = new ArrayList<>();
		
	}
	
	public void compraCredito(int credito) throws Exception {
		if (credito < 0) {
			throw new Exception("Nao pode colocar uma quantidade negativa de credito");
		}
		saldo += credito;
				
	}
	

}
