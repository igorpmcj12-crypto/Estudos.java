public class Pessoa {
    String nome;
    double peso;
    double altura;

    double calcularIMC() {
        return peso / (altura * altura);
    }

    void classificarIMC() {
        double imc = calcularIMC();
        System.out.printf("Seu IMC e de: %.2f%n", imc);
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        }
        else if (imc < 25) {
            System.out.println("Peso Normal");
        }
        else if (imc < 30) {
            System.out.println("Sobrepeso");
        }
        else if (imc < 35) {
            System.out.println("Obesidade Grau 1");
        }
        else if (imc < 40) {
            System.out.println("Obesidade Grau 2");
        }
        else {
            System.out.println("Obesidade Grau 3");
        }
    }
}
