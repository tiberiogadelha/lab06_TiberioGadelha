package P2CG;

public class Noob extends Usuario{

	public Noob(String nomeUsuario, String nomeLogin) throws Exception {
		super(nomeUsuario, nomeLogin);
	}
	
	@Override
	public boolean compraJogo(Jogo jogo) {
		if(saldo >= (jogo.getPreco()*0.9)) {
			totalGasto += jogo.getPreco()*0.9;
			saldo -= jogo.getPreco()*0.9;
			bibliotecaDeJogos.add(jogo);
			x2p += jogo.getPreco() * 10;
			return true;
		}
		return false;
	}
	

}
