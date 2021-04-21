package com.javaMentor.converter;

import com.javaMentor.numbersDTO.NumbersDTO;

public interface Converter {
    NumbersDTO converte(String[] numbersAndOperator);

    String converte(NumbersDTO numbers);
}
