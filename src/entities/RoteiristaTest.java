package entities;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class RoteiristaTest {
	static Funcionario func1;
	static Funcionario func2;
	static Funcionario func3;
	static Filme filme;
	static Funcao ator;
	static Funcao diretor;
	static Funcao roteirista;
	static Funcao cinegrafista;
	
	@BeforeClass
	public static void criarObjetos() {
		func1 = GestorFilme.contratarFuncionario("Rennan");
		ator = GestorFilme.ehAtor(func1);
		cinegrafista = GestorFilme.ehCinegrafista(func1);
		
		func2 = GestorFilme.contratarFuncionario("Shara");
		diretor = GestorFilme.ehDiretor(func2);
		
		func3 = GestorFilme.contratarFuncionario("Lisa");
		roteirista = GestorFilme.ehRoteirista(func3);

		filme = new Filme("Universitários", func2, func3);
		filme.addEmElenco(func1, ator);
		filme.addEmElenco(func1, cinegrafista);
	}

	@Test
	public void addFilmeTest() { // Para testar se adicionou corretamente no ArrayList de filmes que o roteirista participou
		assertEquals(1, roteirista.mostrarFilmesParticipou().size());
	}
	
	@Test
	public void mostrarFilmesParticipouTest() { // Para testar se o filme correto foi adicionado no ArrayList de filmes
		assertEquals("Universitários", roteirista.mostrarFilmesParticipou().get(0).getNome());
	}

}
