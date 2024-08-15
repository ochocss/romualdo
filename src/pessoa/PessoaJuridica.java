package pessoa;

import java.time.LocalDate;

public class PessoaJuridica extends Pessoa {
	private String nomeFantasia;
	private String cnpj;

	public PessoaJuridica() {super();}
	public PessoaJuridica(String nome, LocalDate nascimento, String cnpj, String nomeFantasia, String nomeDaRua, Integer numero, String bairro, String cidade, String cep) {
		super(nome, nascimento, nomeDaRua, numero, bairro, cidade, cep);
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	@Override
	public String toString() {
		return "PessoaJuridica [nomeFantasia=" + nomeFantasia + ", cnpj="
			   + Utils.formatCnpj(cnpj) + ", " + super.toString() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(!super.equals(obj) || !(obj instanceof PessoaJuridica)) {
			return false;
		}
		
		PessoaJuridica temp = (PessoaJuridica) obj;
		if(!this.cnpj.equals(temp.cnpj) || !this.nomeFantasia.equals(temp.nomeFantasia)) {
			return false;
		}

		return true;
	}
}
