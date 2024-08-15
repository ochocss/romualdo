package pessoa;

import java.time.LocalDate;

public abstract class Pessoa {
	protected String nome;
	protected LocalDate nascimento;
	protected Endereco endereco;
	
	public Pessoa() {}
	public Pessoa(String nome, LocalDate nascimento, String nomeDaRua, Integer numero, String bairro, String cidade, String cep) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.endereco = new Endereco(nomeDaRua, numero, bairro, cidade, cep);
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public LocalDate getNascimento() {
		return nascimento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", nascimento=" + Utils.formatDate(nascimento) + ", " + endereco +"]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj == null || !(obj instanceof Pessoa)) {
			return false;
		}
			
		Pessoa temp = (Pessoa) obj;
		
		if(!this.nome.equals(temp.nome) || 
		   !this.nascimento.equals(temp.nascimento) ||
		   !this.endereco.equals(temp.endereco)) {
			return false;
		}
		
		return true;
	}
}
