package org.example;


import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.Properties;

public class Pipeline
{

    private static StanfordCoreNLP stanfordCoreNLP;
    private static String propertiesName="tokenize, ssplit, pos, lemma, ner , parse, sentiment";

    private static Properties properties;

    private Pipeline(){

    }

    static {
        properties= new Properties();
        properties.setProperty("annotators",propertiesName);
    }

    public static StanfordCoreNLP getPipeline(){
        if(stanfordCoreNLP==null){
             stanfordCoreNLP= new StanfordCoreNLP(properties);
        }
         return stanfordCoreNLP;
    }


}
