# Elicitação de requisitos
- Elicitar consiste na abstração das funcionalidades e recursos que serão necessarios para o desenvolvimento do sistema.
- É necessário abstrair o máximo de detalhamento sobre o que o usuário deseja, com o objetivo de atender esse desejo de forma eficaz.
- Um bom analista de ser capaz de ter boas habilidades de comunicação, para que seja possível analisar e documentar as necessidades e expectativas do nosso cliente.

## Planejamento 

- Etapas do planejamento da elicitação de requisitos, sendo o planejamento uma etapa crítica:
    - 1. Identificar as partes interessadas (STAKEHOLDERS)
    - 2. Definir as técnicas de elicitação (entrevistas, workshops, questionarios)
    - 3. Seleção das ferramentas de elicitação (diagramas, fluxogramas, prototipos e documentos)
    - 4. Definir um cronograma (prazos para coleta de informação, documentação e revisão dos requisitos com STAKEHOLDES)
    - 5. Identificação dos riscos (perceber quais são os possíveis riscos na elicitação e elaborar estratégias para diminuir as inconsistências e requisitos mal definidos).
    - 6. Definir critérios de aceitação (propor critérios claros para a aceitação dos requisitos, como viabilidade, testabilidade e consistencia)

## Atividades comuns

- 1. Definição do escopo (quais requisitos precisam ser coletados)
- 2. Documentação dos requisitos (casos de uso, fluxogramas, diagramas e documentos de especificação dos requisitos)
- 3. Revisão dos requisitos
- 4. Validação de requisitos
- 5. Gerenciamento de mudanças
- 6. Comunicação com as partes interessadas

## Aspectos humanos

- São fundamentais para o processo de elicitação de requisitos. Alguns aspectos são necessários, como: comunicação, empatia, negociação, liderança, compreender a cultura organizacional e flexibilidade.

## Atores

- Pessoas que interagem com o sistema
    - Exemplo de atores:
        - Aluno (reservar livro, pesquisar catálogo)
        - Professor (solicitar novos livros)
- São extremamente importantes para a `modelagem dos requisitos`, pois auxilia na identificação de quem vai interagir com sistema e como essas interações afetam ele.
- Existem dois tipos de atores:
     - 1. Ator primário: Usuario final do sistema, e que recebe o resultado final. É responsável pelo feedback e pelo fornecimento dos requisitos
     - 2. Ator secundário: São outras partes que interagem com nosso sistema, como dispositivos, API's ou serviços. Pode interagir através de integrações, comunicação ou processamento de dados
- Quando modelamos os atores conseguimos identificar `requisitos adicionais necessários` que podem ser necessários para o sistema mas não foi abstraido.

## Técnicas de elicitação - entrevista

- Perguntas para coletar as informações sobre as necessidades e expectativas dos usuarios finais para poder documentar os requisitos do projeto
- Perguntas recorrentes:
    - Quais os principais desafios enfrentados?
    - Como você espera que o projeto resolva seu desafio?
    - Quais as principais funções que você espera que o sistema desempenhe?
    - Quais são as expectativas em relação a interface?
- Desvantagens das entrevistas: tempo, custo, falta de representatividade e objetividade, depêndencia de respostas precisas.

## Técnicas de elicitação - observação

- Não há dialogo, consiste apenas na observação das necessidades e dos atores que estarão envolvidos naquele sistema.
- Observar quais as atividades dos usuarios finais, documentando e identificando problemas para elaborar melhorias.
- Vantagens: Observação direta, Precisão, Não intrusiva, Descoberta de problemas e Identificação de oportunidades de melhoria.
- Desvantagens: Resultados imprecisos, dificuldade em processos complexos, dependência de observação precisa, necessidade de planejamento e dependencia do contexto.
- Roteiro:
    1. Definição do objetivo
    2. Identificação dos usuarios e permissão
    3. Preparação
    4. Registros
    5. Análise dos resultados
    6. Documentação clara e concisa


# Tarefa

## Atores

- Usuário final (setor de contabilidade), Gerente de controle dos produtos e Gestor.
    
- Perguntas e respostas para o setor de contabilidade:
    1. Quais os problemas que você enfrenta devido a ausência de um sistema de gestão de vendas? Geralmente não sou capaz de ter uma informação precisa de quais produtos existem, quais são as informações de estoque e a realização das vendas são feitas de forma muito antiga. Além disso, nem sempre todo mundo possuí a mesma planilha, gerando inconsistência na troca de informação
    2. Quais são as principais tarefas que você desempenha no seu cargo? Tenho que ficar consultando em papeis e planilhas bagunçadas quais são os produtos e os estoques disponívei, realizar vendas sem um sistema também é algo que faço no dia a dia, tenho que ficar anotando os produtos vendidos em um papel
    3. O que você deseja que o sistema seja capaz de fazer ? O sistema deve permitir que eu consiga gerenciar a quantidade de produtos que foram vendidos, consultar informações dos produtos, consultar informações de estoque e realizar a venda de um produto através de um código dele e gerenciar os lucros e gastos.
- Gerente de controle dos produtos
    1. Quais os problemas que você enfrenta devido a ausência de um sistema de gestão e vendas? Como gerente dos produtos, tenho muita dificuldade para comunicar toda a equipe sobre a mudança de preço dos produtos ou obsolência de alguns. Além disso, não consigo ter um controle sobre o estoque de forma satisfatória, pois não consigo lembrar de quais os fornecedores que estão providenciando os produtos, e é muito comum eu não ter uma padronização de comunicação consistente.
    2. Quais são as principais tarefas que vocẽ desempenha no seu cargo? É muito comum no meu dia a dia ficar gerenciando os produtos que estarão disponiveis na loja, controlar os preços deles, ver quantos produtos possuem e manter uma comunicação com os fornecedores, porém como tudo é feito no papel e na planilha fica meio bagunçado de gerenciar tudo de forma satistória.
    3. O que você deseja que o sistema seja capaz de fazer, quais suas expectativas? Para mim o sistema deve possuir principalmente um painel que me permita inserir produtos novos, editar produtos já criados e consultar as informações deles. Ademais, também é necessário a conexão dos produtos com a quantidade no estoque, tal como os fornecedores, preço e a data da compra deles.
- Gestor
    1. Quais os problemas que você enfrenta devido a ausência de um sistema de gestão e vendas? Como gestor, muitas vezes eu preciso de relatórios para planejar quais estratégias devo tomar, quais são os lucros e gastos que estamos tendo e para onde devo direcionar o dinheiro, porém esses dados chegam para mim de forma inconsistente, pois cada pessoa que trabalha possui uma planilha diferente. Além disso, os produtos quase nunca estão com os preços atualizados. Tudo isso acaba me atrapalhando no meu planejamento de quais nicho devo focar e quais fornecedores são mais viáveis para a empresa.
    2. Quais são as principais tarefas que você desempenha no seu cargo? É muito comum no meu dia a dia dar baixa nos lucros que estamos tendo, para não gerar prejuízo para empresa. Além disso, cuido da parte de quais produtos estão sendo mais vendidos, definindo estratégias de marketing para nossa empresa e mantendo uma boa relação com os fornecedores desses produtos. Entretanto, a maioria dessas tarefas são feitas de forma simples com papéis e planilhas.
    3. O que você deseja que o sistema seja capaz de fazer, quais são suas expectativas? Com esse sistema, eu quero que ele possibilite os funcionários da empresa de gerar relatórios contento a quantidade de produtos vendidos, qual foi a margem de lucro, quais estão sendo os custos, quantas pessoas compraram na loja, definir o preço que o produto é vendido para o cliente e o preço que pagamos com o fornecedores. E por fim, é necessários também um painel com todas as informações dos fornecedores que mantemos contato. Tudo isso precisa ser gerenciavel e acessível para os nossos gerentes.
