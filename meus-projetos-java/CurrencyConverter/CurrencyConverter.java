public class CurrencyConverter {
    double cotacaoDolar;

    double converterParaReais(double valorEmDolar) {
        double valorComIof = valorEmDolar + (valorEmDolar * 0.06);
        double valorEmReais = valorComIof * cotacaoDolar;
        return valorEmReais;
    }
}
