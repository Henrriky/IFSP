# Concorrência e paralelismo

## Threads

### Exemplo sem Threads

- Quando executamos por exemplo o cálculo dos números primos de um intervalo muito grande sem Threads, ao utilizar botões do JFrame o botão fica travado pois ele executa na mesma Thread que a classe que processa os números primos.
- Exemplo do Slide sem Thread


### Exemplo com Threads

- Uma solução para o problema acima é utilizar `Threads` e jogar esse processamento para segundo plano. Para fazer isso é necessário criar uma classe que extende a classe `Thread`, aonde deve ser implementado o método `run()`, que executa o processamento de forma separada.
- Em véz de adicionar o cálculo no método de tratamento de eventos `actionPerformed`, essa nova classe vai instanciar uma thread através da classe `Calculo` criada que extende de `Thread`
- O método run da classe cálculo separa o processamento em outra thread, enquanto o tratamento da interface pode prosseguir com sua thread padrão.
- Uma variação disso é utilizar **Classes anônimas**, que podem ser definidas e instânciadas ao mesmo tempo. Para fazer isso, é necessário utilizar expressões lambdas com o código que deverá ser executado dentro, essa expressão funciona como se fosse o run e após sua definição poderá ser chamado o método `start()` dela.

### Classes anônimas

- A **Classe Anônima** é uma classe interna sem nome, que é uma subclasse de uma outra classe ou que implementa uma interface. Seu principal objetivo é instânciar um único objeto, evitando a declaração de uma classe apenas para atender uma necessidade especifica no códgo.
- As classes anônimas são alcançadas através de **expressões lâmbdas**, que são metodos sem declaração, que pode ser usado como parâmetro de entrada na chamada de outro método ou como valor de retorno de outro método

### Interface Runnable

- As threads também podem ser definidas através da interface **Runnable**
- Essa interface precisa da implementação do método `run`, que conterá o código que vai ser executado pela Thread. Esse interface precisa ser implementada pois a classe `Thread` utiliza essas implementações para jogar o processamento para uma thread separada.