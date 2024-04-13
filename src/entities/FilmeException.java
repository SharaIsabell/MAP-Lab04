package entities;

public class FilmeException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public FilmeException(String mensagem){
		super(mensagem);
	}

}
