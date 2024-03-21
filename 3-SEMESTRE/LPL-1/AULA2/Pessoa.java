package AULA2;

public abstract class Pessoa {
    
    protected String nome;
    protected String prontuario;
    protected Integer idade;

    public Pessoa() {
        this.nome = "";
        this.prontuario = "";
        this.idade = 1;
    }

    public Pessoa (String nome, String prontuario, Integer idade) {
        this.nome = nome;
        this.prontuario = prontuario;
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(String nome) {
        return this.nome;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public String getProntuario() {
        return this.prontuario;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getIdade() {
        return this.idade;
    }

}
