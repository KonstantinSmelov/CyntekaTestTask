package com.smelov.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConversionService {

    //разделение всех строчек из файла на первое и второе множества, удаление окончаний из слов перед сохранением в множества
    public static void listToListOfSet(List<String> stringFromFile, List<Set<String>> firstPartSetsList, List<Set<String>> secondPartSetsList) {
        int firstLength = Integer.parseInt(stringFromFile.get(0));

        for (int x = 1; x < stringFromFile.size(); x++) {
            if (x <= firstLength) {
                firstPartSetsList.add(TrimService.trimSet(ConversionService.stringToSet(stringFromFile.get(x))));
            }
            if (x > firstLength && x != firstLength + 1) {
                secondPartSetsList.add(TrimService.trimSet(ConversionService.stringToSet(stringFromFile.get(x))));
            }
        }
    }

    //разделение всех строчек из файла на первую и вторую часть
    public static void splitList(List<String> stringFromFile, List<String> firstPartList, List<String> secondPartList) {
        int firstLength = Integer.parseInt(stringFromFile.get(0));

        for (int x = 1; x < stringFromFile.size(); x++) {
            if (x <= firstLength) {
                firstPartList.add(stringFromFile.get(x));
            }
            if (x > firstLength && x != firstLength + 1) {
                secondPartList.add(stringFromFile.get(x));
            }
        }
    }

    //перевод слов в строке в множество; каждый элемент множества - одно слово из строки
    private static Set<String> stringToSet(String string) {

        Set<String> set = new HashSet<>();
        StringBuilder tmpStr = new StringBuilder();

        for (char c : string.toCharArray()) {
            if (c == ' ') {
                set.add(tmpStr.toString());
                tmpStr = new StringBuilder();
            } else {
                tmpStr.append(c);
            }
        }
        set.add(tmpStr.toString());

        return set;
    }
}
