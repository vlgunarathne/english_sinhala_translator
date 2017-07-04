/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vlg.translator;

import edu.stanford.nlp.tagger.maxent.MaxentTagger;

/**
 *
 * @author zyber
 */
public class ES_Translator {
    public static void main(String[] args) {
        // Initialize the tagger
        MaxentTagger tagger = new MaxentTagger("com/vlg/tagger/english-bidirectional-distsim.tagger");
 
        // The sample string
        String sample = "This is a sample text";
 
        // The tagged string
        String tagged = tagger.tagString(sample);
 
        // Output the result
        System.out.println(tagged);
    }
}
