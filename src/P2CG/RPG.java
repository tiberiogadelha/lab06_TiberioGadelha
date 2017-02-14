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
	
	@Override
	public String toString() {
		return "+ " + getNomeJogo() + "- RPG:" + FIM_DE_LINHA +  "==> Jogou " + qtdJogado + " vez(es)" + FIM_DE_LINHA  + "==> Zerou " + 
	qtdZerado + "vez(es)" + FIM_DE_LINHA + "==> Maior score: " + bestScore;
	}
	

}
