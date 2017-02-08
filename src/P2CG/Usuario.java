package P2CG;

import java.util.HashSet;

public class Usuario {
	private String nomeUsuario;
	private String nomeLogin;
	private double saldo;
	private HashSet<Jogo> bibliotecaDeJogos;
	
	public Usuario(String nomeUsuario, String nomeLogin) throws Exception{
		if (nomeUsuario.trim().equals("") || nomeUsuario == null) {
			throw new Exception("O nome do usuario nao pode ser nulo ou vazio.");
		}
		if (nomeLogin.trim().equals("") || nomeLogin == null) {
			throw new Exception("O nome do login nao pode ser nulo ou vazio.");
		}
		this.setNomeUsuario(nomeUsuario);
		this.setNomeLogin(nomeLogin);
		setSaldo(0);
		setBibliotecaDeJogos(new HashSet<>());
		
	}
	
	public void compraCredito(int credito) throws Exception {
		if (credito < 0) {
			throw new Exception("Nao pode colocar uma quantidade negativa de credito");
		}
		setSaldo(getSaldo() + credito);
				
	}
	

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNomeLogin() {
		return nomeLogin;
	}

	public void setNomeLogin(String nomeLogin) {
		this.nomeLogin = nomeLogin;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public HashSet<Jogo> getBibliotecaDeJogos() {
		return bibliotecaDeJogos;
	}

	public void setBibliotecaDeJogos(HashSet<Jogo> bibliotecaDeJogos) {
		this.bibliotecaDeJogos = bibliotecaDeJogos;
	}

}
