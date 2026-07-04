## Sintaxe básica do Java
1. Todo arquivo Java que for escrito é necessário declarar uma classe em cada arquivo
	- Pode ter várias classes no mesmo arquivo, mas a classe principal deve ter o mesmo nome do arquivo.
	- A classe que for ser pública dentro de um arquivo deve ter o mesmo nome do seu próprio arquivo.
2. O nome da classe deve ser o mesmo nome do arquivo

- #### Variáveis
	Podemos declarar variáveis de 2 formas diferentes
	1. `int minhaIdade = 20;` onde:
		- `int` - tipo da variável;
		- `minhaIdade` - nome da variável;
		- ` = 20` - Atribuição de valor para aquela variável;
		- Podemos reatribuir valores do mesmo tipo para aquela variável declarada, mas não podemos reatribuir valores de tipos diferentes.
	2. `var meuNome = "Vitor";` onde:
		- `var` - indica que o próprio Java vai <span style = "color: green; font-weight: bold;">inferir</span> o tipo para a variável de acordo com o valor que for atribuído a ela;
		- `meuNome` - nome da variável;
		- ` = "Vitor";` - atribuição do valor (String) _"Vitor"_ para a variável;

___
- #### Tipos primitivos

	- Números inteiros
		- byte
			- 8 bits
			- <font color="#00b050">-128 a 127</font>
			- `byte meuByte = 255;` - <font color="#ff0000">Não é permitido</font>
		- short
			- 16 bits
			- <font color="#00b050">-32768 a 32767</font>
			- `short meuShort = 100000;` - <font color="#ff0000">Não é permitido</font>
		- int
			- 32 bits
			- <font color="#00b050">-2.147.483.648 a 2.147.483.647</font>
			- `int meuInt = 3000000000;` - <font color="#ff0000">Não é permitido</font>
		- long
			- 64 bits
            - <font color="#00b050">-9.223.372.036.854.775.808 a 9.223.372.036.854.775.807</font>
            - `long meuLong = 10223372036854775808L;` - <font color="#ff0000">Não é permitido</font>
            - Para declarar um valor do tipo `long` é necessário colocar a letra `L` no final do número, caso contrário o Java vai entender que é um valor do tipo int.

	- Números decimais
		- float
			- 32 bits
			- <font color="#00b050">-3.40282347E+38 a 3.40282347E+38</font>
			- Precisão simples (7 dígitos)
		- double
			- 64 bits
			- <font color="#00b050">-1.79769313486231570E+308 a 1.79769313486231570E+308</font>
			- Precisão dupla (15 dígitos)

	- Texto
		- String
			- Sequência de caracteres
			- `String meuNome = "Vitor";`
		- char
			- 16 bits
			- Representa um único caractere
			- `char meuChar = 'A';`

	- Booleano
		- 1 bit
			- Representa verdadeiro ou falso (`true` ou `false`)
			- `boolean meuBoolean = true;`
			- Na memória, é armazenado como 0 (falso) ou 1 (verdadeiro)

>[!warning] Atribuir valores maiores que  permitido pelo tipo
> Se declarar variável `byte` e tentar atribuir um valor maior do que o tipo permite vai dar erro,exemplo: `byte meuByte = 255;` - <font color="#ff0000">Não é permitido</font>

___
- #### Condicionais
	- `if` - Se a condição for verdadeira, o bloco de código dentro do `if` será executado.
	- `else` - Se a condição do `if` for falsa, o bloco de código dentro do `else` será executado.
	- `else if` - Se a condição do `if` for falsa, e a condição do `else if` for verdadeira, o bloco de código dentro do `else if` será executado.
	- `switch-case` - Permite testar uma variável contra vários valores possíveis, executando o bloco de código correspondente ao valor que coincidir.
		- Sintaxe: 
	        ```java
	        switch (variavel) {
	            case valor1:
	                // bloco de código para valor1
	                break;
	            case valor2:
	                // bloco de código para valor2
	                break;
	            default:
	                // bloco de código se nenhum caso coincidir
	        }
	        ```

___
- #### Arrays ou vetores
	- Um array é uma estrutura de dados que armazena uma coleção de elementos do mesmo tipo.
	
	- ##### Sintaxe:
		- Declaração de vetor vazio
			- <font color="#f79646">É obrigatório informar o tamanho do vetor, que é a quantidade de elementos que ele pode armazenar.</font>
		        ```java        
		        tipo[] nomeDoArray = new tipo[tamanho];
		        ```
		- Ou declaração de vetor com valores padrões
			- <font color="#f79646">Não é necessário informar o tamanho do vetor, pois ele será definido automaticamente pelo número de elementos fornecidos.</font>
				```java
				tipo[] nomeDoArray = {valor1, valor2, valor3, ...};
				```
	
	- ##### Exemplos:
        ```java
        int[] numeros = new int[5]; // Cria um array de inteiros com 5 elementos
        numeros[0] = 10; // Atribui o valor 10 ao primeiro elemento do array
        numeros[1] = 20; // Atribui o valor 20 ao segundo elemento do array
        
        int[] numeros2 = {10, 20, 30, 40, 50}; // Cria um array de inteiros com 5
											     // elementos e atribui valores a eles
        ```

	- ##### Acesso aos elementos do array
		- Podemos acessar os elementos de um array usando o índice do elemento, que começa em 0.
		
		- Exemplo:
            ```java
            int[] numeros = {10, 20, 30, 40, 50};
            System.out.println(numeros[0]); // Imprime 10
            System.out.println(numeros[1]); // Imprime 20
            System.out.println(numeros[2]); // Imprime 30
            System.out.println(numeros[3]); // Imprime 40
            System.out.println(numeros[4]); // Imprime 50
            ```

> [!failure] Quando não usar array
> Arrays não devem ser usados quando não sabemos qual a quantidade de elementos que vamos usar.
> Ou em estrutura muito grandes que não sabemos se virão preenchidas ou não, já que ao declarar um array fixo, o espaço de memória será alocado para todos os elementos, mesmo que não sejam usados.

> [!success] Quando usar array
> Arrays devem ser usados quando sabemos qual a quantidade de elementos que vamos usar. 
> - Um bom exemplo em que ele real onde ele é melhor que um arrayList é quando queremos armazenar os dias da semana. Sabemos que são 7 dias, então podemos criar um array de 7 elementos para armazenar os nomes dos dias da semana. Já que a performance de um array é melhor que a de um arrayList, então nesse caso é melhor usar um array. 

___
- #### ArrayList
	- Um ArrayList é uma estrutura de dados que armazena uma coleção de elementos do mesmo tipo, mas com a diferença de que ele pode crescer ou diminuir dinamicamente. Ou seja, o limite de tamanho dele é a quantidade de memória disponível para o programa.
	- Ao remover um elemento do ArrayList, os elementos seguintes são movidos para preencher o espaço vazio, e ao adicionar um elemento, ele é adicionado no final da lista.
	- ##### Sintaxe:
		- Para usar um ArrayList, é necessário importar a classe `ArrayList` do pacote `java.util`.
		- Como é uma classe do Java, manipulamos ela como um objeto, então para criar um ArrayList, precisamos instanciar ele usando o operador `new`, e para manipular os elementos do ArrayList, usamos os métodos da classe `ArrayList`.

            ```java
            import java.util.ArrayList;
            ```
		- Declaração de um ArrayList vazio
            ```java
            ArrayList<tipo> nomeDoArrayList = new ArrayList<>();
            ```
	- ##### Exemplos:
        ```java
        import java.util.ArrayList; // Importa a classe ArrayList do pacote java.util

        ArrayList<String> nomes = new ArrayList<>(); // Cria um ArrayList de Strings vazio
        nomes.add("Vitor"); // Adiciona o valor "Vitor" ao ArrayList
        nomes.add("João"); // Adiciona o valor "João" ao ArrayList
        nomes.add("Maria"); // Adiciona o valor "Maria" ao ArrayList

        System.out.println(nomes.get(0)); // Imprime "Vitor"
        System.out.println(nomes.get(1)); // Imprime "João"
        System.out.println(nomes.get(2)); // Imprime "Maria"

        nomes.remove(1); // Remove o elemento na posição 1 (João)
        System.out.println(nomes.get(1)); // Imprime "Maria"
        ```
        
>[!info] Métodos mais usados:
> - `add(valor)` - Adiciona um elemento ao final do ArrayList.
> - `get(indice)` - Retorna o elemento na posição especificada.
> - `remove(indice)` - Remove o elemento na posição especificada.
> - `remove(valor)` - Remove a primeira ocorrência do elemento especificado do ArrayList.
> - `size()` - Retorna o número de elementos no ArrayList.
> - `clear()` - Remove todos os elementos do ArrayList.
> - `isEmpty()` - Retorna `true` se o ArrayList estiver vazio, caso contrário, retorna `false`.
> - `contains(valor)` - Retorna `true` se o ArrayList contiver o elemento especificado, caso contrário, retorna `false`.
> - `indexOf(valor)` - Retorna o índice da primeira ocorrência do elemento especificado no ArrayList, ou -1 se o elemento não estiver presente.
> - `set(indice, valor)` - Substitui o elemento na posição especificada pelo novo valor fornecido.
> - `toArray()` - Retorna um array contendo todos os elementos do ArrayList na mesma ordem.
> - `trimToSize()` - Reduz a capacidade do ArrayList para o tamanho atual, liberando memória não utilizada.

>[!failure] Quando não usar ArrayList
> ArrayList não deve ser usado quando sabemos qual a quantidade de elementos que vamos usar. E essa estrutura é pequena.

>[!success] Quando usar ArrayList
> ArrayList deve ser usado quando não sabemos qual a quantidade de elementos que vamos usar, ou quando sabemos que a quantidade de elementos vai variar muito (em grandes quantidades).

___
- #### Laços de repetição
	- `for` - Executa um bloco de código um número específico de vezes.
		- Sintaxe:
			```java
			for (inicialização; condição; incremento) {
				// bloco de código a ser executado
			}
			```
	- `for-each` - Executa um bloco de código para cada elemento em uma coleção ou array.
		- Esse tipo de laço for só funciona com arrays ou coleções que implementam a interface `Iterable`, como `ArrayList`, `HashSet`, etc.
		- Sintaxe:
			```java
			for (tipo elemento : coleção) {
				// bloco de código a ser executado
			}
			``` 
	- `while` - Executa um bloco de código enquanto uma condição for verdadeira.
		- Sintaxe:
            ```java
            while (condição) {
                // bloco de código a ser executado
            }
            ```
	- `do-while` - Executa um bloco de código pelo menos uma vez e depois continua executando enquanto uma condição for verdadeira.
		- Sintaxe:
            ```java
            do {
                // bloco de código a ser executado
            } while (condição);
            ```

> [!attention] Laços while e do-while
> Esses dois tipos de laços de repetição podem causar um loop infinito se a condição nunca for falsa. É importante garantir que a condição eventualmente se torne falsa para evitar loops infinitos.
> Em alguns casos, usamos <font color="#00b0f0">contadores</font> para executar um laço de repetição um número específico de vezes, mas em outros casos, usamos <font color="#00b0f0">condições que dependem de variáveis que podem mudar durante</font> a execução do programa.
>
> É importante lembrar de:
> - <font color="#00b0f0">Sempre atualizar a variável de controle</font> dentro do laço para evitar loops infinitos.
> - Evitar condições que nunca se tornam falsas, como `while (true)` ou `do { ... } while (true)`, a menos que seja intencional.
> - Se for necessário sair de um laço de repetição antes que a condição se torne falsa, podemos usar a instrução `break` para interromper o laço.

- #### Casting (mudanças de tipos)
	- Casting é o processo de converter um tipo de dado em outro tipo de dado.
	- Existem dois tipos de casting:
		1. **Casting implícito** (ou widening) - Ocorre quando um tipo de dado menor é convertido automaticamente para um tipo de dado maior. Por exemplo, um `int` pode ser convertido para um `long` sem a necessidade de uma conversão explícita.
			- Exemplo:
                ```java
                int meuInt = 100;
                long meuLong = meuInt; // Casting implícito
                ```
			- Tipos de conversão implícita:
				- `byte` → `short` → `int` → `long` → `float` → `double`
				- `char` → `int` → `long` → `float` → `double`
					- O resultado de uma conversão de char para int é o valor numérico correspondente ao caractere na tabela ASCII.
		2. **Casting explícito** (ou narrowing) - Ocorre quando um tipo de dado maior é convertido para um tipo de dado menor, e é necessário fazer a conversão explicitamente usando parênteses. Isso pode resultar em perda de dados se o valor não couber no tipo menor.
			- Exemplo:
                ```java
                long meuLong = 100L;
                int meuInt = (int) meuLong; // Casting explícito
                ```
			- Tipos de conversão explícita:
				1. String para tipos primitivos (int, double, etc.) usando métodos de parsing, como `Integer.parseInt()` ou `Double.parseDouble()`.
					- Exemplo:
						- Casting explícito de String para int
                        ```java
                        String minhaString = "100";
                        int meuInt = Integer.parseInt(minhaString); 
                        ```
				2. Tipos primitivos para String usando `String.valueOf()` ou concatenando com uma String vazia.
					- Exemplo:
						- Casting explícito de int para String
                        ```java
                        int meuInt = 100;
                        String minhaString = String.valueOf(meuInt);
                        ```

___
- #### Mapas
	- Um mapa é uma estrutura de dados que armazena pares de chave-valor, permitindo que você associe um valor a uma chave única. Em Java, a interface `Map` é usada para representar mapas, e a classe `HashMap` é uma das implementações mais comuns.
	- ##### Sintaxe:
		- Para usar um mapa, é necessário importar a classe `HashMap` do pacote `java.util`.
            ```java
            import java.util.HashMap;
            ```
		- Declaração de um mapa vazio
            ```java
            HashMap<tipoChave, tipoValor> nomeDoMapa = new HashMap<>();
            ```
	- ##### Exemplos:
        ```java
        import java.util.HashMap; // Importa a classe HashMap do pacote java.util

        HashMap<String, Integer> idades = new HashMap<>(); // Cria um HashMap com chave do tipo String e valor do tipo Integer
        idades.put("Vitor", 20); // Adiciona o par chave-valor ("Vitor", 20) ao mapa
        idades.put("João", 25); // Adiciona o par chave-valor ("João", 25) ao mapa
        idades.put("Maria", 30); // Adiciona o par chave-valor ("Maria", 30) ao mapa

        System.out.println(idades.get("Vitor")); // Imprime 20
        System.out.println(idades.get("João")); // Imprime 25
        System.out.println(idades.get("Maria")); // Imprime 30

        idades.remove("João"); // Remove o par chave-valor com a chave "João"
        System.out.println(idades.get("João")); // Imprime null, pois "João" foi removido
        ```
	- ##### Percorrendo um mapa
		- Podemos percorrer um mapa usando um laço `for-each` para iterar sobre as chaves ou os valores do mapa.
		- Exemplo:
            ```java
            HashMap<String, Integer> idades = new HashMap<>();
            idades.put("Vitor", 20);
            idades.put("João", 25);
            idades.put("Maria", 30);

            // Percorrendo as chaves do mapa
            for (String chave : idades.keySet()) {
                System.out.println("Chave: " + chave + ", Valor: " + idades.get(chave));
            }

            // Percorrendo os valores do mapa
            for (Integer valor : idades.values()) {
                System.out.println("Valor: " + valor);
            }
            ```

___
## Compilação e execução
### <font color="#ffff00">Compilação</font>
Podemos compilar e executar o nosso programa Java sem a necessidade de um IDE, usando apenas o terminal ou prompt de comando.
- Para compilar um arquivo Java, usamos o comando `javac` seguido do nome do arquivo. Por exemplo, para compilar um arquivo chamado `MeuPrograma.java`, usamos o comando:
	```bash
	javac MeuPrograma.java
	```
- Fazendo isso com a classe Main, todas as outras classes que são instanciadas dentro da Main também serão compiladas, desde que estejam no mesmo diretório.
- Essa compilação vai gerar um arquivo `MeuPrograma.class`, que é o bytecode do Java, que pode ser executado pela JVM (Java Virtual Machine).
### <font color="#245bdb">Execução</font>
Para executar o programa compilado, usamos o comando `java` seguido do nome da classe principal (sem a extensão `.class`). Por exemplo, para executar a classe `MeuPrograma`, usamos o comando:
```bash
java MeuPrograma
```
