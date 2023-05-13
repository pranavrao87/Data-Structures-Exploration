public class Custom {
    private String content;
    private Custom next;

    public Custom(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Custom getNext() {
        return next;
    }

    public void setNext(Custom next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return content;
    }
}

