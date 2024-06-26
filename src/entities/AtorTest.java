package entities;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AtorTest {
	
	static Funcionario func1;
	static Funcionario func2;
	static Funcionario func3;
	static Filme filme;
	static Funcao ator;
	static Funcao diretor;
	static Funcao roteirista;
	
	@BeforeClass
	public static void criarObjetos() {
		func1 = GestorFilme.contratarFuncionario("Rennan");
		ator = GestorFilme.ehAtor(func1);
		
		func2 = GestorFilme.contratarFuncionario("Shara");
		diretor = GestorFilme.ehDiretor(func2);
		
		func3 = GestorFilme.contratarFuncionario("Lisa");
		roteirista = GestorFilme.ehRoteirista(func3);

		filme = new Filme("Universitários", func2, func3);
		filme.addEmElenco(func1, ator);
	}
	
	@Test
	public void addFilmeTest() { // Para testar se adicionou corretamente no ArrayList de filmes que o ator participou
		assertEquals(1, ator.mostrarFilmesParticipou().size());
	}
	
	@Test
	public void mostrarFilmesParticipouTest() { // Para testar se o filme correto foi adicionado no ArrayList de filmes
		assertEquals("Universitários", ator.mostrarFilmesParticipou().get(0).getNome());
	}
	
}
