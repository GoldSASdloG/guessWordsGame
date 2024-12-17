package org.example;
import com.sun.tools.javac.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataLoader {
    public static final String WORDS_PATH_NAME = "src/main/resources/words.txt";

    List<String> words = new ArrayList<>();
    try {
        Scanner scanner = new Scanner(new File(WORDS_PATH_NAME));

        while (scanner.hasNext()){
            words.add(scanner.nextLine());
        }
    } catch (FileNotFoundException e){
        System.out.println("File not found exception!!!");
    }
    Scanner keyboard = new Scanner(System.in);

}

