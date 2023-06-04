package pacote;

public class Contato {
	private Integer numero;
	private String nome;

	public Contato(Integer numero, String nome) {
		super();
		this.numero = numero;
		this.nome = nome;

	}

	public Integer getnumero() {
		return numero;
	}



	public void setnumero(Integer numero) {
		this.numero = numero;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}




}
