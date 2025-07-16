# Curso de Java para iniciantes

_Aqui vou colocar as anotações de todas as aulas_

**Esse README vai ser atualizado a cada aula**

# Aulas 1, 2, 3 e 4
São introdução ao curso e tutorias de como instalar o JDK na máquina

# Aula 05 - Primeiro Programa em Java
```java
class HelloWorld {
	public static void main (Strinb[] args) {
		System.out.println("Hello World!");
	}
}
```

### Entendendo o código
+ `class` -> Declaração da Classe
+ `HelloWorld` -> Nome da classe (Sempre começa com letra MAIUSCULA)
+ `public static void main (String[] args) {}` -> Método da classe
+ `public static` -> Modificadores de acesso
+ `void` -> Tipo de retorno do método
+ `main` -> Nome do Método (O main sempre vai ser main, mas quando criarmos nossa classe podemos dar o nome que quisermos)
+ `(String[] args)` -> Parâmetros/Argumentos do método
+ `System.out.println("Hello World!");` -> Nosso código
+ `{ ... }` -> Blocos de código entre chaves

### Sobre a aula
Nessa aula criamos um `arquivo.java` com o código acima e compilamos ele manualmente usando o terminal com `javac`, gerando assim um `arquivo.class`, que pode então ser interpretado pela JVM (Java Virtual Machine).

## Tema de Casa da aula 5
1. Criar um arquivo chamado OlaMundo.java
2. Implementar um programa Java que imprima na tela "Olá Mundo!"
3. Compilar e Executar o programa

## Aula 06 - Passando Argumentos para o Programa
+ args do método main -> Quando rodamos um programa pela linha de comando em java, ele pode receber argumentos. O `args` é um array de Strings, por isso temos o `String[]` antes da palavra args.

### Código da aula
```java
public class Argumentos {
    public static void main(String[] args) {
        System.out.println("Você digitou " + args[0]); // Acessando o indice 0 do array de Strings
    }
}
```

### Compilando e executando o código da aula
```bash
# Compilando
javac Argumentos.java # Retorna o Argumentos.class
# Executando o arquivo compilado
java Argumentos Vitor # Só podemos passar uma palavra
# ou se quisermos uma frase
java Argumentos "Vitor Hugo Otto" # Assim tudo o que está entre aspas é o indice 0 do vetor "args"
```

# Tema de casa da aula 6
1. Criar um arquivo chamado Argumentos2.java
2. Implementar um programa Java que escreva na tela "Olá Mundo!" + o argumento passado para o programa
3. Compilar e executar o programa