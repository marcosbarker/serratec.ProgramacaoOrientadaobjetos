package conta;

public class ContaPoupanca extends Conta {

	private int vencimento;
	private double rendimento;

	public ContaPoupanca() {
		
	}

	public int getVencimento() {
		return vencimento;
		
	}

	public void setVencimento(int vencimento) {
		this.vencimento = vencimento;
		
	}

	public double getRendimento() {
		return rendimento;
		
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
		
	}

	@Override
	public String toString() {
		return "ContaPoupanca [vencimento=" + vencimento + ", rendimento=" + rendimento + ", getNumero()=" + getNumero()
				+ ", getNome()=" + getNome() + ", getSobrenome()=" + getSobrenome() + ", getSaldo()=" + getSaldo()
				+ ", getCPF()=" + getCPF() + "]";
	
	}

}