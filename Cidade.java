package aula6Modify;

public class Cidade {
	private String nome;
	private Estado estado;
	
	public void localizacaoMais(String nome0, String sigla) {
		estado = new Estado();
		estado.setNome0(nome0);
		estado.setSigla(sigla);
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
