
# Api Auth Spring

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) 
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)



### Versão 0.0.1
#### Esta api receberá atualizações e será mais documentada e em breve, ela fará parte de um conjunto de micro serviços.


### Tecnologias Utilizadas

- Java: Linguagem utilizada na construção da API.
- Spring Security: Framework utilizado para gerenciar toda segurança.
- Spring Boot: Framework utilizado para a construção da API.
- Spring JPA: Injeção de dependencias
- PostGreSQL: Banco de dados
- PgAdmin: Interface para o banco de dados PostGreSQL
- Docker: Conteirização do banco de dados e de seua interface

### Estrutura do Projeto.
        src/
        ├── main
        │   ├── java
        │   │   └── com
        │   │       └── example
        │   │           └── jwt
        │   │               ├── controller
        │   │               │   └── AuthController.java
        │   │               ├── JwtApplication.java
        │   │               ├── model
        │   │               │   └── User.java
        │   │               ├── repository
        │   │               │   └── UserRepository.java
        │   │               ├── security
        │   │               │   ├── JwtUtil.java
        │   │               │   └── SecurityConfig.java
        │   │               └── service
        │   │                   └── AuthService.java
        │   └── resources
        │       └── application.properties
        └── test
            └── java
                └── com
                    └── example
                        └── jwt
                            └── JwtApplicationTests.java
                
        
### Como rodar:
- #### Subir o banco e sua interfaçe em container:
        docker compose up
- #### Rodar API (caso não use IDE)
        mvn spring-boot:run


### Para acessar o swagger da API
        http://127.0.0.1:8080/swagger-ui/index.

### Para acessar o PgAdmin (Interface do Banco de Dados) PostGreSQL
        http://127.0.0.1:8081/login?next=/


### Contribuições

Se você deseja contribuir para este projeto, fique à vontade para criar pull requests ou relatar issues. Melhorias como persistência de dados, maior segurança, e otimizações de desempenho são sempre bem-vindas.

## Autores
- [@Rodrigo_Kelven](https://github.com/Rodrigo-Kelven)

