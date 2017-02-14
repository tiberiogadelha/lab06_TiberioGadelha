package P2CG;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import P2CG.Noob;
import P2CG.Usuario;

public class NoobTest {

public Usuario user;
	
	@Before
	public void iniciar() throws Exception{
		user = new Noob("Joao","joao.game");
	}
	
	@Test
	public void testConstrutor() throws Exception {
		assertEquals("joao.game", user.getNomeLogin());
		assertEquals("Joao", user.getNomeUsuario());
	

	}
}
