package aplicacao;

import entities.*;


public class Main {
	public static void main(String[] args) {
		Funcionario func1 = Gestor.ehAtor("Raven");
		Funcionario func2 = Gestor.ehAtor("Wanda");
		Diretor func3 = Gestor.ehDiretor("Tony");
		Roteirista func4 = Gestor.ehRoteirista("Berry");
		
		Filme filme = Gestor.novoFilme("Izombie", func3, func4);
		filme.addEmElenco(func1);
		filme.addEmElenco(func2);
		System.out.println(filme);
	}
}
