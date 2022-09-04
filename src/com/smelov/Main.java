package com.smelov;

import com.smelov.service.Converter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");
        List<Set> setList = new ArrayList<>();
        char[] fromFile = new char[1000];
        StringBuilder sb = new StringBuilder();

        try (FileReader fileReader = new FileReader(inputFile)) {
            int c;
            while ((c = fileReader.read()) != -1) {
                sb.append((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(sb);
        System.out.println("---");

        Converter converter = new Converter();
        converter.StrBldToSet(sb);

    }
}
