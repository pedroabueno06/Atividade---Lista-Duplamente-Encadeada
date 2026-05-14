public class ListaDuplamenteEncadeada3 {
    private No3 inicio3;
    private No3 fim3;

    public ListaDuplamenteEncadeada3() {
        inicio3 = null;
        fim3 = null;
    }

    public boolean estaVazia3() {
        return inicio3 == null;
    }

    // Inserir no início
    public void inserirNoInicio3(int valor3) {
        No3 novo = new No3(valor3);

        // Caso 1: lista vazia
        if (estaVazia3()) {
            inicio3 = novo;
            fim3 = novo;
        }
        // Caso 2: lista com elementos
        else {
            novo.proximo3 = inicio3;
            inicio3.anterior3 = novo;
            inicio3 = novo;
        }
    }

    public void mostrar3() {
        No3 atual = inicio3;

        while (atual != null) {
            System.out.print(atual.valor3 + " ");
            atual = atual.proximo3;
        }

        System.out.println();
    }
}