//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Pranav Rao

public class Number{
    private int theValue;
    
    public Number(int value){
        theValue = value;
    }   
    
    public int getValue(){
        return theValue;
    }
    
    public boolean equals(Object obj){
        if(((Number)obj).getValue() == theValue){
            return true;
        }
        return false;
    } 
    
    @Override
    public int hashCode(){
        return theValue % 10;
    }

    public String toString(){
        return "" + theValue;
    }   
}