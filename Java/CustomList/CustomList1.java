public class CustomList1{
    private Custom head;
    private int size;

    public CustomList1() {
        this.head = null;
        this.size = 0;
    }

    public void add(String content) {
        Custom newCustom = new Custom(content);
        if (head == null) {
            head = newCustom;
        } else {
            Custom current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newCustom);
        }
        size++;
    }

    public void add(int index, String content) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Custom newCustom = new Custom(content);
        if (index == 0) {
            newCustom.setNext(head);
            head = newCustom;
        } else {
            Custom previous = head;
            for (int i = 0; i < index - 1; i++) {
                previous = previous.getNext();
            }
            newCustom.setNext(previous.getNext());
            previous.setNext(newCustom);
        }
        size++;
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Custom current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getContent();
    }

    public String set(int index, String content) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Custom current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        String oldContent = current.getContent();
        current.setContent(content);
        return oldContent;
    }

    public String remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        String removedContent;
        if (index == 0) {
            removedContent = head.getContent();
            head = head.getNext();
        } else {
            Custom previous = head;
            for (int i = 0; i < index - 1; i++) {
                previous = previous.getNext();
            }
            Custom current = previous.getNext();
            removedContent = current.getContent();
            previous.setNext(current.getNext());
        }
        size--;
        return removedContent;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Custom current = head;
        while (current != null) {
            sb.append(current.getContent());
            if (current.getNext() != null) {
                sb.append(", ");
            }
        }
        return sb;
    }
}