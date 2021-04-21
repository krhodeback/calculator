package com.javaMentor.computation;

import com.javaMentor.numbersDTO.NumbersDTO;

public class NumbersCalculate implements Computation {

    @Override
    public NumbersDTO calculate(NumbersDTO numbers) {
        if (numbers.getOperator().equals("+")) {
            numbers.setDecision(numbers.getFirstNumber() + numbers.getSecondNumber());
            return numbers;
        } else if (numbers.getOperator().equals("-")) {
            numbers.setDecision(numbers.getFirstNumber() - numbers.getSecondNumber());
            return numbers;
        } else if (numbers.getOperator().equals("*")) {
            numbers.setDecision(numbers.getFirstNumber() * numbers.getSecondNumber());
            return numbers;
        } else if (numbers.getOperator().equals("/")) {
            numbers.setDecision(numbers.getFirstNumber() / numbers.getSecondNumber());
            return numbers;
        } else if (numbers.getOperator().equals("%")) {
            numbers.setDecision(numbers.getFirstNumber() % numbers.getSecondNumber());
            return numbers;
        } else {
            throw new IllegalArgumentException("Cant calculate whith this operator");
        }

    }

}
