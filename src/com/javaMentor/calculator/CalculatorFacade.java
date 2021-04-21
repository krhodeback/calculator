package com.javaMentor.calculator;

import com.javaMentor.computation.Computation;
import com.javaMentor.converter.Converter;
import com.javaMentor.numbersDTO.NumbersDTO;
import com.javaMentor.reader.Reader;

public class CalculatorFacade {
    private final Reader reader;
    private final Converter converter;
    private final Computation computation;
    private NumbersDTO numbers;

    public CalculatorFacade(Reader reader, Converter converter, Computation computation) {
        super();
        this.reader = reader;
        this.converter = converter;
        this.computation = computation;
    }

    public String facade() {
        String[] numbersAndOperator = reader.read();
        numbers = converter.converte(numbersAndOperator);
        return converter.converte(computation.calculate(numbers));

    }

}
