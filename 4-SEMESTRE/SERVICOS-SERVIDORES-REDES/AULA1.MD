# Avaliação

- MF = (P1 * 0.7 + MA * 0.3)
- MA: Atividade avaliativa
- P1: Prova individual
    - Duas tentativas de prova
    - Terceira vez é IFA
    - DHCP (30, 40 e faixas de rede)
    - DNS
    - HTTP

# OBS

- Cisco: Curso disponibilizado no email institucional

## Modelo X Arquitetura de Rede

- Modelo é uma referência da implementação
- Primeiro modelo criado pela IBM.
    - Com quantas camadas resolvemos o problema?
    - Dividir o problema em pedaços
    - Foi decidido que o modelo teria 7 camadas  
    - Denominado SNA em 1969.
    - Ideia de padronizar o modelo de rede no inicio dos anos 80.
    - Surge-se o modelo OSI, com 7 camadas.
    - Frente a decisão de 7 camadas, foi criado o modelo de 4 camadas que mais tarde seria chamado de modelo TCP/IP.
    - A IBM criou o modelo OSI e implementou o modelo OSI, mas isso não foi pra frente.
    - **Arquitetura é quando tem protocolo, o modelo é quando temos a referência**
    - Modelo DODI (4 Camadas) -> Modelo da INTERNET (5 Camadas) 
    - O que mais evolui é a camada de FISICA e ENLANCE
- Modelo é conceitual
- Arquitetura é a implementação do modelo
    - Detém os protocolos de rede.
- Modelo ISO/OSI
    - Aplicação
    - Apresentação
    - Sessão
    - Transporte
    - Rede
    - Fisica
- Modelo DOD
    - Application
    - Host to Host
    - Internetworking (internet)
    - Network Access
- Modelo da Internet
    - Aplicação
    - Transporte
    - Rede
    - Enlance
    - Física
- Arquitetura da Internet (Protocolos)
- **Serviços de Rede** => Protocolo da camada de **Aplicação**
- Referência:
    Modelo      Arquitetura da Internet
    Aplicação   HTTP / FTP / DHCP / TELNET / SSH / SSH / NFS / SMTP / DNS
    Transporte  TCP / UDP
    Rede        IP / IPV4 / IPV6
    Enlace  
    Fisica
- Aplicações - Serviços de Rede na Arquitetura da **Internet seguem um modelo cliente / servidor**
    - DHCP Server / DHCP Client
    - DNS Server / DNS Client
    - HTTP Server / HTTP Client
- Protocolo: Conjunto de regras
- Arquitetura da Internet também é chamada de arquitetura TCP/IP

====================================================================================================
HTTP/FTP/DHCP/TELNET/SMTP               ***                         TFTP/Voip/SIP
====================================================================================================
------------------TCP------------------ *** --------------------------UDP---------------------------
-> Orientado a conexão                  *** -> Connectionless
-> Statefull (preocupado com cliente)   *** -> Stateless
-> Confiável                            *** -> Unreliable
-> Mais overhead                        *** -> Menos overhead
-> TCP é tudo de bom                    *** -> UDP é tudo de mal
====================================================================================================
--------------------------------------------IP-----------------------------------------------------              
====================================================================================================
Enlance + Fisica           
====================================================================================================

## Endereçamento IP

- Endereço Lógico da Camada 3 que identifica a rede e do nó (Host)
- Existem duas versões do endereçamento IPV4 e IPV6
    - IPv4 possui 32 Bits
        - 4 Bytes, 4 Octetos e são separados por ponto
        - Exemplo: 1010 0000 . 1111 1111 . 0000 0000 . 0000 0010
        - Exemplo: 1111 1111 . 0000 1111 . 1111 1010 . 1111 1110
        - Convenção - Notação Decimal onde cada Octeto é separado por ponto
            - 1 Octeto => 1 Byte => 8 Bits => 2^8 => 256
            - 0000 0000 -> 0 até 1111 1111 ->255
            - 0-255 . 0-255 . 0-255 . 0-255
        - Regras de Endereço IP
            1. Regra do primeiro octeto
                - 0XXX XXXX <->  0  até 127 <-> Classe A <-> Unicast
                - 10XX XXXX <-> 128 até 191 <-> Classe B <-> Unicast
                - 110X XXXX <-> 192 até 223 <-> Classe C <-> Unicast
                - 1110 XXXX <-> 224 até 235 <-> Classe D <-> Multicast 
                - 1111 XXXX <-> 236 até 255 <-> Classe E <-> Reservada
            2. Máscara de Subrede
                - AND Lógico do IP com a **MASCARA** para descobrir qual a **REDE**
                - Máscara de Subrede Default (pensando nas classes)
                    - Classe A
                        - 255.0.0.0/8      (8 Bits de subrede)  <-> 1 Octeto para **REDE** e 3 Octetos **para HOST**
                    - Classe B
                        - 255.255.0.0/16   (16 Bits de subrede) <-> 2 Octeto para **REDE** e 2 Octetos **para HOST**
                    - Classe C
                        - 255.255.255.0/24 (16 Bits de subrede) <-> 3 Octeto para **REDE** e 1 Octetos **para HOST**s







    - IPv6 possudi 128 Bits



















