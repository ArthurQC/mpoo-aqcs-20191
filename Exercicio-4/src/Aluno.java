
public class Aluno extends Pessoa {
	private int anoEntrada;
	private int periodoEntrada;

	public int getAnoEntrada() {
		return anoEntrada;
	}

	public void setAnoEntrada(int anoEntrada) {
		this.anoEntrada = anoEntrada;
	}

	public int getPeriodoEntrada() {
		return periodoEntrada;
	}

	public void setPeriodoEntrada(int periodoEntrada) {
		this.periodoEntrada = periodoEntrada;
	}
	public void imprime() {
		System.out.print(this);
		System.out.println("Ano de entrada: "+this.anoEntrada);
		System.out.println("Período de entrada: "+this.periodoEntrada);
		System.out.println(this.getEndereco());
	}

}
