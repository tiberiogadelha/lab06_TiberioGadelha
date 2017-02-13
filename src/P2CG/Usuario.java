package P2CG;

import java.util.HashSet;

public abstract class Usuario {
	private String nomeUsuario;
	private String nomeLogin;
	protected double saldo;
	protected HashSet<Jogo> bibliotecaDeJogos;
	protected int x2p;
	protected int totalGasto;
	
	public Usuario(String nomeUsuario, String nomeLogin) throws Exception{
		if (nomeUsuario.trim().equals("") || nomeUsuario == null) {
			throw new Exception("O nome do usuario nao pode ser nulo ou vazio.");
		}
		if (nomeLogin.trim().equals("") || nomeLogin == null) {
			throw new Exception("O nome do login nao pode ser nulo ou vazio.");
		}
		this.nomeUsuario = nomeUsuario;
		this.nomeLogin= nomeLogin;
		saldo = 0;
		x2p = 0;
		totalGasto = 0;
		bibliotecaDeJogos = new HashSet<>();
		
	}
	
	public void creditaConta(int valor) throws Exception {
		if (valor < 0) {
			throw new Exception("Nao pode colocar uma quantidade negativa de credito");
		}
		saldo += valor;
				
	}
	
	public abstract boolean compraJogo(Jogo jogo);
	
	public void registraJogada(String nomeDoJogo, int score, boolean zerou) throws Exception {
		if (!(procuraJogo(nomeDoJogo) == null)) {
			x2p += procuraJogo(nomeDoJogo).registraJogada(score, zerou);
		}
		
	}
	
	public Jogo procuraJogo(String nomeDoJogo) {
		for (Jogo jogoProcurado: bibliotecaDeJogos) {
			if (jogoProcurado.getNomeJogo().equals(nomeDoJogo)) {
				return jogoProcurado;
			}
		}
		return null;
	}

	public double getSaldo() {
		return saldo;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeLogin == null) ? 0 : nomeLogin.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (nomeLogin == null) {
			if (other.nomeLogin != null)
				return false;
		} else if (!nomeLogin.equals(other.nomeLogin))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return nomeLogin + "\n" + nomeUsuario + "\n" + "Lista de Jogos: " + bibliotecaDeJogos + "Total de pre�o dos jogos: R$ "
				+ totalGasto + "--------------------------------------------";
	}
	

}
