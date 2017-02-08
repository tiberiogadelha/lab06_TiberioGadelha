package P2CG;

public class Noob extends Usuario{

	public Noob(String nomeUsuario, String nomeLogin) throws Exception {
		super(nomeUsuario, nomeLogin);
	}
	
	public boolean compraJogo(Jogo jogo) {
		if(super.getSaldo() >= (jogo.getPreco()*0.9)) {
			super.setSaldo(super.getSaldo() - jogo.getPreco());
			super.getBibliotecaDeJogos().add(jogo);
			return true;
		}
		return false;
	}
	

}
