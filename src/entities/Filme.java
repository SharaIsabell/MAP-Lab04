package entities;

import java.util.ArrayList;

public class Filme {
	private String nome;
	private ArrayList<Funcionario> elenco;
	private Funcionario diretor;
	private Funcionario roteirista;
	private StringBuilder creditos;
	
	protected Filme(String nome, Funcionario diretor, Funcionario roteirista) {
		this.nome = nome;
		if(diretor instanceof Diretor) {
			this.diretor = diretor; 
			diretor.addFilme(this);
		}else {
			throw new FilmeException("Para exercer o cargo de diretor do filme o funcionário tem que ser um diretor");
		}
		if(diretor instanceof Diretor) {
			this.roteirista = roteirista;
			roteirista.addFilme(this);
		}else {
			throw new FilmeException("Para exercer o cargo de roteirista do filme o funcionário tem que ser um roteirista");
		}
		elenco = new ArrayList<>();
		creditos = new StringBuilder();
	}
	
	public void addEmElenco(Funcionario funcionario) {
		if(funcionario instanceof Diretor || funcionario instanceof Roteirista) {
			throw new FilmeException("Só pode haver um diretor e um roteirista no filme");
		}else {
			funcionario.addFilme(this);
			elenco.add(funcionario);
		}
	}
	
	@Override
	public String toString() {
		creditos.append(nome).append("\n");
		creditos.append(diretor).append("\n");
		creditos.append(roteirista).append("\n");
		for(Funcionario func : elenco) {
			creditos.append(func).append("\n");
		}
		return creditos.toString();
	}

}
