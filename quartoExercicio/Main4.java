public class Main4 {
    public static void main(String[] args) {

        ListaDuplamenteEncadeada4 lista4 = new ListaDuplamenteEncadeada4();

        System.out.println("Testando a inserção no final da lista duplamente encadeada:");
        // Lista vazia
        lista4.inserirNoFinal4(10);
        lista4.mostrar4();

        // Lista com elementos
        lista4.inserirNoFinal4(20);
        lista4.inserirNoFinal4(30);
        lista4.mostrar4();
    }
}
