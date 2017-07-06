/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vlg.translator;

import edu.stanford.nlp.tagger.maxent.MaxentTagger;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author zyber
 */
public class ES_Translator {

    public HashMap<String, String> eng_sin_wordsMap;

    public ES_Translator() throws FileNotFoundException {
        try {
            File wordList = new File(getClass().getResource("/com/vlg/resources/words.txt").getFile());

            eng_sin_wordsMap = new HashMap<String, String>();
            Scanner wordScan = new Scanner(wordList);
            while (wordScan.hasNextLine()) {
                String splitWord[] = wordScan.nextLine().split("_");
                eng_sin_wordsMap.put(splitWord[0], splitWord[1]);
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Dictionary file not available.");
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        

    }
}
