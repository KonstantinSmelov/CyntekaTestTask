package com.smelov;

import com.smelov.service.FileToList;
import com.smelov.service.StrToSet;
import com.smelov.service.Trim;

import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        List<String> stringList = FileToList.fileToList(inputFile);

        System.out.println(stringList);

        //---------------------------------

    }
}
