package entities;

public class GestorFilme {
	
	public static Ator ehAtor(String nome) {
		return new Ator(nome);
	}
	
	public static Roteirista ehRoteirista(String nome) {
		return new Roteirista(nome);
	}
	
	public static Diretor ehDiretor(String nome) {
		return new Diretor(nome);
	}
	
	public static Camera ehCamera(String nome) {
		return new Camera(nome);
	}
	
	public static Cinegrafista ehCinegrafista(String nome) {
		return new Cinegrafista(nome);
	}
	
	public static Filme novoFilme(String nome, Funcionario diretor, Funcionario roteirista) {
		return new Filme(nome, diretor, roteirista);
	}

}
