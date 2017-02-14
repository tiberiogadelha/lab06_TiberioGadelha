package P2CG;

import java.util.HashSet;
import java.util.Iterator;

public class Loja {
	private HashSet<Usuario> bancoDeUsuarios = new HashSet<>();
	
	public boolean vendeJogo(String nomeLogin, Jogo jogo){
		return false;
		
	}

	public boolean adicionaUsuario(String nomeUsuario, String nomeLogin) throws Exception {
		Usuario user = new Veterano(nomeUsuario,nomeLogin);
		if (!bancoDeUsuarios.contains(user)) {
			bancoDeUsuarios.add(user);
			return true;
		} else {
			throw new Exception("O nome de login ja esta sendo utilizado. Escolha outro, por favor.");
		}
	}
	
	public void creditaConta(String nomeLogin, int valor) throws Exception {
		if(procuraUsuario(nomeLogin) != null) {
			procuraUsuario(nomeLogin).creditaConta(valor);
		} else {
			throw new Exception("O usuario " + nomeLogin + " ainda nao foi cadastrado.");
		}
		
	}
	
	public void imprimeDados() {
		System.out.println("=== Central P2-CG ===");
		Iterator<Usuario> i = bancoDeUsuarios.iterator();
		while(i.hasNext()) {
			Usuario user = i.next();
			System.out.println(user.toString());
		}
	}
	
	public Usuario procuraUsuario(String nomeLogin) {
		Iterator<Usuario> i = bancoDeUsuarios.iterator();
		while(i.hasNext()) {
			Usuario usuarioProcurado = i.next();
			if (usuarioProcurado.getNomeLogin().equals(nomeLogin)) {
				return usuarioProcurado;
			}
		}
		return null;
	}
	
	public boolean upgradeUsuario(String nomeLogin) throws Exception {
		Usuario OldUser = procuraUsuario(nomeLogin);
		if(OldUser != null) {
			Usuario user1 = new Noob("blabla","blabalba");
			if(OldUser.getClass() == user1.getClass()){
				if(OldUser.getX2p() >= 1000) {
					Usuario newUser = new Veterano(OldUser.getNomeLogin(),OldUser.getNomeLogin());
					newUser.setBibliotecaDeJogos(OldUser.getBibliotecaDeJogos());
					newUser.setX2p(OldUser.getX2p());
					newUser.setSaldo(OldUser.getSaldo());
					bancoDeUsuarios.add(newUser);
					bancoDeUsuarios.remove(OldUser);
				}	
			} 
			throw new Exception("O jogador ja e um veterano ou nao possui a quantidade de x2p necessaria.");		
		}
			
		}
	}
}
