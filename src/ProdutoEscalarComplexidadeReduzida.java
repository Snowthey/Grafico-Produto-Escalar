public class ProdutoEscalarComplexidadeReduzida {

    public static long calcularProdutoEscalar(int[] vetor1, int[] vetor2) throws IllegalArgumentException {
        if (vetor1.length != vetor2.length) {
            throw new IllegalArgumentException("Os vetores devem ter o mesmo tamanho");
        }

        long resultado = 0;

        for (int i = 0; i < vetor1.length; i++) {
            resultado += (long) vetor1[i] * vetor2[i];
        }

        return resultado;
    }

}
