package com.javaMentor.calculator;

import com.javaMentor.computation.NumbersCalculate;
import com.javaMentor.converter.NumbersConverter;
import com.javaMentor.reader.NumbersReader;

public class Main {

    public static void main(String[] args) {
        CalculatorFacade facade = new CalculatorFacade(new NumbersReader(), new NumbersConverter(),
                new NumbersCalculate());
        System.out.println(facade.facade());
    }

}
