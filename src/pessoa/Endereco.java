package pessoa;

final class Endereco {
	private String nomeDaRua;
	private Integer numero;
	private String bairro;
	private String cidade;
	private String cep;

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
	
	protected static Endereco of(String nomeDaRua, Integer numero, String bairro, String cidade, String cep) {
		return new Endereco(nomeDaRua, numero, bairro, cidade, cep);
	}
	
	@Override
	public String toString() {
		return "Endereco: [nomeDaRua= " + nomeDaRua + 
				", numero= " + numero + 
				", bairro= " + bairro + 
				", cidade= " + cidade +
				", cep= " + Utils.formatCep(cep);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj == null || !(obj instanceof Endereco)) {
			return false;
		}
			
		Endereco temp = (Endereco) obj;
		
		if(!this.nomeDaRua.equals(temp.nomeDaRua) ||
		   !this.bairro.equals(temp.bairro) || 
		   !this.cidade.equals(temp.cidade) ||
		   !this.cep.equals(temp.cep) || 
		   !this.numero.equals(temp.numero)) {
			return false;
		}
		
		return true;
	}	
}
