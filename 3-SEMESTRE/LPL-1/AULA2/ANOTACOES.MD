    # Abstração

- Ato de pensar na situação problema e extrair as partes essenciais de um todo, ignorando as características menos importantes

## Classe

- Uma classe é uma forma de definir um tipo de dado em uma linguagem OOP. Uma classe é composta por dados (atributos) e comportamentos (métodos)
- Exemplos: Byte, Short, Integer, Long, Float, Double, Boolean e Character.
- Primeira letra maiuscula, qualificador de acesso public, palavra chave class.
- Os qualificadores de acesso são responsáveis por controlar a visibilidade dos métodos, atributos ou até mesmo da classe em outros pacotes ou arquivos.

## Encapsulamento

- O encapsulamento consiste em restringir o acesso externo aos atributos da classe. Para atingir esse conceito, no Java são utilizados os qualificadores de acesso, como `public`, `private` e `protected`.
- Esse conceito permite que os dados de uma classe sejam projegidos, ou seja, para que eles sejam definidos é necessário um método que pode conter regras de negócio, validações ou apenas a atribuição do dado recebido por parâmetro para o atributo da classe.
- Além disso, o caminho inverso segue a mesma ideia, podemos fazer transformações com o atríbuto na hora de resgatar ele com o método `get`
    ```java
    public class Aluno {
        private nome String;
        private idade Integer;
      

    }
    ```

## Atributos

- Definem as características de uma classe, existem dois tipos de atributos: classe ou objeto.
- Exemplo:
    ```java
    public class Aluno {
        private nome String;
        private idade Integer;

        public String getNome(){
            return this.nome;
        }

        public Integer getIdade() {
            return this.idade;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setIdade(Integer idade) {
            this.idade = idade;
        }
    }
    ```

## UML

- São diagramas utilizados para representação de modelagens utilizadas no desenvolvimento orientado a objetos.
- Também servem para representarmos as classes de um determinado pacote.

## Método construtor

- Serve para evitar a criação de objetos com atributos nulos.
- O método construtor **NAO POSSUI RETORNO**
- O método construtor tem o nome **IGUAL AO NOME DA CLASSE**
- A assinatura do construtor é definida pelos **PARÂMETROS**
- Caso um construtor seja definido, o construtor padrão para de funcionar, se desejarmos que uma classe tenha um construtor personalizado e ter também o construtor padrão, devemos criar o construtor padrão de forma explicíta.
- Uma classe pode ter vários construtores.
- Uma classe sem construtores possuí automaticamente um construtor padrão.
- Servem para ditarmos qual é a regra de negócio ou o que é necessário para criar uma classe, um modelo de um negócio. Isso permite que a nossa intenção fique explicita sem o desenvolvedor precisar acessar a classe.

## Métodos

- A assinatura de um métodos é composta por:
    - Qualificador de acesso
    - Tipo de retorno
    - Nome
    - Argumentos

## Polimorfismo

- Capacidade de um objeto assumir diversas formas, como por exemplo a sobrecarga de objetos.
    - EXEMPLO DE SOBRECARGA
    ```java
    class Aluno {

        private String nome;

        public Aluno() {

        }

        public Aluno(String nome) {
            this.nome = nome;
        }
    }
    ```
    - Exemplo de SOBRESCRITA
    ```java
    class Aluno {
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("Nome: ");
            builder.append(nome);
            builder.append(" Idade: ");
            builder.append(idade);
            return builder.toString();
        }
    }
    ```






