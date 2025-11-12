import java.util.Scanner;

import controller.CalculatorController;
import view.CalculatorView;

public class Main {

    public static void main(String[] args) {
        CalculatorController controller = new CalculatorController();
        CalculatorView view = new CalculatorView();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: ");
            double firstOperand = scanner.nextDouble();

            System.out.print("Digite a operação (+, -, *, /): ");
            String operator = scanner.next();

            System.out.print("Digite o segundo número: ");
            double secondOperand = scanner.nextDouble();

            try {
                double result = controller.calculate(operator, firstOperand, secondOperand);
                view.showResult(firstOperand, operator, secondOperand, result);
            } catch (IllegalArgumentException | ArithmeticException exception) {
                view.showError(exception.getMessage());
            }
        }
    }
}
