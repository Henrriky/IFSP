# Web storage

- Conhecido como DOM Storage
- API padrão do Javascript fornecida pelos navegadores da Web
- Permite que os sites armazenm dados persistentes nos dispositivos dos usuarios, semelhante aos cookies
- Capacidade maior e sem necessidade de enviar dados via HTTP

## Definição

- Facilitar o armazenamento de dados do lado do cliente
- Permite criar experiências mais ricas e iterativas

## Tipos de Web Storage

### Local Storage

- Os dados armazenados são especificos para uma origem (protocolo, host e porta) e permanecem disponíveis mesmo após o fechamento do navegador.
    - Capacidades de armazenamento:
        - Opera: 5MB
        - Firefox: 10MB
- Interface e modelo de dados:
    - Fornece uma interface para trabalhar com os dados armazenados.
    - Conjunto pares chave valor
```js
localStorage.set('chave', 'valor')
const var = localStorage.get('chave')
```

## Discussão

- Como poderia ser usado em caso de acesso de multiusuário
- Como relacionar o webstorage com os banco de dados relacionais.

