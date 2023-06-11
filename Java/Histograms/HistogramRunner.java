//(c) A+ Computer Science
//www.apluscompsci.com

public class HistogramRunner{
    public static void main( String args[] ){
        String test1 = "abcdefghiacdeghihk";
        Histogram a = new Histogram(test1);
        System.out.println(test1);
        System.out.println(a.getValue("a"));
        System.out.println(a.getValue("h"));
        System.out.println("\n");
        
        String test2 = "12345612345131234";
        Histogram b = new Histogram(test2);
        System.out.println(test2);
        System.out.println(b.getValue("1"));
        System.out.println(b.getValue("6"));
        System.out.println("\n");

        String test3 = "YUIOQWERTY";
        Histogram c = new Histogram(test3);
        System.out.println(test3);
        System.out.println(c.getValue("Y"));
        System.out.println(c.getValue("T"));
        System.out.println("\n");

        String test4 = "4T#@^###";
        Histogram d = new Histogram(test4); 
        System.out.println(test4);
        System.out.println(d.getValue("#"));

        //LAB #2
        System.out.println("\n");
        System.out.println(a);
        System.out.println();
        System.out.println(b);
        System.out.println();
        System.out.println(c);
        System.out.println();
        System.out.println(d);
    }
}