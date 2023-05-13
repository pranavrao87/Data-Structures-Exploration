class Custom{
    String value;
    Custom nextRef;

    public Custom(String v) {
        value = v;
        nextRef = null;
    }
}

public class Customlist
{
    Custom head;
    int len = 0;

    public Customlist(String data){
        head = new Custom(data);
        len++;
    }

    public void add(String data) {
        Custom newNode = new Custom(data);
        if(head == null){
            head = newNode;
        }
        else{
            Custom n = head;
            while(n.nextRef != null){
                n = n.nextRef;
            }
            n.nextRef = newNode;
        }
        len++;
    }
    
    public void add(int index, String data) {
        head = addRecursive(head, index, data);
        len++;
    }

    private Custom addRecursive(Custom node, int index, String data) {
        if (index == 0) {
            Custom newNode = new Custom(data);
            newNode.nextRef = node;
            return newNode;
        } else {
            node.nextRef = addRecursive(node.nextRef, index - 1, data);
            return node;
        }
    }

    /*
    public void add(int index,String data){
        Custom newNode = new Custom(data);
        Custom n = head;
        if(index == 0){
            head = newNode;
            newNode.nextRef = n;
            len++;
        }
        else{
            for(int i = 0; i < index-1; i++){
                n = n.nextRef;
            }
            newNode.nextRef = n.nextRef;
            n.nextRef = newNode;
            len++;
        }
    }
    */
   
   
    public void set(int i, String data){
        int counter = 0;
        Custom cNode = head;
        if (head.nextRef != null && i < len){
            while(counter < i){
                cNode = cNode.nextRef;
                counter++;
            }
        }
        cNode.value = data;
    }

    public String get(int i){
        int counter = 0;
        Custom cNode = head;
        if (head.nextRef != null && i < len){
            while(counter < i){
                cNode = cNode.nextRef;
                counter++;
            }
        }
        return cNode.value;
    }

    public void remove(int i)
    {

        Custom cNode = head;
        Custom prevNode = head;
        int counter = 0;

        if (i == 0 && cNode != null) {

            head = cNode.nextRef;
            prevNode.nextRef = null;

            len--;
        }

        else if (cNode != null){
            while (cNode != null) {

                if(counter == i) {
                    prevNode.nextRef = cNode.nextRef;
                    cNode.nextRef = null;
                    break;
                }
                else{
                    prevNode = cNode;
                    cNode = cNode.nextRef;
                    counter++;
                }
            }
            len--;
        }
    }

    public int size(){
        return len;
    }
    public String toString(){
        String s = "CustomList = ";
        if (len == 0){
            return "empty";
        }
        Custom cNode = head;

        while(cNode.nextRef != null){
            s += cNode.value + " ";
            cNode = cNode.nextRef;
        }
        s += cNode.value;
        return s;
    }
}