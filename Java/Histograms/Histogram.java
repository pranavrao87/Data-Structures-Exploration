//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class Histogram{
    private Map<String,Integer> histogram;
    
    public Histogram( String line ){
        histogram = new TreeMap<String, Integer>();
        for(int i = 0; i < line.length(); i++){
            if(histogram.containsKey(Character.toString(line.charAt(i)))){
                histogram.put(Character.toString(line.charAt(i)), histogram.get(Character.toString(line.charAt(i)))+1);
            }
            else{
                histogram.put(Character.toString(line.charAt(i)), 1);
            }
        }
    }
    
    public int getValue( String s ){
        return histogram.get(s);
    }
    
    public String toString(){
        String output="char     1---5----10----15\n";
        for(String i : histogram.keySet()){
            int count = getValue(i);
            output += i + "        ";
            for(int j = 0; j < count; j++){
                output += "*";
            }
            output += "\n";
        }
        return output+"\n\n";        
    }
}