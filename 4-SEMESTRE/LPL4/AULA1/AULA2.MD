# Concorrência e paralelismo

## Conceitos sobre concorrência e paralelismo

- Nos sistemas operacionais antigos que eram monotarefas, não era possível realizar mais de uma tarefa ao mesmo tempo.
- A solução para esse problema foi permitir que o processador suspendesse a execução de uma tarefa, que estivesse aguardando dados externos ou algum outro evento, e passar a executar outra tarefa.
- O mecanismo que permite alternar a **execução de uma tarefa** em um dado recurso (como processador, por exemplo) para a execução de outra tarefa no mesmo recurso é chamado de **preempção**
- OBS: A constante alternância entre as tarefas em execução faz com que a preempção seja um processo custoso para o sistema operacional. Apesar disso, sistemas preemptivos são mais produtivos, pois várias tarefas podem estar em execução no mesmo intervalo de tempo, intercalando entre si o uso dos recursos da forma mais otimizada possível.

### Estados de uma tarefa na preempção

- Uma tarefa pode estar nos seguintes estados na preempção (alternância de tarefas em um dado recurso):
    - Nova
        - A tarefa está sendo carregada na memória
    - Pronta
        - A tarefa está em memória aguardando a disponibilidade do processador para ser executada (pela primeira vez ou para ser retomada)
    - Suspensa
        - A tarefa está temporariamente suspensa por depender de dados externos ou de algum outro evento
    - Em Execução
        - O processador está executando a tarefa
    - Finalizada
        - A execução da tarefa está finalizada e pode ser removida da memória.
- **OBS: quantum é o tempo que o sistema operacional disponibiliza para que uma tarefa use o processador.
Quando o quantum de uma tarefa termina, mesmo que ela ainda não tenha terminado, seu contexto é
salvo na sua pilha de execução onde ela parou, e então ela volta para o estado “Pronta”. Quando o
escalonador de processos do sistema operacional disponibilizar novamente o processador para a tarefa,
ela volta então para o estado “Em Execução”. O escalonador é responsável por cuidar dessa fila de
tarefas e decidir quem tem prioridade, intercalando as tarefas para que o processador não fique ocioso.**

### Processos e Threads

- Um processo é um agrupamento de recursos (processador, memória, disco) que estão sendo utilizados por uma ou mais tarefas
- Os recursos são distribuidos individualmente para cada processo, isso faz com que as tarefas de um processo compartilhem memória entre si. No entanto, um **Processo A** não é capaz de usar um recurso do **Processo B**, ou seja, **PROCESSOS NÃO COMPARTILHAM SUAS MEMÓRIAS**
- As tarefas de um processo são definidas por **threads** (ou linhas de execução) dentro do **processo**
- OBS: As tarefas de um mesmo processo podem facilmente trocar informações, pois compartilham a mesma área de memória. No entanto, tarefas de processos distintos só são capazes de se comunicar com `syscalls` do `kernel`, que permitem a comunicação entre processos (IPC - Interprocess Communication)
    - * kernel: Núcleo do sistema operacional responsável pela comunicação entre o hardware e o
software de um computador

### Concorrência

- A concorrência, diferentemente do paralelismo, é a execução **intercalada** de um conjunto de tarefas em um dado **intervalo de tempo**, que podem ser alcançadas tanto através de um mesmo processo ou processos diferentes.
- No sistema operacional, o **escalonador de processos** que gerencia a **concorrência**, pausando e retomando tarefas até que todas sejam completamento executadas.
- Uma analogia é pensar que a concorrência é como uma fila de um drive thru, em que os carros estão disputando, um por vez, o "recurso" do atendimento. No entanto, nessa analogia se trata de um Drive Thru diferente, o qual cada carro tem um **Tempo Máximo** que pode ficar no atendimento. Passado esse tempo, o carro volta para a fila para dar a oportunidade para o próximo carro da fila.
- Concorrência é sobre lidar com várias coisas em um mesmo intervalo de tempo. 
- Paralelismo é sobre fazer várias coisas ao mesmo tempo. (Rob Pike, um dos criadores da linguagem Go

### Paralelismo

- O paralelismo consiste na execução simultanea de tarefas.
    - Uma analogia é pensar que  o paralelismo é  um pedágio que permite que carros avancem em diferentes fluxos simultâneamente
    - A quantidade de **tarefas paralelas possíveis** depende da quantidade de núcleos (cores) do processador.
    - Do ponto de vista de um processador, com três núcleos, um processo poderia ter, por exemplo, três **threads** rodando simultâneamente, uma em cada núcleo.
- O paralelismo é um superconjunto da concorrência, ou seja, utilizar ele implica nela, pois cada thread paralela também é concorrente, já que os poucos núcleos estão sendo disputados por muitas threads.
- Quem é responsável por gerenciar qual thread cada núcleo vai executar em um dado momento é também o **Escalonador de Processos**

## Threads

- A Thread é um fluxo sequencial de execução dentro de um programa ou de um **contexto de execução**, que envolve memória, processador, software e outros recursos.
- Cada Thread representa um conjunto definido de instruções do programa. No entanto, em um dado momento, o processamento do programa pode dar-se de forma simultânea em várias frentes, uma para cada Thread ativa, definindo fluxos independentes para tarefas especificas.
- Aplicações que implementam Thread com um único fluxo de execução é chamado de **Single Thread** e aquelas com múltiplos fluxos **Multi Threads**.
- **As threads são usadas para tornar um programa mais eficiente em várias situações.
Um exemplo seria o uso de threads para garantir que a interface fique disponível
para o usuário, enquanto a aplicação executa uma tarefa em segundo plano.**

### Cuidados com Threads

- Deve-se estabelecer uma divisão do trabalho em **tarefas menores** que possam ser executadas de forma paralela, e considerando a dependência entre elas.
- Caso os parâmetros de entrada de um cálculo dependem de cálculos anteriores, então esses cálculos devem ser feitos **sequencialmente** e não de forma paralela.
- Caso um recurso do sistema (arquivo, dispositivo, etc) for acessado para escrita por várias **Threads**, então será necessário **sincronizar** essas operações para evitar a corrupção e comportamentos inesperados nos dados. De forma resumida, é necessário que o recurso seja usado por uma thread por vez.
- O comportamento das Threads dependem diretamento da implementação no sistema operacional, então é sempre bom avaliar e testar bem as implementações.
- No **Java**, existem duas formas básicas de utilizar Threads: por meio da classe **Thread** e por meio da interface **Runnable**

### Threads em Java

#### Exemplo sem Threads

- Quando executamos por exemplo o cálculo dos números primos de um intervalo muito grande sem Threads, ao utilizar botões do JFrame o botão fica travado pois ele executa na mesma Thread que a classe que processa os números primos.
- Exemplo do Slide sem Thread


#### Exemplo com Threads

- Uma solução para o problema acima é utilizar `Threads` e jogar esse processamento para segundo plano. Para fazer isso é necessário criar uma classe que extende a classe `Thread`, aonde deve ser implementado o método `run()`, que executa o processamento de forma separada.
- Em véz de adicionar o cálculo no método de tratamento de eventos `actionPerformed`, essa nova classe vai instanciar uma thread através da classe `Calculo` criada que extende de `Thread`
- O método run da classe cálculo separa o processamento em outra thread, enquanto o tratamento da interface pode prosseguir com sua thread padrão.
- Uma variação disso é utilizar **Classes anônimas**, que podem ser definidas e instânciadas ao mesmo tempo. Para fazer isso, é necessário utilizar expressões lambdas com o código que deverá ser executado dentro, essa expressão funciona como se fosse o run e após sua definição poderá ser chamado o método `start()` dela.

#### Classes anônimas

- A **Classe Anônima** é uma classe interna sem nome, que é uma subclasse de uma outra classe ou que implementa uma interface. Seu principal objetivo é instânciar um único objeto, evitando a declaração de uma classe apenas para atender uma necessidade especifica no códgo.
- As classes anônimas são alcahttps://tldp.org/LDP/tlk/ipc/ipc.html

- As threads também podem ser definidas através da interface **Runnable**
- Essa interface precisa da implementação do método `run`, que conterá o código que vai ser executado pela Thread. Esse interface precisa ser implementada pois a classe `Thread` utiliza essas implementações para jogar o processamento para uma thread separada.
- Essa interface é útil para que a gente possa extender de uma classe especifica sem ter que usar a classe `Thread`, como por exemplo extender a classe `JPanel` e ser capaz de utilizar ele em uma Thread com a interface `Runnable`, pois assim será possível passar essa implementação como argumento para a instânciação da classe `Thread`

# Referências

- Inter Process Communication: https://tldp.org/LDP/tlk/ipc/ipc.html
- Classe Thread: https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html
- Interface Runnable: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Runnable.html
- Lambada Expressions: https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
- Anonymous Classes: https://www.baeldung.com/java-anonymous-classes