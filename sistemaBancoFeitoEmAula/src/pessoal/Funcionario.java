package pessoal;

import exception.PessoalException;

public abstract class Funcionario implements Comparable<Funcionario> {
	protected String nome;
	protected double salario;
	protected String cpf;

	public String getNome() {
		return nome;
		
	}

	public void setNome(String nome) {
		this.nome = nome;
		
	}

	public double getSalario() {
		return salario;
		
	}

	public void setSalario(double salario) throws PessoalException {
		if (salario <= 0)
			throw new PessoalException("Salário base do funcionário não pode ser menor ou igual a zero");
		this.salario = salario;
		
	}

	public String getCpf() {
		return cpf;
		
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
		
	}

	public abstract double getBonificacao();

	@Override
	public String toString() {
		return "Funcionario\n\tnome=" + nome + ", \n\tsalario=" + salario + ", \n\tcpf=" + cpf;
	
	}

	@Override
	public int compareTo(Funcionario f) {
		return this.nome.compareTo(f.getNome());
	
	}

}