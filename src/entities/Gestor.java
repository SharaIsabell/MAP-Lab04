package entities;

public class Gestor {
	
	public static Ator ehAtor(String nome) {
		return new Ator(nome);
	}
	
	public static Roteirista ehRoteirista(String nome) {
		return new Roteirista(nome);
	}
	
	public static Diretor ehDiretor(String nome) {
		return new Diretor(nome);
	}
	
	public static Filme novoFilme(String nome, Diretor diretor, Roteirista roteirista) {
		return new Filme(nome, diretor, roteirista);
	}

}
