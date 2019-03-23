
import java.util.Date;

public class Professor extends Pessoa {
	private Date admissao;

	public void setAdmissao(Date admissao) {
		this.admissao = admissao;
	}

	public Date getAdmissao() {
		return admissao;
	}
	public void imprime() {
		System.out.print(this);
		System.out.println("Data de admissão: "+this.admissao);
		System.out.println(this.getEndereco());
	}
}
