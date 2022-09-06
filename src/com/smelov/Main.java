package com.smelov;

import com.smelov.service.FileService;
import com.smelov.service.ConversionService;
import com.smelov.service.MatchService;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        List<String> stringFromFile = FileService.fileToList(inputFile);
        List<Set<String>> firstPartSetsList = new ArrayList<>();
        List<Set<String>> secondPartSetsList = new ArrayList<>();

        ConversionService.listToListOfSet(stringFromFile, firstPartSetsList, secondPartSetsList);

        Map<Integer, Integer> matchesMap = MatchService.matchesSearch(firstPartSetsList, secondPartSetsList);

        List<String> firstPartList = new ArrayList<>();
        List<String> secondPartList = new ArrayList<>();
        List<String> listToOut = new ArrayList<>();
        ConversionService.splitList(stringFromFile, firstPartList, secondPartList);

        //компоновка для записи в файл
        for (int x = 0; x < firstPartSetsList.size(); x++) {
            if (matchesMap.containsKey(x)) {
                listToOut.add(firstPartList.get(x) + " : " + secondPartList.get(matchesMap.get(x)));
            } else {
                listToOut.add(firstPartList.get(x) + " : " + "?");
            }
        }

        System.out.println(listToOut);

        FileService.listToFile(outputFile, listToOut);

    }
}
