package pessoal;

public class Assistente extends Funcionario {
	private String funcionarioAssistido;

	public String getFuncionarioAssistido() {
		return funcionarioAssistido;
		
	}

	public void setFuncionarioAssistido(String funcionarioAssistido) {
		this.funcionarioAssistido = funcionarioAssistido;
		
	}

	@Override
	public String toString() {
		return "Assistente\n\tfuncionarioAssistido=" + funcionarioAssistido + ", \n\tgetNome()=" + getNome()
				+ ", \n\tgetSalario()=" + getSalario() + ", \n\tgetCpf()=" + getCpf();
		
	}

	@Override
	public double getBonificacao() {
		return this.salario * 0.10;
		
	}

}