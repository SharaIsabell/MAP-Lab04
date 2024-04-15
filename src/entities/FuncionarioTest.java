package entities;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class FuncionarioTest {

	static Funcionario func1;
	static Funcionario func2;
	static Funcionario func3;
	static Filme filme;
	static Funcao ator;
	static Funcao diretor;
	static Funcao roteirista;
	static Funcao camera;
	
	@BeforeClass
	public static void criarObjetos() {
		func1 = GestorFilme.contratarFuncionario("Rennan");
		ator = GestorFilme.ehAtor(func1);
		camera = GestorFilme.ehCamera(func1);
		
		func2 = GestorFilme.contratarFuncionario("Shara");
		diretor = GestorFilme.ehDiretor(func2);
		
		func3 = GestorFilme.contratarFuncionario("Lisa");
		roteirista = GestorFilme.ehRoteirista(func3);

		filme = new Filme("Universitários", func2, func3);
		filme.addEmElenco(func1, ator);
		filme.addEmElenco(func1, camera);
	}
	
	@Test
	public void adicionarFuncaoTest() { // Para testar se estão sendo adicionadas corretamente as funções no ArrayList de Funcionario
		assertEquals(2, func1.getFuncoes().size());
	}
	
	@Test
	public void trabalhaComoTest() { // Para testar se na lista de funções do funcionário, realmente está a função que quero verficar
		assertEquals(true, func1.trabalhaComo(camera));
	}

}
