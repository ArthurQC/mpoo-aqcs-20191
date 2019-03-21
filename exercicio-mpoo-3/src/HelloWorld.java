
public class HelloWorld {
	public String nome;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void imprimir() {
		HoraFormatada hf = new HoraFormatada();
		System.out.println(hf.hora()+" - "+
				"Olá " + this.getNome() + 
				". Você acabou de fazer seu primeiro Hello World em Java. Parabéns.");
	}
}
