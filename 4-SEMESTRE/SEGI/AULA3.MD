# Integridade

- **Definição:** Propriedade de exatidão e completeza da informação.
- **Características da integridade**:
    - Completeza: Garantir que os dados estão completos
    - Correção/Corretude: Garantir que os dados estão verdadeiros e exatos
    - Precisão: Garantir que a saída dos dados podem ser reproduzidas
    - Validade: Garantir que os dados atendem um critério de aceitação
    - Verificação: Garantir a verificação de que os dados foram armazenados, recuperados, transferidos e exibidos corretamente.
- **Exemplo:**
    - Quando um usuário do departamento de vendas envia um documento para o fornecedor através do e-mail e ele é interceptado por um cracker, a integridade é comprometida.
- **Sustentam a integridade**
    - **autenticidade**: Garante que a informação é proveniente da fonte anunciada e que não foi alvo de mudanças durante um processo (ex: sistema da informação)
    - **não repúdio**: Garante a impossibilidade de negar a autoria em relação a uma transação anteriormente feita.
- **Medidas de proteção:**
    - Autorização para mudanças nos sistemas e em dados.
    - Sempre que possível, convém serem construídos mecanismos para forçar as pessoas a usar o termo correto.
    - Registro de ações dos usuários de forma que possa ser determinado quem faz uma mudança de informaçãos
    - Ações vitais do sistema, como aprovar um pagamento, não podem ser realizadas por apenas uma pessoa.
    - Técnicas de criptografia, protegendo a informação de acesso ou alteração sem autorização  

# Disponibilidade

- **Definição:** Propriedade de ser acessível e utilizável sob demanda por uma entidade autorizada
    - Prontidão: Os sistemas de informação precisam estar sempre disponíveis
    - Continuidade: Os funcionários precisam continuar trabalhando em causa de falha
    - Robutez: Os sistemas de informação precisam ser capazes de suportar o acesso de milhares de pessoas
- Exemplo de situação que interrompeu a disponibilidade: Hackers derrubando sistemas.
- **Medidas de proteção:**
- **Questionário**
    1
        - A
    2
        - C
    3
        - B
    4
        - C
    5
        - C
    6 
        - C
    7
        - B

# Conceitos relacionados a ameaça e risco

- A ISO 270002 é uma familia que é composta de mais de 40 normas relacionadas às informações.
- As principais normas desta família são:
    - 27000: Visão geral e vocabulario de SI
    - 27001: Requisitos de SI
    - 27002: Código de prática de SI
    - 27003: Guia de implementação do SGSI
    - 27004: Medição do SGSI
    - **27005: Gestão de riscos de SI**
    - 27006: Requisitos para partes que fornecem auditoria e certificação de SGSI's
- São **elementos de um risco**:
    - Ameaça
    - Vulnerabilidade
    - Probabilidade
    - Potencial impacto
    - Posteriormente -> Incidente -> Dano -> Desastre
- Exemplo: Um ladrão (agente de ameaça) vai fazer um furto (ameaça) em uma residência (vulnerabilidade)
    - Risco: um ladrão conseguir entrar na casa e furtar bens de valor.

## Ameaça

- ISO: Potencial causa de um incidente indesejado que pode resultar em dano a um sistema ou organização
- A ameaça pode ser um agente externo que explora a vulnerabilidade de um evento
- A entidade que tira vantagem de uma vulnerabilidade é chamado de **agente de ameaça**
- Exemplos: Acesso não autorizado de arquivos, travamento de servidor, temmpestade, funcionário irritado entre outros.

## Vulnerabilidade

- ISO: Fraqueza de um ativo ou controle que pode ser **explorada** por uma ou mais **ameaças**
- A vulnerabilidade é caracterizada pela fraqueza ou ausência de garantia que pode ser explorada.
- Exemplos: Desktop sem proteção de senha, Portas abertas no Firewall, E-mails enviados sem nenhum tipo de criptografia, Antivirus desatualizado.

## Risco

- ISO: É a probabilidade de um **agente de ameaça** tirar proveito de uma **vulnerabilidade** e do impacto no negócio correspondente
- Fluxo:
    - Riscos = Ameaça + Vulnerabilidade + Probabilidade + Potencial de impacto no negócio 
- Os riscos englobam as ameças, vulnerabilidade e potencial de impacto no negócio
- Exemplo:
    - Se um firewall tem várias portas abertas, então há uma probabilidade maior de um intruso utilizar alguma porta para acessar a rede de uma forma não autorizada
    - Se os usuários não são informados sobre processos e procedimentos, então há uma probabilidade maior de um funcionário cometer um erro intencional ou não, o que pode acabar destruindo os dados.









































