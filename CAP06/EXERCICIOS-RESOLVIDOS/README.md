# # README

Este repositório contém soluções de exercícios de lógica de programação, abordando diferentes conceitos como manipulação de vetores, controle de fluxo e estruturas de dados. Os exercícios foram implementados em **C** e **Java**.

## Descrição das Questões

1. **Preenchimento de Vetores e Cálculo de Números Positivos e Negativos**
   - O programa preenche um vetor com oito números inteiros e, em seguida, cria dois vetores resultantes: um contendo os números positivos e outro contendo os números negativos.

2. **União, Diferença, Soma e Produto de Vetores**
   - O programa preenche dois vetores com 10 números inteiros, e calcula:
     - A união de ambos os vetores (sem repetições).
     - A diferença entre os vetores (elementos de um vetor que não estão no outro).
     - A soma e o produto entre os vetores (soma e multiplicação de elementos correspondentes).

3. **Ordenação de Vetores em Ordem Decrescente**
   - O programa preenche um vetor com 10 números inteiros e ordena os números em ordem decrescente utilizando o algoritmo de ordenação *bubble sort*.

4. **Preenchimento de Vetores de Forma Crescente**
   - O programa preenche um vetor com 10 números inteiros e os armazena já em ordem crescente.

5. **Junção de Dois Vetores e Ordenação**
   - O programa preenche dois vetores com cinco números inteiros e depois junta os dois vetores em um terceiro vetor, ordenando-o em ordem crescente.

6. **Reserva de Passagens Aéreas**
   - O programa simula um sistema de reserva de passagens aéreas para 12 voos, permitindo consultar informações sobre voos e efetuar reservas, com controle de lugares disponíveis.

7. **Correção de Provas de Múltipla Escolha**
   - O programa corrige provas de múltipla escolha de 10 alunos, calcula as notas e a porcentagem de alunos aprovados (nota mínima: 6).

8. **Vetor de Números Pares e Ímpares**
   - O programa preenche um vetor com números inteiros e, em seguida, cria dois vetores: um com números pares e outro com números ímpares, sem repetições.

9. **Controle de Passagens Aéreas com Menu**
   - O programa permite ao usuário consultar voos disponíveis, efetuar reservas e consultar passagens de acordo com o número do voo, origem ou destino. Inclui a opção de sair do sistema.

10. **Tabela de Notas de Alunos**
   - O programa calcula e exibe a média das notas dos alunos e verifica quais passaram ou reprovaram com base em critérios definidos. 

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

Este repositório reúne uma série de exercícios fundamentais para o desenvolvimento de habilidades de programação e lógica. Os exercícios são projetados para testar o conhecimento de estruturas de dados (como vetores), controle de fluxo, e algoritmos básicos. A aplicação de técnicas como o bubble sort para ordenação e a implementação de sistemas de controle e consulta são ótimos exemplos de como conceitos de programação podem ser aplicados para resolver problemas práticos. As instruções de execução fornecem uma maneira fácil de usar o código em Python, JavaScript, C e C++.

