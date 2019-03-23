
public class Aluno {
	private int anoEntrada;
	private double periodoEntrada;

	public int getAnoEntrada() {
		return anoEntrada;
	}

	public void setAnoEntrada(int anoEntrada) {
		this.anoEntrada = anoEntrada;
	}

	public double getPeriodoEntrada() {
		return periodoEntrada;
	}

	public void setPeriodoEntrada(double periodoEntrada) {
		this.periodoEntrada = periodoEntrada;
	}
	public String toString() {
		return "Ano de entrada: "+this.anoEntrada+"\nPeríodo de entrada: "+this.periodoEntrada;
	}

}
