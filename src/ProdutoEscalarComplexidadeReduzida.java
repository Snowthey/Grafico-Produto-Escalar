public class ProdutoEscalarComplexidadeReduzida {

    public static int calcularProdutoEscalar(int[] vetor1, int[] vetor2) {
        if (vetor1.length != vetor2.length) {
            System.out.println("Os vetores devem ter o mesmo tamanho");
            return -1;
        }


        int resultado = 0;

        for (int i = 0; i < vetor1.length; i++) {
            resultado += vetor1[i] * vetor2[i];
        }

        return resultado;
    }
}
