
public class Matricula {
	Professor professor;
	Aluno aluno;

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public void imprimeMatricula() {
		System.out.println("Matrícula: \n");
		if (professor != null) {
			System.out.println("Professor: \n"+this.professor);
		}
		if (aluno != null) {
			System.out.println("Aluno: \n"+this.aluno);
		}
	}

}
