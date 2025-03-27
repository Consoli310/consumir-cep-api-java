# API de Consulta de Endereços

Este projeto é uma aplicação Java que consome a API do **ViaCEP** para buscar informações sobre endereços a partir do CEP informado pelo usuário.

## 🚀 Tecnologias Utilizadas

- **Linguagem:** Java
- **Bibliotecas:** Gson, Java HTTP Client
- **API Externa:** ViaCEP

## 📌 Funcionalidades

- Consulta de endereço a partir do CEP
- Consumo da API ViaCEP para obter dados em formato JSON
- Exibição dos dados do endereço formatados

## ⚙️ Como Executar o Projeto

1. Clone o repositório:
   ```sh
   git clone https://github.com/Consoli310/consulta-endereco-java.git
   ```
2. Acesse o diretório do projeto:
   ```sh
   cd consulta-endereco-java
   ```
3. Compile o projeto:
   ```sh
   javac -cp .:gson-2.8.9.jar Program/Main.java
   ```
4. Execute o programa:
   ```sh
   java -cp .:gson-2.8.9.jar Program.Main
   ```
5. Digite o CEP quando solicitado e veja os detalhes do endereço.

## 📌 Exemplo de Uso

```
Digite seu cep:
01001-000
Endereco{cep='01001-000', logradouro='Praça da Sé', complemento='lado ímpar', bairro='Sé', localidade='São Paulo', uf='SP', estado='São Paulo', regiao='Sudeste', ibge='3550308', gia='1004', ddd='11', siafi='7107'}
```

## 📡 API Utilizada

O projeto consome a API do **ViaCEP** para obter dados sobre endereços com base no CEP informado pelo usuário.

- **URL Base:** `https://viacep.com.br/ws/{cep}/json/`
- **Exemplo de Requisição:** `https://viacep.com.br/ws/01001000/json/`
- **Resposta esperada:**
  ```json
  {
    "cep": "01001-000",
    "logradouro": "Praça da Sé",
    "complemento": "lado ímpar",
    "bairro": "Sé",
    "localidade": "São Paulo",
    "uf": "SP",
    "ibge": "3550308",
    "gia": "1004",
    "ddd": "11",
    "siafi": "7107"
  }
  ```

