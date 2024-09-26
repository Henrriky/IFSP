# !!!!!!!!!!!!!!!!!!!AVISO PROXIMA SEMANA!!!!!!!!!!!!!!!!!!!

- Enviar os integrantes do grupo.
- Cada grupo vai utilizar uma ISO como assunto para realizar o trabalho.
- As ISO's de cada grupo serão sorteadas

# Avaliação

- Trabalho em 5 pessoas para umadas ISO
- T1: Trabalho em grupo (5 pessoas)
- MA: Media de Atividades Avaliativas Individuais
- Critério de Avaliação: (T1 * 0.7 + MA * 0.3)

# Introdução

- Cartilha de Segurança de Informação
- Empresas pequenas não tem um sistema de gestão da analise de segurança da informação

## Familia das ISO 27000

- ISO 27001
- ISO 27002
- ISO 27005
- Lei geral de proteção de dados (LGPD)
    - Todos os dados armazenados em qualquer sistema deve ser protegido
    - Para cada informação colocada dentro do sistema, é necessário ter um motivo e deve ser especificado em um documento.
    - O sistema deve ter uma politica de gestão dos dados
    - O sistema deve possibilitar que o usuário possa excluir seus dados e providenciar um comprovante da exclusão.

## Conceitos de Segurança Fundamentais

### CID

- Confidencialidade: 
    - Dados que são restritos ao setor público, setor privado ou pessoal.
        - Dados públicos
        - Dados privados
            - Nem todo dado da empresa é acessível por todos.
            - Exemplo: Salário dos funcionários de uma empresa.
        - Dados pessoais
    - Ciclo de vida dos dados
        - Dados
            - Recebemento de caixas para entrega
        - Informação
            - Classificação por destinatário
        - Conhecimento
            - Começar a fazer entrega por onde
        - Sabedoria
            - Não poder fazer entrega em dia não útil.
- Integridade
    - Integridade do dado é você ter como comprovar que o dado é sempre o mesmo após uma ação, movimentação ou até depois de um tempo.
    - A integridade de alguns dados são efêmeras, como por exemplo o cupom fiscal, dados armazenados no disco entre outros. 
    - Integridade dos dados no Amazon S3 é 99,9999999%.
    - Transação com valores incorretos
        - Exemplo: Transação de R$ 50,00 e na conta de destino aparece R$ 2,00
- Disponibilidade
    - Pleno acesso aos dados.
    - A disponibilidade do sistema depende do setor no qual ele está inserido. Logo a disponibilidade dos dados também seguem esse princípio.
        - Exemplo 1: Sistema que deve estar disponível no horário comercial 
        - Exemplo 2: Sistema de escola que deve estar disponível 24 horas
        - Exemplo 3: Cloud que deve estar 100% Disponivel.
    - Notação
        - Exemplo: 24 Horas e 7 Dias da semana => 24/7
            ==========================================================================================================
            |   "#"       |         %         |         Funcionamento            |              Parada               |
            ----------------------------------------------------------------------------------------------------------
            |1            |90%                |365 - 36.5 = 328.5 Dias           |36.5                               |
            ----------------------------------------------------------------------------------------------------------
            |2            |99%                |365 - 3.65 = 361.5 Dias           |3.65                               |
            ----------------------------------------------------------------------------------------------------------
            |3            |99.9%              |365                               |0.365 * 24 = 8,76 Horas de Parada  |
            ----------------------------------------------------------------------------------------------------------
            |4            |99.99%             |365                               |52 minutos                         |
            ----------------------------------------------------------------------------------------------------------
            |5            |99.999%            |365                               |5 Minutos                          |
            ==========================================================================================================
        - Quando começamos a ter mais de um 9 com 99 temos o HA

### O Que é um Hacker e Cracker

=============================================================
|           Hacker           |         Cracker              |
-------------------------------------------------------------
|O Hacker é ético, e tem     |O Cracker não é ético, e tem  |
|como objetivo "ajudar"      |como objetivo encontrar       |
|empresas.                   |vulnerabilidade em sistemas   |
|Existem Hackers por diversão|e tomar proveito delas.       |
|Existem Hackers por diversão|Algumas empresas contratam    |
|Existem Hackers por diversão|crackers para atacar outras   |
=============================================================

### Existe Sistema da Informação 100% Seguro?

- Não existe sistema 100% Seguro
- Existem formas de mitigir as vulnerabilidades de segurança
