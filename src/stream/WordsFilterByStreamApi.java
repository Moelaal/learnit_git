package stream;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class WordsFilterByStreamApi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any words separated by space");
        String userInput = sc.nextLine();
        System.out.println("Please enter minumum word length to filter words: ");
        int minLength = sc.nextInt();

        String[] words  = userInput.split("\\s+");
        String[] filteredWord = filterWordsByLength(minLength,words);
        System.out.println(Arrays.toString(filteredWord));


    }
    public static String[] filterWordsByLength(int minLength,String[] words){
        String[] filterArray = new String[words.length];
        for(int i = 0;i<words.length;i++){
            if(words[i].length() >= minLength){
                filterArray[i] = words[i];
            }
        }
        filterArray = filterNull(filterArray);
        return filterArray;
    }


    private static String[] filterNull(String[]arr){
        int wordsInt = 0;
        for(String word:arr){
            if(word!=null){
                wordsInt++;
            }
        }

        String[] wordint = new String[wordsInt];
        int index = 0;
        for(String word:arr){
            if(word!=null){
                wordint[index++] = word;
            }
        }
        return wordint;
    }
}
