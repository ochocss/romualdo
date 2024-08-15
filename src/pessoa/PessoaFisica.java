package pessoa;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa {
	private String cpf;
	
	public PessoaFisica() {super();}
	public PessoaFisica(String nome, LocalDate nascimento, String cpf, String nomeDaRua, Integer numero, String bairro, String cidade, String cep) {
		super(nome, nascimento, nomeDaRua, numero, bairro, cidade, cep);
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + Utils.formatCpf(cpf) + ", " + super.toString() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(!super.equals(obj) || !(obj instanceof PessoaFisica)) {
			return false;
		}
		
		PessoaFisica temp = (PessoaFisica) obj;
		if(!this.cpf.equals(temp.cpf)) {
			return false;
		}

		return true;
	}
}
