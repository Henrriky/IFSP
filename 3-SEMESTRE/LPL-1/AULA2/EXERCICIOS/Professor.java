package AULA2;

public class Professor extends Pessoa {
    
    private Float salario;
    //turmas

    public void setSalario (Float salario) {
        this.salario = salario;
    }

    public Float getSalario () {
        return this.salario;
    }
}