import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.data.xy.XYSeries;

public class Main {
    public static void main(String[] args) {

        XYSeries seriesBase = new XYSeries("Algoritmo Base");
        XYSeries seriesComplexidadeReduzida = new XYSeries("Complexidade Reduzida");

        int tamanhoMaximo = 1000;

        for (int tamanho = 1; tamanho <= tamanhoMaximo; tamanho++) {
            int[] vetor1 = new int[tamanho];
            int[] vetor2 = new int[tamanho];

            for (int i = 0; i < tamanho; i++) {
                vetor1[i] = (int) (Math.random() * 100);
                vetor2[i] = (int) (Math.random() * 100);
            }

            long operacoesBase = ProdutoEscalar.calcularProdutoEscalar(vetor1, vetor2);
            long operacoesComplexidadeReduzida = ProdutoEscalarComplexidadeReduzida.calcularProdutoEscalar(vetor1, vetor2);

            seriesBase.add(tamanho, operacoesBase);
            seriesComplexidadeReduzida.add(tamanho, operacoesComplexidadeReduzida);
        }

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(seriesBase);
        dataset.addSeries(seriesComplexidadeReduzida);

        Grafico grafico = new Grafico(dataset);
    }

}

