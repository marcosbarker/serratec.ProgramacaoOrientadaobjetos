package pessoal;

public class Gerente extends Funcionario {

	private int numFuncionarios;

	public int getNumFuncionarios() {
		return numFuncionarios;
		
	}

	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
		
	}

	@Override
	public double getBonificacao() {
		return this.salario * 0.15;
		
	}

	@Override
	public String toString() {
		// return "Gerente: "+ this.nome;
		return "Gerente\n\tnumFuncionarios=" + numFuncionarios + ", \n\tnome=" + nome + ", \n\tsalario=" + salario
				+ ", \n\tcpf=" + cpf;
		
	}

}