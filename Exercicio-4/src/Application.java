import java.util.Date;

public class Application {

	public static void main(String[] args) {
		Professor professor1 = new Professor();
		Date date = new Date();
		Endereco enderecoProfessor = new Endereco();
		
		professor1.setNome("Gabriel Alves");
		professor1.setCpf("1234567");
		professor1.setAdmissao(date);
		
		
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
		professor1.setEndereco(enderecoAluno);
		
		
		
	}

}
//CRIAR MÉTODO IMPRIMIR ENDEREÇO
//CRIAR MÉTODO IMPRIMIR PESSOA
//TRANSOFRAMR ALUNO E EM PROFESSOR AO MESMO TEMPO
//EXPLICAR PORQUE E COMO FEZ PARA O PROFESSOR SER ALUNO E PROFESSOR AO MESMO TEMPO