class ListaDuplamenteEncadeada2 {
        private No2 inicio2;
        private No2  fim2;

        // CONSTRUTOR → inicializa lista vazia
        public ListaDuplamenteEncadeada2() {
            this.inicio2 = null;
            this.fim2 = null;
        }

        // VERIFICAR SE ESTÁ VAZIA
        public boolean estaVazia() {
            return inicio2 == null;
        }

        private static class No2 {
            private int valor2;
            private No2 anterior2;
            private No2 proximo2;

            private No2(int valor2) {
                this.valor2 = valor2;
                this.anterior2 = null;
                this.proximo2 = null;
            }
        }
    }