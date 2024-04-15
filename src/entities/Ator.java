package entities;

import java.util.ArrayList;

public class Ator implements Funcao{
	private String nome;
	private ArrayList<Filme> filmesParticipou;
	
	protected Ator(String nome) {
		this.nome = nome;
		filmesParticipou = new ArrayList<>();
	}
	
	@Override
	public void addFilme(Filme filme) {
		filmesParticipou.add(filme);
	}

	@Override
	public ArrayList<Filme> mostrarFilmesParticipou() {
		return filmesParticipou;
	}

	@Override
	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return "Ator:\t" + nome;
	}

}
