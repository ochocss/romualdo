package pessoa;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Pessoa {
	protected String nome;
	protected LocalDate nascimento;
	protected Endereco endereco;

	private static class Endereco {
		String nomeDaRua;
		Integer numero;
		String bairro;
		String cidade;
		String cep;

		Endereco(String nomeDaRua, Integer numero, String bairro, String cidade, String cep) {
			this.nomeDaRua = nomeDaRua;
			this.numero = numero;
			this.bairro = bairro;
			this.cidade = cidade;
			this.cep = cep;
		}

		public String getNomeDaRua() {
			return nomeDaRua;
		}

		public void setNomeDaRua(String nomeDaRua) {
			this.nomeDaRua = nomeDaRua;
		}

		public Integer getNumero() {
			return numero;
		}

		public void setNumero(Integer numero) {
			this.numero = numero;
		}

		public String getBairro() {
			return bairro;
		}

		public void setBairro(String bairro) {
			this.bairro = bairro;
		}

		public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

		public String getCep() {
			return cep;
		}

		public void setCep(String cep) {
			this.cep = cep;
		}

		@Override
		public String toString() {
			return "Endereco [nomeDaRua= " + nomeDaRua +
					", numero=" + numero +
					", bairro=" + bairro +
					", cidade=" + cidade +
					", cep=" + Utils.formatCep(cep);
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (!(o instanceof Endereco endereco)) return false;
            return Objects.equals(nomeDaRua, endereco.nomeDaRua) &&
					Objects.equals(numero, endereco.numero) &&
					Objects.equals(bairro, endereco.bairro) &&
					Objects.equals(cidade, endereco.cidade) &&
					Objects.equals(cep, endereco.cep);
		}
	}
	
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

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof Pessoa pessoa)) {
			return false;
		}

        return Objects.equals(nome, pessoa.nome) &&
				Objects.equals(nascimento, pessoa.nascimento) &&
				Objects.equals(endereco, pessoa.endereco);
	}
}
