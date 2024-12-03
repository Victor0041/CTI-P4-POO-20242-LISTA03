# README

Este repositório contém soluções para uma série de problemas de programação, que envolvem conceitos de lógica, cálculos e manipulação de dados. Os problemas são resolvidos usando sub-rotinas, loops e condições para realizar tarefas específicas.

## Descrição das Questões

1. **Verificação de número positivo ou negativo**:
   - Programa que verifica se um número inserido é positivo ou negativo e retorna 1 ou 0, respectivamente.

2. **Soma de números entre dois valores**:
   - Calcula a soma dos números inteiros entre dois valores dados, considerando valores positivos como entrada.

3. **Soma de números divisíveis por um valor**:
   - Soma os números entre dois valores dados que são divisíveis por um número específico.

4. **Conversão de segundos para horas, minutos e segundos**:
   - Converte um número de segundos em horas, minutos e segundos, sem usar variáveis globais.

5. **Cálculo de percentual de acréscimo**:
   - Calcula o percentual de aumento entre um valor antigo e um valor atual de um produto.

6. **Tabela de multiplicação personalizada**:
   - Exibe uma tabela de multiplicação até o número informado, com a multiplicação de quadrados perfeitos.

7. **Cálculo de média aritmética ou ponderada**:
   - Calcula a média aritmética ou a média ponderada (com pesos 5, 3 e 2) das notas de um aluno.

8. **Duração de uma partida de jogo**:
   - Calcula a duração de uma partida de jogo em minutos, considerando que a partida pode se estender até 24 horas e atravessar dois dias.

9. **Maior e menor valor de cinco números**:
   - Recebe cinco valores inteiros e determina o maior e o menor valor entre eles.

10. **Cálculo de uma expressão matemática**:
    - Calcula o valor da expressão \( S = 1 + \frac{1}{1!} + \frac{1}{2!} + ... + \frac{1}{N!} \) para um valor de N fornecido.


## Como Usar em Diferentes Plataformas

### Em Python

Para executar o código em Python, basta seguir as instruções abaixo para a versão correspondente.

#### Instalação e Execução:
1. Instale Python em sua máquina (se não tiver instalado).
2. Salve o código Python em um arquivo com a extensão `.py`.
3. Execute o código via terminal/linha de comando com o comando:
    ```bash
    python3 nome_do_arquivo.py
    ```

#### Exemplo em Python:
```python
angulo = float(input("Digite o valor do ângulo (em graus): "))
if angulo > 360 or angulo < -360:
    voltas = int(angulo / 360)
else:
    voltas = 0
```

### Em JavaScript

Para rodar o código em JavaScript, use um navegador ou um ambiente de execução como o Node.js.

### Execução:
1. Abra o navegador ou terminal.
2. Coloque o código JavaScript dentro de uma tag <script> ou em um arquivo .js para ser executado em um ambiente Node.js.

#### Exemplo em JavaScript:
```javascript
let angulo = parseFloat(prompt("Digite o valor do ângulo (em graus):"));
let voltas;
if (angulo > 360 || angulo < -360) {
    voltas = Math.floor(angulo / 360);
} else {
    voltas = 0;
}
// Lógica do quadrante segue da mesma forma
```

### Em C

Se você quiser rodar o código em C, basta ter um compilador de C, como o GCC ou o Clang.

### Execução:
1. Salve o código C em um arquivo .c.
2. Compile o código com o compilador:
```bash
   gcc nome_do_arquivo.c -o nome_do_programa
```
3. Execute o programa gerado:
```bash
  ./nome_do_programa
```

### Em C++

No caso do C++, o processo de compilação é similar ao de C, com o uso do compilador g++.

### Execução:
1. Salve o código C++ em um arquivo .cpp.
2. Compile o código com o comando:
```bash
  g++ nome_do_arquivo.cpp -o nome_do_programa
```
3. Execute o programa gerado:
```bash
  ./nome_do_programa
```

## Conclusão

Esses programas são um excelente exercício para melhorar as habilidades de programação, especialmente no que diz respeito ao uso de funções e sub-rotinas para resolver problemas comuns. Eles envolvem conceitos fundamentais de programação como loops, condições, cálculos aritméticos e manipulação de dados. Cada tarefa oferece uma oportunidade de aplicar a lógica de forma prática e de entender como diferentes tipos de problemas podem ser resolvidos por meio da programação. As instruções de execução fornecem uma maneira fácil de usar o código em Python, JavaScript, C e C++.
