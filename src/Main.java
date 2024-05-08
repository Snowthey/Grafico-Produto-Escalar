import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.data.xy.XYSeries;

import javax.swing.*;
import java.awt.*;

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

                long operacoesBase = calcularOperacoes(vetor1, vetor2, true);
                long operacoesComplexidadeReduzida = calcularOperacoes(vetor1, vetor2, false);

                seriesBase.add(tamanho, operacoesBase);
                seriesComplexidadeReduzida.add(tamanho, operacoesComplexidadeReduzida);
            }

            XYSeriesCollection dataset = new XYSeriesCollection();
            dataset.addSeries(seriesBase);
            dataset.addSeries(seriesComplexidadeReduzida);

            Grafico grafico = new Grafico(dataset);
        }

        public static long calcularOperacoes(int[] vetor1, int[] vetor2, boolean algoritmoBase) {
            long operacoes = 0;

            if (algoritmoBase) {
                for (int i = 0; i < vetor1.length; i++) {
                    operacoes += 2;
                }
            } else {
                for (int i = 0; i < vetor1.length; i++) {
                    operacoes += 1;
                }
            }

            return operacoes;
        }
}

