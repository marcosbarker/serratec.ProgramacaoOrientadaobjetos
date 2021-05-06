package pessoal;

public class Diretor extends Funcionario {

	private double participacaoLucros;

	public double getParticipacaoLucros() {
		return participacaoLucros;
		
	}

	public void setParticipacaoLucros(double participacaoLucros) {
		this.participacaoLucros = participacaoLucros;
		
	}

	@Override
	public double getBonificacao() {
		return this.salario * 0.20 + 1000;
		
	}

	@Override
	public String toString() {
		// return "Diretor: "+ this.nome;
		return "Diretor [\n\tparticipacaoLucros=" + participacaoLucros + ", \n\tgetNome()=" + getNome()
				+ ", \n\tgetSalario()=" + getSalario() + ", \n\tgetCpf()=" + getCpf() + "\n]";
	
	}

}