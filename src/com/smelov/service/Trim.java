package com.smelov.service;

import java.util.HashSet;
import java.util.Set;

public class Trim {

    //TODO переделать
    //робкая попытка выделения что-то типа корня слова :)
    public static Set<String> trimSet(Set<String> set) {

        Set<String> trimStringSet = new HashSet<>();

        for(String str : set) {
            trimStringSet.add(Trim.trimString(str));
        }
        return trimStringSet;
    }

    private static String trimString(String string) {

        double length = string.length();
        double trimLength = string.length();

        if(length >= 10) {
            trimLength = length - (length * 41 / 100);
        }
        if(length >= 8 && length < 10) {
            trimLength = length - (length * 25 / 100);
        }
        if(length >= 6 && length < 8) {
            trimLength = length - (length * 15 / 100);
        }

        return string.substring(0, (int)trimLength);
    }
}
