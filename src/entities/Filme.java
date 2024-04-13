package entities;

import java.util.ArrayList;

public class Filme {
	private String nome;
	private ArrayList<Funcionario> elenco;
	private Diretor diretor;
	private Roteirista roteirista;
	private StringBuilder creditos;
	
	public Filme(String nome, Diretor diretor, Roteirista roteirista) {
		this.nome = nome;
		this.diretor = diretor; //Lembrar de colocar diretor e roteirista como func. e usar instanceof para checar
		diretor.addFilme(this);
		this.roteirista = roteirista;
		roteirista.addFilme(this);
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
