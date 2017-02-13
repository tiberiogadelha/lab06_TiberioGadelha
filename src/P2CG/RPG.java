package P2CG;

public class RPG extends Jogo {

	public RPG(String nomeJogo, int preco) {
		super(nomeJogo, preco);
	}
	
	@Override
	public int registraJogada(int score, boolean zerou) {
		if (zerou == true) {
			qtdZerado++;
		}
		if (score > bestScore) {
			bestScore = score;
		}
		qtdJogado++;
		return 10;
	}
	

}
