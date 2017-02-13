package P2CG;

import java.util.HashSet;
import java.util.Iterator;

public class Loja {
	private HashSet<Usuario> bancoDeUsuarios = new HashSet<>();
	
	public boolean vendeJogo(String nomeLogin, String nomeJogo, int preco){
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
}
