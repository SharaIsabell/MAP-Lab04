package entities;

public class GestorFilme {
	
	public static Funcionario contratarFuncionario(String nome) {
		return new Funcionario(nome);
	}
	
	public static Funcao ehAtor(Funcionario funcionario) {
		Funcao ator = new Ator(funcionario.getNome());
		funcionario.adicionarFuncao(ator);
		return ator;
	}
	
	public static Funcao ehRoteirista(Funcionario funcionario) {
		Funcao roteirista = new Roteirista(funcionario.getNome());
		funcionario.adicionarFuncao(roteirista);
		return roteirista;
	}
	
	public static Funcao ehDiretor(Funcionario funcionario) {
		Funcao diretor = new Diretor(funcionario.getNome());
		funcionario.adicionarFuncao(diretor);
		return diretor;
	}
	
	public static Funcao ehCamera(Funcionario funcionario) {
		Funcao camera = new Camera(funcionario.getNome());
		funcionario.adicionarFuncao(camera);
		return camera;
	}
	
	public static Funcao ehCinegrafista(Funcionario funcionario) {
		Funcao cinegrafista = new Cinegrafista(funcionario.getNome());
		funcionario.adicionarFuncao(cinegrafista);
		return cinegrafista;
	}
	
	public static Filme novoFilme(String nome, Funcionario diretor, Funcionario roteirista) {
		return new Filme(nome, diretor, roteirista);
	}

}
