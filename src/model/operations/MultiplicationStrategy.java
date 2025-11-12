package model.operations;

import model.OperationStrategy;

public class MultiplicationStrategy implements OperationStrategy {
    @Override
    public double execute(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }
}
