package model.operations;

import model.OperationStrategy;

public class DivisionStrategy implements OperationStrategy {
    @Override
    public double execute(double firstOperand, double secondOperand) {
        if (secondOperand == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida");
        }
        return firstOperand / secondOperand;
    }
}
