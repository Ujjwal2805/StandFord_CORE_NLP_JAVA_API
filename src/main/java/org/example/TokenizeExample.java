package org.example;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class TokenizeExample {


    public static void main(String Args[]){


        StanfordCoreNLP stanfordCoreNLP= Pipeline.getPipeline();

        String text="This is my text ! can we tokenize it.";

        CoreDocument coreDocument= new CoreDocument(text);


        //convert text into document and pass
        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel> coreLabelList= coreDocument.tokens();

        for(CoreLabel coreLabel: coreLabelList){

            System.out.println(coreLabel.originalText());
        }





    }
}
