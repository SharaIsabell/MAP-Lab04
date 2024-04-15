package entities;

import java.util.ArrayList;

public class Funcionario {
	private ArrayList<Funcao> funcoes;
	private String nome;
	
	protected Funcionario(String nome) {
		funcoes = new ArrayList<Funcao>();
		this.nome = nome;
	}
	
	public void adicionarFuncao(Funcao funcao) {
		funcoes.add(funcao);
	}
	
	public boolean trabalhaComo(Funcao funcaoPassada) {
		for (Funcao funcao : funcoes) {
			if (funcaoPassada == funcao) {
				return true;
			}
		}
		return false;
	}
	
	public void mostrarFilmografia() {
		for (Funcao funcao : funcoes) {
			for (Filme filme : funcao.mostrarFilmesParticipou()) {
				System.out.println(filme.getNome());
				System.out.println(funcao);
			}
		}
	}

	// Getters
	protected ArrayList<Funcao> getFuncoes() {
		return funcoes;
	}

	protected String getNome() {
		return nome;
	}
	
}
