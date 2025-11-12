package controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import model.OperationStrategy;
import model.operations.AdditionStrategy;
import model.operations.DivisionStrategy;
import model.operations.MultiplicationStrategy;
import model.operations.SubtractionStrategy;

public class CalculatorController {

    private final Map<String, OperationStrategy> strategies = new HashMap<>();

    public CalculatorController() {
        strategies.put("+", new AdditionStrategy());
        strategies.put("-", new SubtractionStrategy());
        strategies.put("*", new MultiplicationStrategy());
        strategies.put("/", new DivisionStrategy());
    }

    public double calculate(String operator, double firstOperand, double secondOperand) {
        OperationStrategy strategy = Optional.ofNullable(strategies.get(operator))
                .orElseThrow(() -> new IllegalArgumentException("Operação inválida: " + operator));
        return strategy.execute(firstOperand, secondOperand);
    }
}
