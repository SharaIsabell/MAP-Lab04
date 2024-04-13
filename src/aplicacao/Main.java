package aplicacao;

import entities.*;


public class Main {
	public static void main(String[] args) {
		Funcionario func1 = Gestor.ehAtor("Raven");
		Funcionario func2 = Gestor.ehAtor("Wanda");
		Diretor func3 = Gestor.ehDiretor("Tony");
		Roteirista func4 = Gestor.ehRoteirista("Berry");
		Funcionario func5 = Gestor.ehDiretor("Melanie");
		Funcionario func6 = Gestor.ehRoteirista("Adam");
		
		Filme filme1 = Gestor.novoFilme("Izombie", func3, func4);
		filme1.addEmElenco(func1);
		filme1.addEmElenco(func2);
		System.out.println(filme1);
		
		Filme filme2 = Gestor.novoFilme("Moranguinho", func5, func6);
		filme2.addEmElenco(func1);
		filme2.addEmElenco(func2);
		System.out.println(filme2);
		
	}
}
