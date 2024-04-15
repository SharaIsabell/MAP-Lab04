package aplicacao;

import entities.*;


public class Main {
	public static void main(String[] args) {
		Funcionario func1 = GestorFilme.ehAtor("Raven");
		Funcionario func2 = GestorFilme.ehAtor("Wanda");
		Diretor func3 = GestorFilme.ehDiretor("Tony");
		Roteirista func4 = GestorFilme.ehRoteirista("Berry");
		Funcionario func5 = GestorFilme.ehDiretor("Melanie");
		Funcionario func6 = GestorFilme.ehRoteirista("Adam");
		func1 = GestorFilme.ehCamera(func1.getNome());
		func2 = GestorFilme.ehCinegrafista(func2.getNome());
		
		Filme filme1 = GestorFilme.novoFilme("Izombie", func3, func4);
		filme1.addEmElenco(func1);
		filme1.addEmElenco(func2);
		System.out.println(filme1);
		
		Filme filme2 = GestorFilme.novoFilme("Moranguinho", func5, func6);
		filme2.addEmElenco(func1);
		filme2.addEmElenco(func2);
		System.out.println(filme2);
		
	}
}
