package P2CG;

public class Plataforma extends Jogo {

	public Plataforma(String nomeJogo, int preco) {
		super(nomeJogo, preco);
	}

	@Override
	public int registraJogada(int score, boolean zerou) {
		if (score > bestScore) {
			bestScore = score;
		}
		qtdJogado++;
		if (zerou == true) {
			qtdZerado++;
			return 20;
		}
		return 0;

	}
}
