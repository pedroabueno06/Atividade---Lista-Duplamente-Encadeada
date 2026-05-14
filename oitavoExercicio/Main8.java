public class Main8 {
    public static void main(String[] args) {
        
        ListaDuplamenteEncadeada8 lista8 = new ListaDuplamenteEncadeada8();
            
            // Inserindo elementos na lista
            lista8.inserirNoFinal8(10);
            lista8.inserirNoFinal8(20);
            lista8.inserirNoFinal8(30);
            lista8.inserirNoFinal8(40);

            // Valor que vamos procurar
            int valorProcurado = 20;

            No8 resultado8 = lista8.buscar8(valorProcurado);

            if (resultado8 != null) {
                System.out.println("Elemento encontrado: " + resultado8.valor8);
            } else {
                System.out.println("Elemento não encontrado");
            }
    }
}