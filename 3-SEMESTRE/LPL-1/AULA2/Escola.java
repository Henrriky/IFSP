package AULA2;
import java.util.HashMap;

class Escola {

    private String nome;
    private HashMap<String, Aluno> alunos;
    private HashMap<String, Professor> professores;
    private String telefone;
    private String salas;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(String nome) {
        return this.nome;
    }

    public void adicionarAluno (Aluno aluno) {
        this.alunos.put(aluno.getProntuario(), aluno);
    }

    public void removerAluno (Aluno aluno) {
        this.alunos.remove(aluno.getProntuario());
    }

    public void adicionarProfessor (Professor professor) {
        this.professores.put(professor.getProntuario(), professor);
    }

    public void removerProfessor (Professor professor) {
        this.professores.remove(professor.getProntuario());
    }
}