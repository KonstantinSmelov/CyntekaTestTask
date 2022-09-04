package com.smelov.service;

public class Converter {

    public void StrBldToSet(StringBuilder sb) {
        StringBuilder firstNumber = new StringBuilder();
        for (int x = 0; x < sb.length(); x++) {
            if (sb.charAt(x) != '\n') {
                firstNumber.append(sb.charAt(x));
                break;
            }
        }
        System.out.println(Integer.parseInt(firstNumber.toString()));
    }
}
