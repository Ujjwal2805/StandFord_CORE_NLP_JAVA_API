package org.example;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;
import java.util.Scanner;

public class Sentiment_Analysis {


    public static void main(String Args[]){


        StanfordCoreNLP stanfordCoreNLP= Pipeline.getPipeline();
        while(true) {
            String text;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter You text for classification");
            text = sc.nextLine();
            CoreDocument coreDocument = new CoreDocument(text);
            stanfordCoreNLP.annotate(coreDocument);

            List<CoreSentence> coreSentenceList = coreDocument.sentences();

            for (CoreSentence coreSentence : coreSentenceList) {

                String sentence = coreSentence.sentiment();
                System.out.println(coreSentence + " = " + sentence);
            }
        }





    }


}
