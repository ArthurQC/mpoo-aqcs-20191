import java.util.Date;
public class Application {

	public static void main(String[] args) {
		
		Date data = new Date();
		Professor matriculaProfessor= new Professor();
		matriculaProfessor.setAdmissao(data);
		
		Endereco enderecoProfessor = new Endereco();
		enderecoProfessor.setRua("Aguazinha");
		enderecoProfessor.setNumero(123);
		enderecoProfessor.setComplemento("apto 404");
		enderecoProfessor.setCidade("Recife");
		
		Matricula matriculaUsuario1 = new Matricula();
		matriculaUsuario1.setProfessor(matriculaProfessor);
		
		Pessoa usuario1 = new Pessoa();
		usuario1.setCpf("13244567987");
		usuario1.setNome("Gabriel Alves");
		usuario1.setEndereco(enderecoProfessor);
		usuario1.setMatricula(matriculaUsuario1);
		
		System.out.println(usuario1);
		usuario1.getMatricula().imprimeMatricula();
		
		//GABRIEL AGORA VIRA ALUNO TAMBÉM:
		System.out.println("###############################");
		
		Aluno matriculaAluno = new Aluno();
		matriculaAluno.setAnoEntrada(2019);
		matriculaAluno.setPeriodoEntrada(2019.1);
		usuario1.getMatricula().setAluno(matriculaAluno);
		
		System.out.println(usuario1);
		usuario1.getMatricula().imprimeMatricula();
		
		//GABRIEL FOI DEMITIDO:
		
		System.out.println("###############################");
		
		usuario1.getMatricula().setProfessor(null);
		
		System.out.println(usuario1);
		usuario1.getMatricula().imprimeMatricula();
		
		/*ABORDAGEM UTILIZADA: 
		 * FOI CRIADA A CLASSE "MATRICULA" COMO INTERMÉDIO ENTRE A PESSOA FÍSICA 
		 * E A ATUAÇÃO DE ALUNO OU DE PROFESSOR. A HERANÇA DE "PROFESSOR" E "ALUNO" COM A CLASSE "PESSOA" FOI QUEBRADA E AGORA A CLASSE 
		 * PESSOA TEM O ATRIBUTO MATRICULA, QUE POR SUA VEZ TEM COMO ATRIBUTOS "ALUNO" E "PROFESSOR".
		 * ASSIM UMA PESSOA PODE ESTAR MATRICULADA APENAS COMO PROFESSOR, APENAS COMO ALUNO, OU COMO PROFESSOR E ALUNO AO MESMO TEMPO. */
	}

}

