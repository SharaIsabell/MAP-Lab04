package entities;

import java.util.ArrayList;

public class Roteirista implements Funcao{
	private String nome;
	private ArrayList<Filme> filmesParticipou;

	protected Roteirista(String nome) {
		this.nome = nome;
		filmesParticipou = new ArrayList<>();
	}
	
	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public ArrayList<Filme> mostrarFilmesParticipou() {
		return filmesParticipou;
	}

	@Override
	public void addFilme(Filme filme) {
		filmesParticipou.add(filme);
		
	}
	
	@Override
	public String toString() {
		return "Roteirista:\t" + nome;
	}

}
