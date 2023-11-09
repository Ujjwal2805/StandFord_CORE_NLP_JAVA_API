package org.example;

import com.sun.xml.bind.api.impl.NameConverter;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.nio.channels.Pipe;
import java.util.List;

public class SentenceRecognizer {



    public static void main(String Args[]){


        StanfordCoreNLP stanfordCoreNLP= Pipeline.getPipeline();

        String text="Hey I am ujjwal.  I work at KPMG as an technical consultant.";

        CoreDocument coreDocument=new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);

        List<CoreSentence> sentences= coreDocument.sentences();

        for(CoreSentence coreSentence: sentences){
            System.out.println(coreSentence);
        }




    }
}
