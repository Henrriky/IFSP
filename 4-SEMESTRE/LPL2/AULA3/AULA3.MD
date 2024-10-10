# Comunicação através da rede

- Conceitos de comunicação em redes
- Sockets
- Exemplos:
    - Troca de Mensagem
    - Transferência de Arquivos
    - Servidor Multithread.

## Conceitos de comunicação em rede

- Protocolo TCP/IP
    - Utilização de infraestrutura de servidores através de um modelo cliente servidor
    - Para viabilizar a comunicação entre as máquinas, são necessário os protocolos que contem as regras que ditam como será feita a troca de dados
- Endereço IP: Identificador único do dispositivo, o qual é atribuido a cada servidor ou dispositivo existente em uma rede
    - 4 Octetos que vão de 0 a 255 cad aum
    - Exemplo: www.ifsp.edu.br poderia ser 207.46.250.119
    - Envio dos dados Origem -> Pacotes (Contém cabeçalho com o endereço IP) -> Roteadores/Gateways -> Desempacotamento dos dados -> Recebimento de dados (destino)
    - Em Java, a classe InetAddress é usada para representar os endereços IP. A aplicação a seguir usa essa classe para obter o endereço IP e o nome do dispositivo na rede interna.
    - SLIDE
- Portas: Uma única máquina pode executar diversas aplicações que utilizam diferentes portas. Para evitar a entregha indevida de mensagens, os serviços são diferenciados por meio de portas, que são números associados internamento a cada serviço (PID) pela máquina
    - Algums exemplos de serviços baseado em protocolos, usados pelo protocolo TCP/IP, e suas respectivas portas
        - FTP: 20 e 21
        - HTTP: 80
        - SMTP: 25
- Troca de dados confiável e não confiável
    - O protocolo IP também é combinado com o protocolo de transporte (UDP e TCP). 
        - TCP é orientado a conexão, confiável e possui confirmação do recebimento das mensagens.
            - Pacotes são ordenados para compor a mensagem original
        - UDP não é orientado a conexão e não confiável (não possui confirmação de recebimento das mensagens)
            - Pacotes podem ser perdidos e não seguem a ordem do envio
    - A **troca confiável** utiliza o mecanismo de **sockets**, que utiliza operações de transmissão e recepção das mensagens de forma similar às operações com arquivos, que são baseados em **Streams** de dados
        - Sockets são necessários quando se deseja garantir o recebimento de mensagens, e existe um protocolo forma envolvido em que as ações do transmissor são determinados conforme a resposta do receptor. Exemplo: FTP e SMTP
    - A **troca não confiável** possi menos overhead e utiliza **Datagramas**, mensagens independentes que podem ser enviadas pela rede, onde não existe o ACK, garantia de tempo de chegada ou integridade de conteúdo.
        - A ausência de confirmação de entrega dos datagramas faz com que esse mecanismo teha um desempenho melhor, o que torna esse protocolo IDEAL para aplicações que transmitem grande volume de dados mas admitem perda de pacotes entre os lados. Exemplo: serviços de streaming e aplicações VoIP

## Sockets

- Os **sockets** estabelecem um canal de comunicação entre duas máquinas conectadas via rede **TCP/IP**. Cada canal define um **fluxo de dados**, que permite gravar (write) e receber (read) dados em formato textual ou binário.
- A comunicação entre os sockets é **bidirecional**.
- Uma aplicação que trabalha com **Sockets** possui três partes> Servidor, Cliente e Recursos
    - Host Local:
        - Servidor: Guarda e aceita pedidos de conexões feitos por clientes e criam uma thread para processar cada conexão aceita
        - Cliente: Estabelece a comunicação
    - Host remoto
        - Cliente
- Em Java: Socket e Server Socket

### Implementação em Java


#### Classe Socket

- Classe usada par implementar os **endpoints** para a acomunicação entre máquinas.

#### Classe Server Socket

- Usada para armazenar os pedidos de conexão
- O construtr recebe a porta que vai ficar aguardando conexão, o número de conexões pendentes que poderão ficar na fila do socket do srvidor.
- O `accept` permite aceitar os pedidos de conexão, retornando o `Socket`
- O `getInetAddress` retorna o endereço IP local do server socket ou o número da porta local em que server socket está esperando 

#### Exemplo de Troca de Mensagens

- Troca de mensagens entre computadores por meio de duas aplicações distintas
- Aplicação servidor fica aguardando o pedido de conexão e após aceitar envia uma mensagem de sucesso, finalizando a conexão.
- Como o servidor é single thread, o servidor fica bloqueado até que o processamento da conexão seja finalizada.
- Passos Servidor:
    1. Criar um ServerSocket em uma determinada porta
    2. Criar um while(true) que fica aguardando uma conexão através do método `accept()`
    3. Após receber uma conexão, recebe um `Socket`
    4. Criar um `ObjectOutputStream`, passado o `OutputStream` do cliente
    5. Chamar método flush, para liberar o fluxo de gravação dos dados, writeObject para escrever dados e close para fechar a conexão.
    6. Depois de finalizar o fluxo de execução da conexão, a próxima conexão poderá ser processada.
- Passos lado cliente:
    1. Criar um `Socket`, passando o endereço do servidor remoto (127.0.0.1:3000)
    2. A criação do `Socket` fica agurdando até que a conexão seja aceita pelo servidor
    3. Criar um `ObjectInputStream` que vai permitir a leitura das mensagens através do `Socket` client.
    4. Criar um `do while` que fica lendo as mensagens até que seja enviado um texto "EOT".

#### Exemplo de transferência de arquivos

- Troca de arquivos entre computadores com duas aplicações diferentes
- Uma conexão para enviar o nome do arquivo
- Uma conexão para enviar o conteúdo do arquivo (binário)
- Criação de dois sockets
    - Uma para receber o nome e o formato do arquivo
    - Outra para receber o binário do arquivo
- Passo EnviaArquivo:
    1. Criar um Socket para o servidor 127.0.0.1 na porta 1234
    2. Criar um Socket para o servidor 127.0.0.1 na porta 1235
    3. Usar a classe File para ler um arquivo na raiz do projeto
    4. Criar um canal de saida, através da classe `PrintWriter`