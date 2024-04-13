package entities;

import java.util.ArrayList;

public interface Funcionario {
	public String getNome();
	public ArrayList<Filme> mostrarFilmesParticipou();
	public void addFilme(Filme filme);
}
