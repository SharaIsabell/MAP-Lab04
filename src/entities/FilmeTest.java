package entities;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class FilmeTest {

	static Funcionario func1;
	static Funcionario func2;
	static Funcionario func3;
	static Funcionario func4;
	static Filme filme;
	static Funcao ator;
	static Funcao diretor;
	static Funcao roteirista;
	static Funcao camera;
	
	@BeforeClass
	public static void criarObjetos() {
		func1 = GestorFilme.contratarFuncionario("Rennan");
		ator = GestorFilme.ehAtor(func1);
		
		func2 = GestorFilme.contratarFuncionario("Shara");
		diretor = GestorFilme.ehDiretor(func2);
		
		func3 = GestorFilme.contratarFuncionario("Lisa");
		roteirista = GestorFilme.ehRoteirista(func3);
		
		func4 = GestorFilme.contratarFuncionario("Lucas");
		camera = GestorFilme.ehCamera(func4);

		filme = new Filme("Universitários", func2, func3);
	}
	
	@Test(expected = FilmeException.class)
	public void filmeDiretorTest() { // Para testar se o funcionario possui o cargo de diretor para exercer no filme
		filme = new Filme("Estudantes", func1, func3);
	}
	
	@Test(expected = FilmeException.class)
	public void filmeRoteiristaTest() { // Para testar se o funcionario possui o cargo de roteirista para exercer no filme
		filme = new Filme("Estudantes", func2, func1);
	}
	
	@Test
	public void addEmElencoTest() { // Para testar se a quantidade de funcionarios adicionados está correta
		filme.addEmElenco(func1, ator);
		filme.addEmElenco(func4, camera);
		assertEquals(2, filme.getElenco().size());
	}
	
	@Test(expected = FilmeException.class)
	public void addEmElencoExcepitionTest() { // Para testar a exceção ao adicionar ao elenco
		filme.addEmElenco(func2, diretor);
		filme.addEmElenco(func4, camera);
	}
	
	@Test(expected = FilmeException.class)
	public void addEmElencoDiretor() { // Para testar se não é permitido adicionar dois ou mais diretores em um filme
		filme.addEmElenco(func2, diretor);
	}

}
