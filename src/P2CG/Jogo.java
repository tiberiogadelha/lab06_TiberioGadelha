package P2CG;

import java.util.HashSet;

public class Jogo {
	private String nomeJogo;
	private double preco;
	private int bestScore;
	private int qtdJogado;
	private int qtdZerado;
	private HashSet<Jogabilidade> jogabilidade;
	
	public Jogo(String nomeJogo, double preco) {
		this.nomeJogo = nomeJogo;
		this.setPreco(preco);
		bestScore = 0;
		setQtdJogado(0);
		setQtdZerado(0);
		setJogabilidade(new HashSet<>());
	}
	
	public void registraJogada(int score, boolean zerou) {
		
	}

	public String getNomeJogo() {
		return nomeJogo;
	}

	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	
	public int getBestScore() {
		return bestScore;
	}

	public void setBestScore(int bestScore) {
		this.bestScore = bestScore;
	}

	public int getQtdJogado() {
		return qtdJogado;
	}

	public void setQtdJogado(int qtdJogado) {
		this.qtdJogado = qtdJogado;
	}

	public int getQtdZerado() {
		return qtdZerado;
	}

	public void setQtdZerado(int qtdZerado) {
		this.qtdZerado = qtdZerado;
	}

	public HashSet<Jogabilidade> getJogabilidade() {
		return jogabilidade;
	}

	public void setJogabilidade(HashSet<Jogabilidade> jogabilidade) {
		this.jogabilidade = jogabilidade;
	}
	
	



}
