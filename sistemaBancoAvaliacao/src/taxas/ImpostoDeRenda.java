package taxas;

public class ImpostoDeRenda {
	private double total;

	public void adiciona(Tributavel t) {
		System.out.println("Adicionando tribut�vel: " + t);

		this.total = this.total + t.calculaTributos();

	}

	public double getTotal() {
		return total;

	}
}