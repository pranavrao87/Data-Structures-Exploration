//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Pranav Rao

import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;

public class HashTable
{
    private LinkedList[] table;

    public HashTable(){
        table = new LinkedList[10];
        for(int i = 0; i < table.length; i++){
            table[i] = new LinkedList();
        }
    }

    public void addNum(Object obj){
        int num = ((Number)obj).getValue();
        int hC = ((Number)obj).hashCode();
        table[hC].add(num);
    }
    
    public void addWord(Object obj){
        String word = ((Word) obj).getValue();
        int hashcode = ((Word) obj).hashCode();
        table[hashcode].add(word);
    }

    public String toString(){        
        String output = "HASHTABLE\nbucket ";
               
        for(int i = 0; i < table.length; i++){
            output += i;
            for(int j = 0; j < table[i].size(); j++){
                output += " --> " + table[i].get(j) ;
            }
            if(i != table.length -1){
                output += "\nbucket ";
            }
        }    
        return output;
    }
}