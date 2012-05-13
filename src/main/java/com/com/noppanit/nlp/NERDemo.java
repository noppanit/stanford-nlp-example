package com.com.noppanit.nlp;

import edu.stanford.nlp.ie.AbstractSequenceClassifier;
import edu.stanford.nlp.ie.crf.CRFClassifier;

import java.io.*;
import java.net.URL;

public class NERDemo {

    public static void main(String[] args) throws IOException {
        new NERDemo().classifyInformation();
    }

    private void classifyInformation() throws IOException {
        URL serializedClassifier = this.getClass().getResource("/classifiers/all.3class.distsim.crf.ser.gz");
        File file = new File(serializedClassifier.getFile());
        AbstractSequenceClassifier classifier = CRFClassifier.getClassifierNoExceptions(file.getAbsolutePath());

        String s1 = "Steve Jobs made Apple awesome";
        System.out.println(classifier.classifyToString(s1));
    }

}
