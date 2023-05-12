//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Pranav Rao

public class WordTester{
    public static void main(String[] args){
    	Word one = new Word("45alligator");
    	System.out.println(one.hashCode());		//should out 4
    	
    	Word two = new Word("cat");
    	System.out.println(two.hashCode());		//should out 3
    	
    	Word three = new Word("whootit");
    	System.out.println(three.hashCode());	         //should out 1	
    	
    	Word four = new Word("alligator");
    	System.out.println(four.hashCode());	         // should out 6
    }
}