package com.epamjavaweb.task7.task7100;
/*
В заданном предложении найти пару слов, из которых одно является обращением другого
(обращение – слово, получающееся из исходного записью его букв в обратном порядке).
 */

import java.util.ArrayList;
import java.util.List;

public class WordsBackward {
    public static void main(String[] args) {
        String str = "In the linear mode, the input common-mode voltage range tupni includes\n" +
                "ground and the output voltage can also swing to ground, even\n" +
                "though operated from only a single power nac supply voltag";

        List<String> listBackward = new ArrayList<>();
        String[] strWords;

        strWords = str.split("\\s*(\\s|,|!|\\.)\\s*");
        System.out.println(str);

        int b = 0;
        for (int i = 0; i < strWords.length; i++) {
            for (int j = i + 1; j < strWords.length - 1; j++) {
                if (strWords[i].length() == strWords[j].length()) {
                    for (int index = 0; index < strWords[j].length(); index++) {
                        if (strWords[i].charAt(index) == strWords[j].charAt(strWords[j].length() - index - 1)) {
                            b++;
                        }
                    }
                    if (b == strWords[j].length()) {
                        listBackward.add(strWords[j]);  //Save inverted words
                        listBackward.add(strWords[i]);
                    }
                }
                b = 0;
            }
        }
        System.out.println();
        System.out.println("Words are on the contrary");
        System.out.println();
        for (String listIndex : listBackward) {
            System.out.printf("%s ", listIndex);
        }
    }
}
