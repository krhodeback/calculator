package com.javaMentor.converter;

import com.javaMentor.numbersDTO.NumbersDTO;

public class NumbersConverter implements Converter {

    @Override
    public String converte(NumbersDTO numbers) {
        if (numbers.isRoman()) {
            return converte(numbers.getDecision());
        }
        return String.valueOf(numbers.getDecision());
    }

    @Override
    public NumbersDTO converte(String[] numbersAndOperator) {
        try {
            if ((Integer.parseInt(numbersAndOperator[0]) >= 10) | (Integer.parseInt(numbersAndOperator[2]) >= 10)) {
                throw new IllegalArgumentException("Cant calculate with number less than 0 and more than 10");
            } else if ((Integer.parseInt(numbersAndOperator[0]) <= 1)
                    | (Integer.parseInt(numbersAndOperator[2]) <= 1)) {
                throw new IllegalArgumentException("Cant calculate with number less than 0 and more than 10");
            } else {

                return new NumbersDTO(Integer.parseInt(numbersAndOperator[0]), Integer.parseInt(numbersAndOperator[2]),
                        numbersAndOperator[1], false);
            }
        } catch (Exception e) {

        }
        return new NumbersDTO(converte(numbersAndOperator[0]), converte(numbersAndOperator[2]), numbersAndOperator[1],
                true);

    }

    private int converte(String romanNumber) {
        romanNumber.toUpperCase();
        if (romanNumber.equals("I")) {
            return 1;
        } else if (romanNumber.equals("II")) {
            return 2;
        } else if (romanNumber.equals("III")) {
            return 3;
        } else if (romanNumber.equals("IV")) {
            return 4;
        } else if (romanNumber.equals("V")) {
            return 5;
        } else if (romanNumber.equals("VI")) {
            return 6;
        } else if (romanNumber.equals("VII")) {
            return 7;
        } else if (romanNumber.equals("VIII")) {
            return 8;
        } else if (romanNumber.equals("IX")) {
            return 9;
        } else if (romanNumber.equals("X")) {
            return 10;
        } else {
            throw new IllegalArgumentException(
                    "Cant calculate with number less than 0 and more than 10 or different spellings of numbers");
        }
    }

    private String converte(int decision) {
        if (decision <= 0) {
            throw new IllegalArgumentException("Roman numerals cannot be less than zero");
        }
        StringBuilder roman = new StringBuilder();
        int[] values = { 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] romanLiterals = { "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        for (int i = 0; i < values.length; i++) {
            while (decision >= values[i]) {
                decision -= values[i];
                roman.append(romanLiterals[i]);
            }

        }
        return roman.toString();
    }

}
