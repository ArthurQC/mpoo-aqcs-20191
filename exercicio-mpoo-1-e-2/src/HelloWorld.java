
public class HelloWorld {
	public String nome;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void imprimir() {
		System.out.println(
				"Ol� " + this.getNome() + 
				". Voc� acabou de fazer seu primeiro Hello World em Java. Parab�ns.");
	}
}
