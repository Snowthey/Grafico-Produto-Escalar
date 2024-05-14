public class ProdutoEscalarComplexidadeReduzida {

    public static long calcularProdutoEscalar(int[] vetor1, int[] vetor2) throws IllegalArgumentException {
        if (vetor1.length != vetor2.length) {
            throw new IllegalArgumentException("Os vetores devem ter o mesmo tamanho");
        }

        return calcularProdutoEscalar(vetor1, vetor2, 0, vetor1.length);
    }

    private static long calcularProdutoEscalar(int[] vetor1, int[] vetor2, int start, int end) {
        if (end - start <= 0) {
            return 0;
        } else if (end - start == 1) {
            return (long) vetor1[start] * vetor2[start];
        } else {
            int middle = start + (end - start) / 2;
            long leftResult = calcularProdutoEscalar(vetor1, vetor2, start, middle);
            long rightResult = calcularProdutoEscalar(vetor1, vetor2, middle, end);
            return leftResult + rightResult;
        }
    }
}
