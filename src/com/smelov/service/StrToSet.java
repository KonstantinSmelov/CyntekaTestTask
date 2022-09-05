package com.smelov.service;

import java.util.HashSet;
import java.util.Set;

public class StrToSet {

    //перевод слов в строке в множество; каждый элемент множества - одно слово из строки
    public static Set<String> strToSet(String string) {

        Set<String> stringSet = new HashSet<>();
        StringBuilder tmpStr = new StringBuilder();

        for (char c : string.toCharArray()) {
            if (c == ' ') {
                stringSet.add(tmpStr.toString());
                tmpStr = new StringBuilder();
            } else {
                tmpStr.append(c);
            }
        }
        stringSet.add(tmpStr.toString());

        return stringSet;
    }
}
