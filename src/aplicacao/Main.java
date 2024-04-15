package aplicacao;

import entities.*;

public class Main {
	public static void main(String[] args) {
		Funcionario func1 = GestorFilme.contratarFuncionario("Raven");
		Funcao ator1 = GestorFilme.ehAtor(func1);
		Funcao camera1 = GestorFilme.ehCamera(func1);
		
		Funcionario func2 = GestorFilme.contratarFuncionario("Wanda");
		Funcao ator2 = GestorFilme.ehAtor(func2);
		Funcao cinegrafista1 = GestorFilme.ehCinegrafista(func2);
		
		Funcionario func3 = GestorFilme.contratarFuncionario("Tony");
		Funcao diretor1 = GestorFilme.ehDiretor(func3);
		
		Funcionario func4 = GestorFilme.contratarFuncionario("Berry");
		Funcao roteirista1 = GestorFilme.ehRoteirista(func4);
		
		Funcionario func5 = GestorFilme.contratarFuncionario("Melanie");
		Funcao diretor2 = GestorFilme.ehDiretor(func5);
		
		Funcionario func6 = GestorFilme.contratarFuncionario("Adam");
		Funcao roteirista2 = GestorFilme.ehRoteirista(func6);
		
		// Cadastrar todos os envolvidos em um filme informando sua(s) função(ões);
		Filme filme1 = GestorFilme.novoFilme("Izombie", func3, func4);
		filme1.addEmElenco(func1, ator1);
		filme1.addEmElenco(func2, ator2);
		filme1.addEmElenco(func1, camera1);
		
		// Informar todas as características de um dado filme
		System.out.println(filme1);
		
		Filme filme2 = GestorFilme.novoFilme("Moranguinho", func5, func6);
		filme2.addEmElenco(func1, camera1);
		filme2.addEmElenco(func2, cinegrafista1);
		
		// Informar todas as características de um dado filme
		System.out.println(filme2);
		
		// Informar a filmografia indicando sua função específica;
		System.out.println("Filmografia: ");
		func1.mostrarFilmografia();
		
	}
}
