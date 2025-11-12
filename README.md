# Calculadora Strategy

Aplicação Java simples com arquitetura MVC que utiliza o padrão Strategy para realizar as quatro operações básicas.

## Estrutura
- `model`: Interface `OperationStrategy` e implementações para soma, subtração, multiplicação e divisão.
- `controller`: `CalculatorController` escolhe a estratégia correta com base no operador informado.
- `view`: `CalculatorView` é responsável por mostrar resultados e erros no console.
- `Main`: ponto de entrada que lê os dados do usuário, delega o cálculo ao controller e exibe o resultado com a view.

## Executando
Compile os arquivos e execute a classe `Main`:

```bash
javac -d out $(find src -name "*.java")
java -cp out Main
```
