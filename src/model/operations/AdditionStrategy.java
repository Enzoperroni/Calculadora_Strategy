package model.operations;

import model.OperationStrategy;

public class AdditionStrategy implements OperationStrategy {
    @Override
    public double execute(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }
}
