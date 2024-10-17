# Como garantir a confidenciabilidade de um sistema?

- Utilizar autenticação (Two Factor, OAuth, SAML), controle de acesso (ABAC e RBAC), criptografia e políticas de segurança.

# Como garantir a integridade de um sistema ?

- Do ponto de vista de desenvolvimento:
    - Regras de negócio
    - Modelagem e relacionamento banco SGDB.
- Implementar auditoria completa, controle de versão, validação de integridade, tratamento, integridade relacional, monitoramento e criptografia. 

# Como garantir a disponibilidade de um sistema ?

- Implementar redundânica (escalabilidade horizontal), arquitetura de sistemas (microsserviços), sistema de cache, utilização de load balancers, plano de desastre e implantações com zero downtime (EX Deploy Blue Green).
- Serviços gerenciadores de Cloud Providers (Banco de dados, Bancos em memória, Sistemas de container, Sistemas de armazenamento entre outros)

## Cloud

- Criar VM's / Instâncias
    - Instalando e Configurando as aplicações
- Serverless (Não tenho Servidor)
    - AWS Lambda.
- Amazon ECR => Registry
    - Imagem de container
- Amazon ECS => Orquestrador
- Amazon EKS => Kubernetes
- AWS Fairgate => Serverless

