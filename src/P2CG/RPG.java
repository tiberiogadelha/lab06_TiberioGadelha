package P2CG;

public class RPG extends Jogo {

	public RPG(String nomeJogo, double preco) {
		super(nomeJogo, preco);
	}
	
	@Override
	public int registraJogada(int score, boolean zerou) {
		if (zerou == true) {
			this.setQtdZerado(this.getQtdZerado() + 1);
		}
		if (score > this.getBestScore()) {
			this.setBestScore(score);
		}
	
		this.setQtdJogado(this.getQtdJogado() + 1);
		return 1;
	}
	

}
