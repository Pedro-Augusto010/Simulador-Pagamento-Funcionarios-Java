# Sistema de Pagamentos de Funcionários

Este projeto é um sistema orientado a objetos desenvolvido em Java para calcular o pagamento mensal de diferentes categorias de funcionários. Foi construído como parte da avaliação presencial da disciplina de Programação Orientada por Objetos da Universidade Católica de Brasília (UCB).

## 🎯 Objetivo
O objetivo principal do projeto é aplicar os conceitos de **Herança** e **Polimorfismo**. A partir de uma superclasse genérica, foram implementadas subclasses específicas que herdam as características básicas e sobrescrevem métodos para adaptar o cálculo de pagamento às regras de cada categoria de funcionário.

## ⚙️ Funcionalidades
- **Cadastro de Funcionários Base:** Todos os funcionários possuem nome e matrícula.
- **Validação de Dados:** O sistema impede o cadastro de valores numéricos negativos para salários, horas trabalhadas, vendas e percentuais.
- **Cálculo de Pagamento Personalizado:**
  - **Assalariado:** Recebe um salário fixo mensal.
  - **Horista:** O pagamento é calculado multiplicando as horas trabalhadas pelo valor da hora.
  - **Comissionado:** O pagamento é calculado aplicando um percentual sobre o total de vendas realizadas.
- **Exibição de Dados:** Impressão detalhada dos dados de cada funcionário, incluindo os seus atributos específicos e o pagamento calculado formatado com duas casas decimais.

## 🏗️ Estrutura do Projeto (Classes)
O projeto é composto por uma superclasse e três subclasses:
1. `Funcionario` (Superclasse): Define os atributos comuns (`nome`, `matricula`) e os métodos padrão (`exibirDados()`, `calcularPagamento()`).
2. `Assalariado` (Subclasse): Herda de `Funcionario` e implementa o atributo e cálculo do `salarioMensal`.
3. `Horista` (Subclasse): Herda de `Funcionario` e implementa os atributos e cálculo baseados em `horasTrabalhadas` e `valorHora`.
4. `Comissionado` (Subclasse): Herda de `Funcionario` e implementa os atributos e cálculo baseados em `totalVendas` e `percentualComissao`.
5. `Main`: Classe principal que instancia os dados de teste (Ana, Bruno e Carla) e exibe os resultados esperados no terminal.

## 🚀 Como executar
1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado na sua máquina.
2. Faça o clone deste repositório ou baixe os arquivos fonte.
3. Compile os arquivos Java abrindo o terminal na pasta do projeto e digitando:
   ```bash
   javac *.java

## 📂 Estrutura do Repositório
/salario

├── Funcionario.java     # Superclasse com atributos e métodos comuns a todos

├── Assalariado.java     # Subclasse para funcionários com salário mensal fixo

├── Horista.java         # Subclasse para funcionários pagos por hora trabalhada

├── Comissionado.java    # Subclasse para funcionários pagos por comissão de vendas

├── Main.java            # Ponto de entrada do programa e testes práticos
