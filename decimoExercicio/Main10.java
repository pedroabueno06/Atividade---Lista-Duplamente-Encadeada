public class Main10 {
    public static void main(String[] args) {

        ListaDuplamenteEncadeada10 lista10 = new ListaDuplamenteEncadeada10();

        lista10.inserirNoFinal10(10);
        lista10.inserirNoFinal10(20);
        lista10.inserirNoFinal10(30);
        lista10.inserirNoFinal10(40);

        lista10.imprimir10();

        lista10.removerValor10(10); // início
        lista10.imprimir10();

        lista10.removerValor10(30); // meio
        lista10.imprimir10();

        lista10.removerValor10(40); // final
        lista10.imprimir10();

        lista10.removerValor10(999); // não existe
    }
}
