class Custom{
    String value;
    Custom nextRef;

    public Custom(String v) {
        value = v;
        nextRef = null;
    }
}

public class CustomList
{
    Custom head;
    int len = 0;

    public CustomList(String data){
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
    //Helper method to help iterate through the linked list recursively
    //only used for add(index, string) method
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

   
    public void set(int i, String d){
        int c = 0;
        Custom setNode = head;
        if (head.nextRef != null && i < len){
            while(c < i){
                setNode = setNode.nextRef;
                c++;
            }
        }
        setNode.value = d;
    }

    public String get(int i){
        int c = 0;
        Custom getNode = head;
        if (head.nextRef != null && i < len){
            while(c < i){
                getNode = getNode.nextRef;
                c++;
            }
        }
        return getNode.value;
    }

      
    public void remove(int index) {
        if (index < 0 || index >= len) {
            throw new IndexOutOfBoundsException();
        }
    
        head = removeRec(head, index);
        len--;
    }
    //Helper method to help iterate through the linked list recursively
    //only used for remove(index, string) method
    private Custom removeRec(Custom current, int index) {
        if (index == 0) {
            Custom nextNode = current.nextRef;
            current.nextRef = null;
            return nextNode;
        } else {
            current.nextRef = removeRec(current.nextRef, index - 1);
            return current;
        }
    }

    public int size(){
        return len;
    }
   
    public String toString(){
        String output = "CustomList = [";
        Custom tempNode = head;
        while(tempNode.nextRef != null){
            output += tempNode.value + ", ";
            tempNode = tempNode.nextRef;
        }
        output += tempNode.value;
        output += "]";
        return output;
    }
}