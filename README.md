<h1 align="center">Welcome to SeleniumEasyTest 2.0 👋</h1>
<p>
  <img alt="Version" src="https://img.shields.io/badge/version-2.0.0-blue.svg?cacheSeconds=2592000" />
  <a href="https://twitter.com/JuuhGranja" target="_blank">
    <img alt="Twitter: JuuhGranja" src="https://img.shields.io/twitter/follow/JuuhGranja.svg?style=social" />
  </a>
</p>

> Java Project in order to test the Selenium Easy website [SeleniumEasy](http://demo.seleniumeasy.com/).
> Frameworks and tools: Maven, Selenium Web Driver, JUnit, Cucumber, Selenium Grid, Jenkins e Allure.

### 🏠 [SeleniumEasy](http://demo.seleniumeasy.com/)

* Jenkins documentation: [Jenkins](https://www.jenkins.io/doc/tutorials/build-a-java-app-with-maven)

## Instruções de Uso
   
```sh
- O driver do chrome dentro do projeto está na versão 85,
por isso, caso o seu navegador esteja em outra versão
por favor altere o driver dentro do diretório src/test/resources/driver

- A execução pode ser realizada localmente ou dentro de um grid,
Caso prefira executar em um grid, favor alterar o
arquivo de propriedades (config.properties)
setando a URL do grid que deseja utilizar, e alterando o navegador para "cremote"
```

## Run local tests

```sh
mvn test
```

## Run tests in Pipeline Jenkins

```sh
- Jenkins
Dentro do projeto contém um Jenkinsfile
Caso deseje executar os testes em uma pipeline, certifique-se
de ter alterado a URL do selenium grid dentro do config.properties
e de ter alterado o navegador para "cremote"


Para execução, crie uma nova pipeline,
definida como "Pipeline scrit from SCM - GIT"
Informe a url do repositório do gitlab ou github,
defina o Script Path como Jenkinsfile e salve.
Então clique em construir, ou se estiver utilizando o BlueOcean
execute os testes no botão Run.
```


## Author

👤 **Jussara Granja**

* LinkedIn: [@jussaragranja](https://linkedin.com/in/jussaragranja)
* Github: [@jussaragranja](https://github.com/jussaragranja)
* GitLab: [@jussaragranja](https://gitlab.com/jussaragranja)
* Twitter: [@JuuhGranja](https://twitter.com/JuuhGranja)
