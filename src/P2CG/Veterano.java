package P2CG;

public class Veterano extends Usuario{

	public Veterano(String nomeUsuario, String nomeLogin) throws Exception {
		super(nomeUsuario, nomeLogin);
		x2p = 1000;
	}
	
	@Override
	public boolean compraJogo(Jogo jogo) {
		if(saldo >= (jogo.getPreco()*0.9)) {
			totalGasto += jogo.getPreco()*0.8;
			saldo -= jogo.getPreco()*0.9;
			bibliotecaDeJogos.add(jogo);
			x2p += jogo.getPreco()* 15;
			return true;
		}
		return false;
	}
	
	

}
