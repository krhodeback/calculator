package com.javaMentor.reader;

import java.util.Scanner;

public class NumbersReader implements Reader {
    private final static String MASSAGE = "Enter two numbers and operator separated by a space";
    private final static String SEPARATOR = " ";
    private Scanner in = null;

    @Override
    public String[] read() {
        in = new Scanner(System.in);
        System.out.println(MASSAGE);
        String line = in.nextLine();
        in.close();
        return line.split(SEPARATOR);
    }

}
