# História

- ARPANET
    - **Endereço IP**: "RG do servidor"
    - Os IP's e nome dos computadores (HOST) eram armazenados em arquivos de texto
    - Os Hosts eram buscados toda noite
    - Funcionou bem por um tempo
- O crescimento da internet
    - Esse arquivo que armazenava o ip dos hosts começou a crescer com o tempo
    - Precisava de um gerenciamento central para previnir os conflitos de host.
- Domain Name System (DNS) inventado em 1983
    - Esquema de nomeação baseada em hierarquia
    - Sistema de banco de dados distribuídos que implementando o esquema do nome
    - Esse banco de dados armazenava os hostnames para endereços IP.
    - Paul Mockapetris criou o DNS e fundou a empresa Nominum, que desenvolveu a primeira implementação do DNS
    - Implementação open source do DNS Bind

# Hierárquia

- Estrutura de árvore
    - Sempre existe o . no final de todo DNS, pois é o fim da hierarquia.
    - Domínios de primeiro nível (.org, .net, .au, .jp, .uk, .com, .edu, .gov, .museum, .aero)
    - Domínios de segundo nível: 
        - eng.cisco.com
        - jack.acm.org
    - CCTLD (Domínio nacional de nível superior)
    - Registro.br cria os registros do Brasil
    - Abaixo do CCTLD vai ter um domínio .br definido pelo país
    - Existe uma sociedade da internet chamado de ISOC no Vale do Silício.
    - Não existe servidor que cuida da internet, o registro da internet é definido pelos nameservers.
    - Cada domínio tem nomes e IP's, quem cuida disso é um servidor DNS (Nameserver - NS), que cuida dos registros de um domínio, como .cisco
    - O servidor DNS vai conhecer o endereço IP dos servidores que ele for autoridade, caso ele não seja dono, é delegado para outro NS (Nameserver)
- Resolução de nome
    - Quando configuramos um modem recebemos o endereço ip, mascara e o servidor de DNS de forma automática, que é um **Servidor de DNS Local**.
    - Exemplo:
        1. Acessar noise.cs.uchicago.edu
        2. Roteador pergunta para o NS 1 que detém o . (a.root-servers.net)
        3. Roteador pergunta para o NS 2 uchicago.edu (a.edu-servers.net)
        4. Roteador pergunta para o NS 3 cs.uchicago.edu (a.edu-servers.net)
        5. Roteador pergunta para o NS 4 noise.cs.uchicago.edu (a.edu-servers.net)
        5. NS 5 retorna o endereço IP do servidor.
    - A busca do endereço IP é um processo de busca recursiva
- Normalmente os servidores utilizando Bind ou Nominum.
- O DNS tem uma resolução reversa: Dado um IP ele fornece o domínio, tendo acesso a isso nós temos a informação da origem.
    - forward lookup (dado o nome você tem o endereço IP)
    - reverse lookup (dado o endereço IP você tem o nome)

1. O ser humano não consegue decorar endereços IP's, por outro lado, os nomes são mais fáceis de lembrar
2. Era feito através de arquivos, papéis, hosts.txt, armazenamento manual, no flat.
3.
4. Primeiro é o . para o NS do .br,
    - depois vai no .br para o NS do .edu
    - depois no .edu para o NS do .ifsp.
5. Microsoft DNS, Bind, Nominum

        


