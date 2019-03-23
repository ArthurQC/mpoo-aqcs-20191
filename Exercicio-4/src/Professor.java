
import java.util.Date;

public class Professor {
	private Date admissao;

	public void setAdmissao(Date admissao) {
		this.admissao = admissao;
	}

	public Date getAdmissao() {
		return admissao;
	}
	public String toString() {
		return "Data de admissão: "+this.admissao;
	}
}
