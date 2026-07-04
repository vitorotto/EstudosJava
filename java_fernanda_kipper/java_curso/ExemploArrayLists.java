package java_curso;

public class ExemploArrayLists {

    /* === ARRAYLISTS EM JAVA === */

    public void exemploArrayLists() {
        
        // Exemplo de uso de ArrayList
        System.out.println("\nExemplo de ArrayList:");
        java.util.ArrayList<String> listaDeNomes = new java.util.ArrayList<>();
        listaDeNomes.add("Vitor");
        listaDeNomes.add("Fernanda");
        listaDeNomes.add("Kipper");

        // Exemplo de uso de laço de repetição for-each com ArrayList
        System.out.println("\nExemplo de ArrayList com for-each:");
        for (String nome : listaDeNomes) {
            System.out.println("Nome na lista (for-each): " + nome);
        }
        
        // Exemplo de uso de laço de repetição for com ArrayList
        System.out.println("\nExemplo de ArrayList com for:");
        for (int i = 0; i < listaDeNomes.size(); i++) {
            System.out.println("Nome na lista (for): " + listaDeNomes.get(i));
        }

        // Exemplo de uso de laço de repetição while com ArrayList
        System.out.println("\nExemplo de ArrayList com while:");
        int index = 0;
        while (index < listaDeNomes.size()) {
            System.out.println("Nome na lista (while): " + listaDeNomes.get(index));
            index++;
        }

        // Exemplo de uso de laço de repetição do-while com ArrayList
        System.out.println("\nExemplo de ArrayList com do-while:");
        int outroIndex = 0;
        do {
            System.out.println("Nome na lista (do-while): " + listaDeNomes.get(outroIndex));
            outroIndex++;
        } while (outroIndex < listaDeNomes.size());

        // Exemplo de uso de laço de repetição for-each com ArrayList e método forEach
        System.out.println("\nExemplo de ArrayList com forEach (MÉTODO):");  
        listaDeNomes.forEach(nome -> System.out.println("Nome na lista (método forEach): " + nome));

    }
}
