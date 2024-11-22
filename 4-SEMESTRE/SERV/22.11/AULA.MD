# HTTP Server

- Componentes: Web Server e Web Client
- Curiosidades:
    - Proxy
        - Podem existir uma série de servidores Proxy no meio da comunicação entre uma requsição do cliente para o servidor.
        - Existem dois tipos de Proxy: Transparente (Sem Autenticação) e Proxy Não Transparente (Com Autenticação)
        - Exemplo: No IFSP existe um Proxy Transparente
            - Não existe auditoria dos acessos
- Tutorial do Moddle
    - Seguir 1, 3, 4, 5,

# Passo a passo

1. Instalar o apache e arquivo HTML
    - `apt-get update`
    - `sudo apt install apache2`
    - Adicionar HTML em: `vim /var/www/html/index.html`
2. Criação da pasta para o Website
    - `sudo mkdir /var/www/your_domain`
    - `sudo chown -R $USER:$USER /var/www/your_domain`
    - `sudo chmod -R 755 /var/www/your_domain`
    - `sudo nano /var/www/your_domain/index.html`
        ```html
            <html>
                <head>
                    <title>Welcome to Your_domain!</title>
                </head>
                <body>
                    <h1>Success!  The your_domain virtual host is working!</h1>
                </body>
            </html>
        ```
3. Configuração do apache   
    - `sudo vim /etc/apache2/sites-available/your_domain.conf`
    ```conf
    <VirtualHost *:80>
        ServerAdmin webmaster@localhost
        ServerName your_domain
        ServerAlias www.your_domain
        DocumentRoot /var/www/your_domain
        ErrorLog ${APACHE_LOG_DIR}/error.log
        CustomLog ${APACHE_LOG_DIR}/access.log combined
    </VirtualHost>
    ```
    - Aplicar: `sudo a2ensite your_domain.conf`
    - Desabilitar padrão: `sudo a2dissite 000-default.conf`
    - Testar erros: `sudo apache2ctl configtest`
    - `sudo systemctl restart apache2`

# Passo a Passo FTP

1. Instalação:
    - `sudo apt update`
    - `sudo apt install vsftpd`
    - `sudo systemctl status vsftpd`
2. Configuração
    - `sudo nano /etc/vsftpd.conf`
    - Acesso geral do FTP
        - anonymous_enable=YES e local_enable=yes
    - Acesso local do FTP
        - anonymous_enable=NO e local_enable=yes
    - Habilitar upload
        - write_enable=YES
    - Desabilitar acesso aos diretorios somente de home
        - chroot_local_user=YES
    - Habilitar escrita do usuário anonimo 
        - anon_mkdir_write_enable=YES
    


# Atividade 8 - Pesquisa a ser feita

1. 
2. Qualquer máquina que tem um navegador, o Web Server é qualquer servidor que roda um servidor.
3. Para escalar um Servidor Web: Pode ser o código (conteúdo dinâmico) e auto scalling (replicação de servidores, escalonamento horizontal).
    - Scalling out -> Melhorar através de vários servidores.
    - Scalling up  -> Melhorar CPU e Memória.
4. Diferença do HTTP para o HTTPS
    - SSL: Chave pública e privada (Assimétricos) com certificado.
    - TLS: Evolução do SSL (Teve uma vulnerabilidade não identificada)
        - Utiliza chave pública com melhoria das bibliotecas implemetadas.
5. 
6. 
7. Comunicação cliente servidor ou entre sistemas distribuídos 
    - Protocolo é HTTP, as mensagens são transferidas através de tipo do conteúdo: JSON, XML, TEXT, AUDIO, VIDEO.

