//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import static java.lang.System.*;

public class HashTableRunner{
  public static void main ( String[] args ){
	//make a new table			
	HashTable numTable = new HashTable();
	HashTable wordTable = new HashTable();
	//read from the file			
	int nums[] = {30,34,56,78,9,12,23,43,45,78,98,76,65,54,43,21,1,2,3,4,5,6,7,8,9,11,10,1,2,3,4};	
	String words[] = {"one", "two", "dog", "cat", "chicken", "pig", "owl", "jump", "run", "hop", "shortcut", 
	"ferret", "goat", "hootowl", "go", "alligator", "onimonapia", "food", "a"};
	//load stuff into the table			
	for(int i =0; i < nums.length; i++){
           Number holder = new Number(nums[i]);
           numTable.addNum(holder);
	}
	for(int i = 0; i < words.length; i++){
	   Word holder = new Word(words[i]);
	   wordTable.addWord(holder);
	}
	//print out the table
	System.out.println("Number Lab");
	System.out.println(numTable);
	System.out.println("\n\nWord Lab");
	System.out.println(wordTable);
  }
}