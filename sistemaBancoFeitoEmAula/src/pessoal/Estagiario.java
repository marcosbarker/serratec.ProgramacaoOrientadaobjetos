package pessoal;

public class Estagiario extends Assistente {
	
	@Override
	public double getBonificacao() {
		return this.salario*0.10; 
		
	}

	@Override
	public String toString() {
		//return "Estagiario: "+ this.nome;
		return "Estagiario\n\tnome=" + nome + ", \n\tsalario=" + salario + ", \n\tcpf=" + cpf;
	}
	
}