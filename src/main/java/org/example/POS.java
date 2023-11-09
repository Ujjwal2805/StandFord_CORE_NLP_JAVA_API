package org.example;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class POS {

    //part of speech


    public static void main(String Args[]){


        StanfordCoreNLP stanfordCoreNLP= Pipeline.getPipeline();

        String text="Hey I am ujjwal.  I work at KPMG as an technical consultant.";

        CoreDocument coreDocument=new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel> coreLabelList= coreDocument.tokens();

        for(CoreLabel coreLabel: coreLabelList){

            String pos= coreLabel.get(CoreAnnotations.PartOfSpeechAnnotation.class);
                            System.out.println(coreLabel.originalText()+ " = "+ pos);
            }






    }



}
