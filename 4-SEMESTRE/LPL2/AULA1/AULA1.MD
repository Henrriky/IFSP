# Critérios de avaliação 

- Avaliação 1 (A1)
- Avaliação 2 (A2)
- Atividades semanais (NP)
- Cálculo: MF = (A1 * 0.4) + (A1 * 0.4) (NP * 0.2)

# Softwares

- Java SE Development Kit
- Apache Tomcat
- Eclipse IDE
- MySQL Community Server

# Tópicos avançados de arquitetura de plataforma

## Gerenciamento de memoria

- Não é preciso no Java trabalhar com o gerenciamento de memória, pois esse trabalho é feito pela JVM com o mecanismo de gerenciamento de memória chamado de Garbage collector, desalocando a memória alocada anteriormente não mais referenciados.

## Memoria Stack

- Armazenam valores de tipo primitivo como int, float, chamada de métodos e referência de objetos.
- Armazenam referências (ponteiros) para objetos na memória HEAD.
    - Referência para um valor na memória HEAP
- Se comporta como uma pilha.
- Quando um método finaliza sua execução, todas as variáveis do seu escopo deixam de existir na stack, logo a memória é desalocada.

### Limites

- O tamanho da memoria stack depende da versão da JVM e do sistema operacional, mas costuma ser 1MB para 64Bits
- O valor da Stack pode ser alterado com o argumento `-Xss2m`, onde m significa 2MB

### Memória Stack em Threads

- Cada Thread tem uma **Memória Stack**. O espaço de memória não é compartilhada
    - Exemplo: 10 Threads * 1MB = 20MB.

### Prova real da Stack

- Método recursivo infinito: Exception StackOverflowError

## Memoria HEAP

- Na memória HEAP são armazenados os objetos do programa.
- Outra diferença é que a Heap **utiliza um espaço muito maior**, o qual é compartilhado entre todas as **threads da aplicação**
- Devido a esse tamanho, surgiu a necessidade de desalocar espaços de memórias que não estão mais sendo utilizados, como objetos não referenciados, isso é feito através do GB.
- Pode ser definido o limite pela IDE ou via CLI, com `-Xms256m` ou `-Xms512m`

### Prova real do Heap

- Criar um programa que instancia e armazena objetos infinitamente: Exception in Thread OutOfMemoryError: Java Head space

## Memorias HEAP e Stack

- Referência do objeto na memória Stack.
- ArrayList e String ficam na memória Heap.
- Essa estrutura visa ocultar do programador o uso de ponteiros, que é feito pela JVM.
- Imagens do slide da aula

## Garbage Collector

- Fica na JVM.
- Varre periodicamente os objetos que não estão sendo mais usados
    - Não estão sendo mais usados: a referência do objeto na stack não existe mais.
    - Um objeto que não está sendo mais referênciado pela Stack é marcado para que o GB possa limpar ele posteriormente, ou seja, ele fica lá até a proxima execução do GC.

### Performance do GB

- Como a memoria HEAP é um grande espaço, existem muitos objetos a serem removidos a todo mometo, seria muito custoso executador o GB em poucos intervalos de tempo
- Ferramenta de visualização do gerenciamento de memória: `VisualVM`
    - Young Generation: 
        - **Eden**, **S0**, **S1**, que são os menores espaços da memória HEAP
        - S0 e S1 são sobreviventes da varredura do GB.
            - Exemplo: 2 Objetos que ainda possuem referências vão do Eden para o S0, na proxima vai para o S1 e assim por diante.
            - Objetos que alternam por muito tempo entre S0 e S1 vão para a `Old Generation`
    - Old Generation:
        - Muitas das vezes são objetos referênciados por threads e que demoram para perder a referência
        - Fazer a varredura na Old Generation é mais custoso, pois ela tem um espaço maior que a `Young Generation`. 
        - Na limpeza desse espaço `Old Generation` a aplicação é "pausada" (Stop thr World), gerando lentidão na aplicação
    - Metaspace
        - Espaço que fica fora da memoria HEAP e serve para armazenar classes
        - Não possui limite e pode crescer conforme a necessidade
        - Pode ser parametrizado através da CLI da JVM.

## Class Object

- Pertence ao pacote `java.lang`
- É a `superclasse` de todas as classes.
- Extends Object é uma redundância.
- Herdam os métodos genéricos da classe Object, como `equals`, `hashCode`, `toString`, `notify`, `notifyAll` e `await`
    - Referência da DOCS no Slide
    - equals(): compara a referência na memória dos dois objetos
    - hashCode(): Retorna um identificador univoco do objeto na memoria, é usado pelo equals
    - Outros métodos no SLIDE
    - finalize(): Vai ficar na memoria ainda o objeto, pois o GB só passa depois, por isso foi obsoleto no Java.

### Clonagem de objetos

- [https://docs.oracle.com/javase/8/docs/api/java/lang/Cloneable.html]
- Usada para criar uma copia de um objeto para diferenciar ambos na memoria.
- Fazer a copia dele manualmente demanda muito código.
- Será necessário implementar a interface Cloneable, com os métodos `clone()`.
    - Esse método clone() pode disparar uma exceção CloneNotSupportedException e deve ser tratada para cada chamada de clone().
    - O clone de dois objetos vão gerar HashCode diferentes na implementação padrão, pois os endereços de memória são diferentes.
    - É necessário fazer o casting da classe object para a classe do objeto desejado.

### Comparação de Objetos

[https://docs-oracle-com.translate.goog/javase/8/docs/api/java/lang/Comparable.html?_x_tr_sl=en&_x_tr_tl=pt&_x_tr_hl=pt-BR&_x_tr_pto=sc]
- Usado para comparar se dois objetos são iguais através de `equals()`
- O método padrão da classe object utiliza o hashCode para comparação de dois objetos, que utiliza o endereço de memória para comparar ambos.
- Caso a gente queira comparar os valores, é necessário sobrescrever o método `equals()`, que deve retornar true ou classe.

# Exercicios

