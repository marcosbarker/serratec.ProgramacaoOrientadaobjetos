package conta;

import exception.ContaException;

public abstract class Conta {
	private int numero;
	private String nome;
	private String sobrenome;
	private double saldo;
	private static int totalDeContas;

	private String CPF;

	public Conta() {
		totalDeContas++;

	}

	public static int getTotalContas() {
		return totalDeContas;
	
	}

	public static int incrementaTotalContas() {
		return totalDeContas++;
	
	}

	public boolean sacar(double valor) {
		if (this.saldo < valor) {
			return false;
			
		} else {
			this.saldo = this.saldo - valor;
			return true;
			
		}
	}

	public boolean transfere(Conta destino, double valor) {

		boolean retirou = this.sacar(valor);
		if (retirou) {
			// não deu pra sacar!
			destino.depositar(valor);
			return true;

		} else {
			return false;
			
		}
	}

	public double depositar(double valor) {
		this.saldo = this.saldo + valor;
		return this.saldo;

	}

	public int getNumero() {
		return numero;

	}

	public void setNumero(int numero) throws ContaException {
		if (numero <= 0)
			throw new ContaException("Número da conta não pode ser menor ou igual a zero!");
		this.numero = numero;

	}

	public String getNome() {
		return nome;

	}

	public void setNome(String nome) {
		this.nome = nome;

	}

	public String getSobrenome() {
		return sobrenome;

	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;

	}

	public double getSaldo() {
		return saldo;

	}

	public String getCPF() {
		return CPF;

	}

	public void setCPF(String cPF) {
		CPF = cPF;

	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", nome=" + nome + ", sobrenome=" + sobrenome + ", saldo=" + saldo
				+ ", totalDeContas=" + totalDeContas + "]";

	}

}