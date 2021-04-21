package com.javaMentor.numbersDTO;

public class NumbersDTO {
    private final int firstNumber;
    private final int secondNumber;
    private final String operator;
    private final boolean isRoman;
    private int decision;

    public NumbersDTO(int firstNumber, int secondNumber, String operator, boolean isArabic) {
        super();
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
        this.isRoman = isArabic;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public String getOperator() {
        return operator;
    }

    public boolean isRoman() {
        return isRoman;
    }

    public int getDecision() {
        return decision;
    }

    public void setDecision(int decision) {
        this.decision = decision;
    }

}
