package conta;

public class ContaCorrente extends Conta implements ContaOnline {

	private int investimento;
	private int tarifa;

	public ContaCorrente() {
		
	}

	public int getInvestimento() {
		return investimento;
		
	}

	public void setInvestimento(int investimento) {
		this.investimento = investimento;
		
	}

	public int getTarifa() {
		return tarifa;
		
	}

	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
		
	}

	@Override
	public String toString() {
		// return "Conta Corrente: "+this.getSaldo();
		return "ContaCorrente [investimento=" + investimento + ", tarifa=" + tarifa + ", getNumero()=" + getNumero()
				+ ", getNome()=" + getNome() + ", getSobrenome()=" + getSobrenome() + ", getSaldo()=" + getSaldo()
				+ ", getCPF()=" + getCPF() + "]";
	
	}

	@Override
	public void transfereViaPix() {
		System.out.println("Transferencia via PIX");

	}

	@Override
	public void transfereViaTED() {
		System.out.println("Transferencia via TED");

	}

	@Override
	public void transfereViaDOC() {
		System.out.println("Transferencia via DOC");

	}

}