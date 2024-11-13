# JPA 

- Consiste principalmente na utilização do `EntityManager` que representa o padrão ActiveRecord quando as entidades herdam essa classe.

# Ciclo de vida dos objetos

- (Instanciação) -> Transient -> (Persist) -> Managed -> (Remove) -> Removed
- Removed -> persist -> Managed
- Managed -> remove -> Removed

# Contexto de persistência

- Consiste no carregamento de uma coleção de objetos na memória e gerenciados por uma instância da interface **Entity Manager**
- Ao realizar uma busca nova, que buscava a mesma coisa a JPA consegue recuperar o objeto sem buscar no banco de dados, fazendo uma espécie de "Cache"
- O método `EntityManager#contains` consiste na verificão se o objeto existe ou não no banco de dados, o método `detach` remove o objeto do gerenciamento de objeto do EntityManager/JPA

## Sincronização dos dados

- O estado das instâncias de entidades são sincronizados com o banco de dados quando ocorre o `commit` da transaction atual, liberando o gerenciamento do objeto em memória.
- A sincronização pode ser **forçada** com o método `flush`, no caso de uma atualização ele executa o `update` automáticamente.

## Gravação de objetos desanexados

- Os objetos **desanexados (detached)** são os que não estão sendo gerenciados pelo **Entity Manager**, embora ainda existam registros no banco. Logo, alterações do objetos não são gerenciados com o banco.
- O objeto **desanexado** pode ser **reanexado** através do método **merge** do `Entity Manager`, que copia o conteúdo do objeto desanexado para um objeto gerenciado