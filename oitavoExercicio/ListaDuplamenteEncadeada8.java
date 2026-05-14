public class ListaDuplamenteEncadeada8 {
    private No8 inicio8;
    private No8 fim8;

    public boolean estaVazia8() {
        return inicio8 == null;
    }

    public void inserirNoFinal8(int valor8) {
        No8 novo = new No8(valor8);

        if (estaVazia8()) {
            inicio8 = fim8 = novo;
        } else {
            novo.anterior8 = fim8;
            fim8.proximo8 = novo;
            fim8 = novo;
        }
    }

    // BUSCA (retorna nó)
    public No8 buscar8(int valor8) {

        No8 atual8 = inicio8;

        while (atual8 != null) {

            if (atual8.valor8 == valor8) {
                return atual8;
            }

            atual8 = atual8.proximo8;
        }

        return null;
    }

    // BUSCA (retorna índice)
    public int buscarIndice8(int valor8) {

        No8 atual8 = inicio8;
        int indice8 = 0;

        while (atual8 != null) {

            if (atual8.valor8 == valor8) {
                return indice8;
            }

            atual8 = atual8.proximo8;
            indice8++;
        }

        return -1;
    }
}
