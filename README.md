# Teste Dev Target Sistemas

Este repositório contém soluções para os desafios propostos pela Target Sistemas. O projeto foi desenvolvido em Java e utiliza a biblioteca Jackson para manipulação de arquivos JSON.


## Descrição dos Arquivos

### `FaturamentoDistribuidora.java`

Este arquivo contém a lógica para calcular o menor, maior e a média de faturamento diário, além de contar os dias em que o faturamento foi superior à média. Os dados são lidos a partir de um arquivo JSON localizado em `src/main/resources/dados.json`.

### `FaturamentoMensal.java`

Este arquivo calcula o percentual de representação de faturamento de diferentes estados em relação ao total.

### `Fibonacci.java`

Este arquivo verifica se um número informado pelo usuário pertence à sequência de Fibonacci.

### `InversorString.java`

Este arquivo inverte uma string informada pelo usuário.

### `SomaIndice.java`

Este arquivo calcula a soma dos números de 1 até um índice pré-definido.

## Como Executar

1. Certifique-se de ter o [Maven](https://maven.apache.org/) instalado.
2. Navegue até o diretório do projeto.
3. Execute o comando `mvn clean install` para compilar o projeto.
4. Para executar cada classe, utilize o comando `java -cp target/classes br.com.targetsistemas.NomeDaClasse`, substituindo `NomeDaClasse` pelo nome da classe que deseja executar (por exemplo, `FaturamentoDistribuidora`).

## Dependências

O projeto utiliza a biblioteca Jackson para manipulação de arquivos JSON. A dependência está definida no arquivo `pom.xml`:

```xml
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.13.5</version>
</dependency>
```

Este README fornece uma visão geral do projeto, descreve a estrutura dos arquivos e explica como executar o código.
