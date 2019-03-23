import java.util.Date;
public class Application {

	public static void main(String[] args) {
		Professor professor1 = new Professor();
		Endereco enderecoProfessor = new Endereco();

		professor1.setNome("Gabriel Alves");
		professor1.setCpf("1234567");
		Date data = new Date();
		professor1.setAdmissao(data);

		enderecoProfessor.setRua("Aguazinha");
		enderecoProfessor.setNumero(123);
		enderecoProfessor.setComplemento("apto 404");
		enderecoProfessor.setCidade("Recife");
		professor1.setEndereco(enderecoProfessor);

		Aluno aluno1 = new Aluno();
		Endereco enderecoAluno = new Endereco();
		aluno1.setNome("Coranggo");
		aluno1.setCpf("987654321");

		enderecoAluno.setRua("Ruella");
		enderecoAluno.setNumero(2564);
		enderecoAluno.setComplemento("apto 365");
		enderecoAluno.setCidade("Recife");
		aluno1.setEndereco(enderecoAluno);
		
		professor1.imprime();
		
		aluno1.imprime();

	}

}
//TRANSOFRAMR ALUNO EM PROFESSOR AO MESMO TEMPO
//EXPLICAR PORQUE E COMO FEZ PARA O PROFESSOR SER ALUNO E PROFESSOR AO MESMO TEMPO