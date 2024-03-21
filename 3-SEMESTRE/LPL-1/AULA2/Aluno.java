package AULA2;

public class Aluno extends Pessoa {
    
    private String curso;

    public Aluno () {
        /*
         * Estamos definindo os dados no construtor para evitar erros em tempo de execução, pois podemos ter objetos nulos que vão gerar uma Exceção.
         */
        super();
        this.curso = "";
    }

    public Aluno (String nome, Integer idade, String prontuario, String curso) {
        super(nome, prontuario, idade);
        this.curso = curso;
    }


    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso(String curso) {
        return this.curso;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Nome: ");
        builder.append(this.nome);
        builder.append(" Idade: ");
        builder.append(this.idade);
        return builder.toString();
    }
}
