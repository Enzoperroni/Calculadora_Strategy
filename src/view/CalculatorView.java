package view;

public class CalculatorView {

    public void showResult(double firstOperand, String operator, double secondOperand, double result) {
        System.out.printf("Resultado: %.2f %s %.2f = %.2f%n", firstOperand, operator, secondOperand, result);
    }

    public void showError(String message) {
        System.err.println("Erro: " + message);
    }
}
