package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> words = DataLoader.loadWords();
        String word = pickRandomWord(words);
        playGame(word);
    }

    private static void playGame(String word) {

        List<Character> playerGuesses = new ArrayList<>();
        int wrongCount = 0;
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            if (!getPlayerGuesses(keyboard, word, playerGuesses)) {
                wrongCount++;
            }

            printMen(wrongCount);
            if (isLose(wrongCount) || isWinPrintStars(word, playerGuesses)) {
                break;
            }
        }
        printEndGame(word, playerGuesses);
    }
    private static boolean isLose(int wrongCount){
        return wrongCount >= 6;
    }
}


    private static String pickRandomWord(List<String> words) {
        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));
        System.out.println(word); //чтобы видеть искомое слово
        List<Character> playerGuesses = new ArrayList<>();
        printWordStars(word, playerGuesses);
        int wrongCount = 0;
        return word;
    }

    private static boolean isWinPrintStars(String word, List<Character> playerGuesses) {
        int correctCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (playerGuesses.contains(word.charAt(i))) {
                System.out.println(word.charAt(i));
                correctCount++;
            } else System.out.println("*");
        }
        System.out.println();
        return word.length() == correctCount;
    }

    private static void printMen(Integer wrongCount) {

    }

    private static void printEndGame(String word, List<Character> playerGuesses) {
        System.out.println(isWinPrintStars(word, playerGuesses)
                ? "!!!! You Win !!!!"
                : "You are LOSER! Game over!!!");
    }

