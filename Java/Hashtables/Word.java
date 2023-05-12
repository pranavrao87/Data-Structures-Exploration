public class Word{
    private String theValue;
    
    //write a constructor method
    public Word(String w){
       theValue = w;
    }
    
    //write the getValue method
    public String getValue(){
       return theValue;
    }
    
    //write the equals method
    public boolean equals(Object obj){
        if(((Word)obj).getValue() == theValue){
            return true;
        }
        return false;
    }
    
    
    //write the hashCode method
    public int hashCode(){
        String vowels = "aeiou";
        int numVowels = 0;
        for(int i = 0; i < theValue.length(); i++){
            for(int j = 0; j < vowels.length(); j++){
                if(theValue.charAt(i) == vowels.charAt(j)){
                    numVowels += 1;
                }
            }
        }
        
        int hashNum = (theValue.length() * numVowels) % 10;
        return hashNum;
    }
    
    
    //write the toString method
    public String toString(){
        return theValue;
    }

	
}
