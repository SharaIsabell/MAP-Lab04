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
		
		for (Funcao funcao : diretor.getFuncoes()) {
			if(funcao instanceof Diretor) {
				this.diretor = diretor; 
				funcao.addFilme(this);
			} else {
				throw new FilmeException("Para exercer o cargo de diretor do filme o funcionário tem que ser um diretor");
			}
		}
		
		for (Funcao funcao : roteirista.getFuncoes()) {
			if(funcao instanceof Roteirista) {
				this.roteirista = roteirista;
				funcao.addFilme(this);
			} else {
				throw new FilmeException("Para exercer o cargo de roteirista do filme o funcionário tem que ser um roteirista");
			}
		}
		
		elenco = new ArrayList<>();
		creditos = new StringBuilder();
	}
	
	public void addEmElenco(Funcionario funcionario, Funcao funcao) {
		if (funcionario.trabalhaComo(funcao)) {
			if(funcao instanceof Diretor || funcao instanceof Roteirista) {
				throw new FilmeException("Só pode haver um diretor e um roteirista no filme");
			}else {
				funcao.addFilme(this);
				for (Funcionario func : elenco) {
					if (func == funcionario) {
						return;
					}
				}
				elenco.add(funcionario);
			}
		} else {
			throw new FilmeException("Funcionário não trabalha na função dada");
		}
		
	}
	
	@Override
	public String toString() {
		creditos.append(nome).append("\n");
		creditos.append("Diretor: ").append(diretor.getNome()).append("\n");
		creditos.append("Roteirista: ").append(roteirista.getNome()).append("\n");
		
		for(Funcionario funcionario : elenco) {
			for (Funcao funcao : funcionario.getFuncoes()) {
				for(Filme filme : funcao.mostrarFilmesParticipou()) {
					if (filme == this) {
						creditos.append(funcao).append("\n");
					}
				}
			}
		}
		return creditos.toString();
	}
	
	// Getters

	protected String getNome() {
		return nome;
	}

	protected ArrayList<Funcionario> getElenco() {
		return elenco;
	}

	protected Funcionario getDiretor() {
		return diretor;
	}

	protected Funcionario getRoteirista() {
		return roteirista;
	}

}
