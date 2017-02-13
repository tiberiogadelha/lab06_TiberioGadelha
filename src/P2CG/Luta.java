package P2CG;

public class Luta extends Jogo{

	public Luta(String nomeJogo, int preco) {
		super(nomeJogo, preco);
	}
	
	@Override
	public int registraJogada(int score, boolean zerou) throws Exception {
		if (score < 0 || score > 100000) {
			throw new Exception("O score nao pode ser menor que zerou ou maior que 100 mil.");
		}
		
		if (score > bestScore) {
			bestScore = score;
			return score/1000;
		}
		
		if (zerou == true) {
			qtdZerado++;
		}
		if (score > bestScore) {
			this.setBestScore(score);
		}
	
		qtdJogado++;
		return 1;
	}

}
