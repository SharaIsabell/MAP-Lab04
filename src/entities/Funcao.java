package entities;

import java.util.ArrayList;

public interface Funcao {
	public String getNome();
	public ArrayList<Filme> mostrarFilmesParticipou();
	public void addFilme(Filme filme);
}
